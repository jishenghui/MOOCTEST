package net.mooctest;
/**
 * 电子密码本 （ECB） 支持 Square 分组密码。
 *
 * @author 由 Paulo Barreto <pbarreto@nw.com.br> 实施的公有领域
 *
 * 版本 2.1 （1997.08.11）
 *
 * =============================================================================
 *
 * 与 2.0 版 （1997.07.28） 的差异
 *
 * -- 只是对 loop 形式的基本外观更改。
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

public final class SquareEcb implements SquareMode {

    private Square sq;


    public final void setKey (byte[] key)
    {
        sq = new Square (key);
    } // setKey


    public final void setIV (byte[] iv)
    {
        // nothing to do...
    } // setKey


    public final void encrypt (byte buf[], int off, int len)
    {
        while (len > 0) {
    		sq.blockEncrypt (buf, off, buf, off);
    		off += Square.BLOCK_LENGTH;
    		len -= Square.BLOCK_LENGTH;
    	}
    } // encrypt


    public final void decrypt (byte buf[], int off, int len)
    {
        while (len > 0) {
    		sq.blockDecrypt (buf, off, buf, off);
    		off += Square.BLOCK_LENGTH;
    		len -= Square.BLOCK_LENGTH;
    	}
    } // decrypt

} // SquareEcb
