package net.mooctest;
/**
 * 对 Square 块密码的密码反馈 （CFB） 支持。
 *
 * @author 由 Paulo Barreto <pbarreto@nw.com.br> 实施的公有领域
 *
 * 版本 2.1 （1997.08.11）
 *
 * =============================================================================
 *
 * 与 2.0 版 （1997.07.28） 的差异
 *
 * -- 修复了解密方法（偏移量有时是错误的）。
 *
 * =============================================================================
 *
 * 本软件由作者“按原样”和任何快递提供
 * 或默示保证，包括但不限于默示
 * 适销性和特定用途适用性的保证
 * 被否认。 在任何情况下，作者或投稿人都不得
 * 对任何直接、间接、附带、特殊、惩戒性或
 * 间接损害赔偿（包括但不限于采购
 * 替代商品或服务;使用、数据或利润损失;或
 * 业务中断），无论原因如何，以及基于任何责任理论，
 * 无论是合同、严格责任还是侵权行为（包括疏忽）
 * 或其他原因）因使用本软件而引起的，
 * 即使被告知此类损害的可能性。
 *
 */

public final class SquareCfb implements SquareMode {

    private Square sq;
	private final byte[] mask = new byte[Square.BLOCK_LENGTH];
	private int avail = 0; // number of available mask bytes


    public final void setKey (byte[] key)
    {
        sq = new Square (key);
        for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
            mask[i] = 0;
        }
        avail = 0;
    } // setKey


    public final void setIV (byte[] iv)
    {
        System.arraycopy (iv, 0, mask, 0, Square.BLOCK_LENGTH);
        avail = 0;
    } // setIV


    public final void encrypt (byte[] buf, int off, int len)
    {
    	// if there are enough available mask bytes
    	// to encrypt the whole buffer, just use them:
    	if (len <= avail) {
    		for (int i = Square.BLOCK_LENGTH - avail, m = len; m-- > 0; i++, off++) {
    			buf[off] = (byte)(mask[i] ^= buf[off]);
    		}
    		avail -= len;
    		return;
    	}
    	// use all available (always 0 to Square.BLOCK_LENGTH-1)
    	// mask bytes to encrypt the first bytes of the buffer:
    	for (int i = Square.BLOCK_LENGTH - avail; i < Square.BLOCK_LENGTH; i++, off++) {
    		buf[off] = (byte)(mask[i] ^= buf[off]);
    	}
    	len -= avail;
    	// encrypt the middle of the buffer in blocks of Square.BLOCK_LENGTH bytes:
    	while (len > Square.BLOCK_LENGTH) {
    		sq.blockEncrypt (mask, 0, mask, 0);
    		for (int i = 0; i < Square.BLOCK_LENGTH; i++, off++) {
    		    buf[off] = (byte)(mask[i] ^= buf[off]);
    		}
    		len -= Square.BLOCK_LENGTH;
    	}
    	// encrypt the last (always 1 to Square.BLOCK_LENGTH) bytes:
    	sq.blockEncrypt (mask, 0, mask, 0);
    	for (int i = 0; i < len; i++, off++) {
   		    buf[off] = (byte)(mask[i] ^= buf[off]);
    	}
    	avail = Square.BLOCK_LENGTH - len;
    } // encrypt


    public final void decrypt (byte[] buf, int off, int len)
    {
    	// if there are enough available mask bytes
    	// to decrypt the whole buffer, just use them:
    	if (len <= avail) {
    		for (int i = Square.BLOCK_LENGTH - avail, m = len; m-- > 0; i++) {
    		    mask[i] ^= buf[off++] ^= mask[i];
    		}
    		avail -= len;
    		return;
    	}
    	// use all available (always 0 to Square.BLOCK_LENGTH-1)
    	// mask bytes to decrypt the first bytes of the buffer:
    	for (int i = Square.BLOCK_LENGTH - avail; i < Square.BLOCK_LENGTH; i++) {
    		mask[i] ^= buf[off++] ^= mask[i];
    	}
    	len -= avail;
    	// decrypt the middle of the buffer in blocks of Square.BLOCK_LENGTH bytes:
    	while (len > Square.BLOCK_LENGTH) {
    	    sq.blockEncrypt (mask, 0, mask, 0);
    		for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
    		    mask[i] ^= buf[off++] ^= mask[i];
    		}
    		len -= Square.BLOCK_LENGTH;
    	}
    	// decrypt the last (always 1 to Square.BLOCK_LENGTH) bytes:
    	sq.blockEncrypt (mask, 0, mask, 0);
    	for (int i = 0; i < len; i++) {
    		mask[i] ^= buf[off++] ^= mask[i];
    	}
    	avail = Square.BLOCK_LENGTH - len;
    } // decrypt


    protected final void finalize ()
        throws Throwable
    {
        for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
            mask[i] = 0;
        }
        avail = 0;
        super.finalize ();
    } // finalize

} // SquareCfb
