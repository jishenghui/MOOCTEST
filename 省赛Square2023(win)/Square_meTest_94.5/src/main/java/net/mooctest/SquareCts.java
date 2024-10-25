package net.mooctest;
/**

* 对 Square 分组密码的密文窃取 （CTS） 支持。
 *
 * @author 由 Paulo Barreto <pbarreto@nw.com.br> 实施的公有领域
 *
 * 版本 2.1 （1997.08.11）
 *
 * =============================================================================
 *
 * 与 2.0 版 （1997.07.28） 的差异
 *
 * -- 修复解密方式（密文窃取偏移错误）。
 * -- 略微更改了 Loop 形式以提高速度。
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

import java.lang.*;

public final class SquareCts implements SquareMode {

    private Square sq;
	private final byte[] mask = new byte[Square.BLOCK_LENGTH];


    public final void setKey (byte[] key)
    	// throws IndexOutOfBoundsException
    {
        sq = new Square (key);
        for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
            mask[i] = 0;
        }
    } // setKey


    public final void setIV (byte[] iv)
    	// throws IndexOutOfBoundsException
    {
        System.arraycopy (iv, 0, mask, 0, Square.BLOCK_LENGTH);
    	// encrypt the IV so that possibility of correlation with ciphertext is avoided (this is done for compatibility with Pegwit):
    	sq.blockEncrypt (mask, 0, mask, 0);
    } // setIV


    public final void encrypt (byte[] buf, int off, int len)
    	// throws IndexOutOfBoundsException
    {
        if (len < Square.BLOCK_LENGTH) {
            throw new IndexOutOfBoundsException ();
        }
    	while (len >= Square.BLOCK_LENGTH) {
    		// mask and encrypt the current block:
    		for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
    		    buf[off + i] ^= mask[i];
    		}
    		sq.blockEncrypt (buf, off, buf, off);
    		for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
    		    mask[i] = buf[off++];
    		}
    		len -= Square.BLOCK_LENGTH;
    	}
        if (len != 0) {
            // mask the last, *incomplete* block:
            for (int i = 0; i < len; i++) {
                mask[i] ^= buf[off + i];
            }
            // encrypt the masking result:
    		sq.blockEncrypt (mask, 0, mask, 0);
    		// shift ciphertext pieces to suitable offsets:
    		System.arraycopy (buf, off - Square.BLOCK_LENGTH, buf, off, len);
    		System.arraycopy (mask, 0, buf, off - Square.BLOCK_LENGTH, Square.BLOCK_LENGTH);
        }
    } // encrypt


    public final void decrypt (byte[] buf, int off, int len)
    	// throws IndexOutOfBoundsException
    {
        if (len < Square.BLOCK_LENGTH) {
            throw new IndexOutOfBoundsException ();
        }
    	byte[] temp = new byte[Square.BLOCK_LENGTH];
    	while (len >= 2*Square.BLOCK_LENGTH) {
    	    for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
    	        temp[i] = buf[off + i];
    	    }
    		// decrypt and unmask the block:
    		sq.blockDecrypt (buf, off, buf, off);
    		for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
    		    buf[off++] ^= mask[i]; mask[i] = temp[i];
    	    }
    		len -= Square.BLOCK_LENGTH;
    	}
    	// now Square.BLOCK_LENGTH <= len < 2*Square.BLOCK_LENGTH;
    	// save the current block for chaining:
   		System.arraycopy (buf, off, temp, 0, Square.BLOCK_LENGTH);
        if (len > Square.BLOCK_LENGTH) {
    		// decrypt and unmask the last *incomplete* block:
    		sq.blockDecrypt (buf, off, buf, off);
    		for (int i = 0; i < len - Square.BLOCK_LENGTH; i++) {
    			// at this point, buf[off + Square.BLOCK_LENGTH + i] contains
    			// a cipherbyte, and buf[off + i] contains the exclusive-or of
    			// this cipherbyte with the corresponding plainbyte...
    			buf[off + i] ^= buf[off + Square.BLOCK_LENGTH + i] ^= buf[off + i];
    			// ... now buf[off + i] contains the pure cipherbyte and
    			// buf[off + Square.BLOCK_LENGTH + i] contains the plainbyte.
    		}
        }
		// decrypt and unmask the last *complete* block:
		sq.blockDecrypt (buf, off, buf, off);
		for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
		    buf[off++] ^= mask[i]; mask[i] = temp[i];
		}
    } // decrypt


    protected final void finalize ()
        throws Throwable
    {
        for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
            mask[i] = 0;
        }
        super.finalize ();
    } // finalize

} // SquareCts
