package net.mooctest;
/**
 * Electronic codebook (ECB) support for the Square block cipher.
 *
 * @author Public domain implementation by Paulo Barreto <pbarreto@nw.com.br>
 *
 * Version 2.1 (1997.08.11)
 *
 * =============================================================================
 *
 * Differences from version 2.0 (1997.07.28)
 *
 * -- Only an essentialy cosmetic change to the loop form.
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
