package net.mooctest;
/**
 * Output feedback (OFB) support for the Square block cipher.
 *
 * @author Public domain implementation by Paulo Barreto <pbarreto@nw.com.br>
 *
 * Version 2.1 (1997.08.11)
 *
 * =============================================================================
 *
 * Differences from version 2.0 (1997.07.28)
 *
 * -- Slightly changed the loop form to increase speed.
 *
 * =============================================================================
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ''AS IS'' AND ANY EXPRESS
 * OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
 * BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

public final class SquareOfb implements SquareMode {

    private Square sq;
	private final byte[] mask = new byte[Square.BLOCK_LENGTH];
	private int avail = 0; // number of available mask bytes


    public final void setKey (byte[] key)
    	// throws IndexOutOfBoundsException
    {
        sq = new Square (key);
        for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
            mask[i] = 0;
        }
        avail = 0;
    } // setKey


    public final void setIV (byte[/*Square.BLOCK_LENGTH*/] iv)
    	// throws IndexOutOfBoundsException
    {
        System.arraycopy (iv, 0, mask, 0, Square.BLOCK_LENGTH);
        avail = 0;
    } // setIV


    public final void encrypt (byte[] buf, int off, int len)
    {
//    	如果有足够的可用掩码字节
//    	要加密整个缓冲区，只需使用它们：
    	if (len <= avail) {
    		for (int i = Square.BLOCK_LENGTH - avail, m = len; m-- > 0; i++) {
    			buf[off++] ^= mask[i];
    		}
    		avail -= len;
    		return;
    	}
//    	使用所有可用 （始终为 0 到 Square.BLOCK_LENGTH-1）
//    	mask bytes 来加密缓冲区的第一个字节：
    	for (int i = Square.BLOCK_LENGTH - avail; i < Square.BLOCK_LENGTH; i++) {
    		buf[off++] ^= mask[i];
    	}
    	len -= avail;
    	// encrypt the middle of the buffer in blocks of Square.BLOCK_LENGTH bytes:
    	while (len > Square.BLOCK_LENGTH) {
    		sq.blockEncrypt (mask, 0, mask, 0);
    		for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
    		    buf[off++] ^= mask[i];
    		}
    		len -= Square.BLOCK_LENGTH;
    	}
//    	加密最后一个 len（始终为 1 到 Square.BLOCK_LENGTH）字节：
   		sq.blockEncrypt (mask, 0, mask, 0);
    	for (int i = 0; i < len; i++) {
   		    buf[off++] ^= mask[i];
    	}
    	avail = Square.BLOCK_LENGTH - len;
    } // encrypt


    public final void decrypt (byte[] buf, int off, int len)
    {
        encrypt (buf, off, len);
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

} // SquareOfb
