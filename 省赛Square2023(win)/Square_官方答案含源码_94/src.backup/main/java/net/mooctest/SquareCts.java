package net.mooctest;
/**

 * Ciphertext stealing (CTS) support for the Square block cipher.
 *
 * @author Public domain implementation by Paulo Barreto <pbarreto@nw.com.br>
 *
 * Version 2.1 (1997.08.11)
 *
 * =============================================================================
 *
 * Differences from version 2.0 (1997.07.28)
 *
 * -- Fixed the decryption method (ciphertext stealing offset was wrong).
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
