/**
 * Cipher block chaining (CBC) support for the Square block cipher.
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
package net.mooctest;
import java.lang.*;

public final class SquareCbc implements SquareMode {

    private Square sq;
	private final byte[] mask = new byte[Square.BLOCK_LENGTH];


    public final void setKey (byte[] key)
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
    } // setIV


    public final void encrypt (byte buf[], int off, int len)
    	// throws IndexOutOfBoundsException
    {
        while (len > 0) {
    		// mask and encrypt the current block:
    		for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
    		    buf[off + i] ^= mask[i];
    		}
    		sq.blockEncrypt (buf, off, buf, off);// selfEncrypting
    		for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
    		    mask[i] = buf[off++];
    		}
    		len -= Square.BLOCK_LENGTH;
    	}
    } // encrypt


    public final void decrypt (byte buf[], int off, int len)
    	// throws IndexOutOfBoundsException
    {
    	byte[] temp = new byte[Square.BLOCK_LENGTH];

        while (len > 0) {
    		// decrypt and unmask the block:
    		for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
    		    temp[i] = buf[off + i];
    		}
    		sq.blockDecrypt (buf, off, buf, off);
    		for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
    		    buf[off++] ^= mask[i]; mask[i] = temp[i];
    		}
    		len -= Square.BLOCK_LENGTH;
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

} // SquareCbc
