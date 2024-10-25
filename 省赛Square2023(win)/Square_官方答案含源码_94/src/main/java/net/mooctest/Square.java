/**
 * This class implements the Square block cipher.
 *
 * <P>
 * <b>References</b>
 *
 * <P>
 * The Square algorithm was developed by <a href="mailto:Daemen.J@banksys.com">Joan Daemen</a>
 * and <a href="mailto:vincent.rijmen@esat.kuleuven.ac.be">Vincent Rijmen</a>, and is
 * in the public domain.
 *
 * See
 *      J. Daemen, L.R. Knudsen, V. Rijmen,
 *      "The block cipher Square,"
 *      <cite>Fast Software Encryption Haifa Security Workshop Proceedings</cite>,
 *      LNCS, E. Biham, Ed., Springer-Verlag, to appear.
 *
 * <P>
 * @author  This public domain Java implementation was written by
 * <a href="mailto:pbarreto@nw.com.br">Paulo S.L.M. Barreto</a> based on C software
 * originally written by Vincent Rijmen.
 *
 * @version 2.1 (1997.08.11)
 *
 * =============================================================================
 *
 * Differences from version 2.0 (1997.07.28)
 *
 * -- Simplified the static initialization by directly using the coefficients of
 *    the diffusion polynomial and its inverse (as chosen in the defining paper)
 *    instead of generating the full diffusion and inverse diffusion matrices
 *    G[][] and iG[][].  This avoids the burden of the matrix inversion code.
 * -- Generalized the code to an arbitrary number of rounds by explicitly
 *    computing the round offsets and explicitly looping the round function.
 * -- Simplified the mappings between byte arrays and Square data blocks.
 *    Together with the other changes, this reduces bytecode size to 3.3K and
 *    increases encryption/decryption speed by 50%.
 *
 * =============================================================================
 *
 * Differences from version 1.0 (1997.07.20)
 *
 * -- Replaced initialized tables by static code to compute them.  Now not only
 *    is the bytecode smaller (shrinked from 20K down to 5K), but the algorithm
 *    presentation is closer to the defining paper.
 *
 * =============================================================================
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHORS ''AS IS'' AND ANY EXPRESS
 * OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE AUTHORS OR CONTRIBUTORS BE
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

public final class Square {

    public  static final int BLOCK_LENGTH = 16;
    public  static final int KEY_LENGTH = BLOCK_LENGTH;
    private static final int R = 8; // number of rounds

    private static final int[] offset = new int[R];
    private static final int[] phi = new int[256];
    private static final int[] Se = new int[256];
    private static final int[] Sd = new int[256];
    private static final int[] Te = new int[256];
    private static final int[] Td = new int[256];

    private final int[][] roundKeys_e = new int[R+1][4];
    private final int[][] roundKeys_d = new int[R+1][4];


    ////////////////////////////////////////////////////////////////////////////

    private static final int ROOT = 0x1f5;
    private static final int[] exp = new int[256];
    private static final int[] log = new int[256];


    private static final int mul (int a, int b)
        // multiply two elements of GF(2**8)
    {
        return (a == 0 || b == 0) ? 0 :
            exp[(log[a] + log[b]) % 255];
    } // mul


    static {
        /* produce log and exp, needed for multiplying in the field GF(2**8):
         */
        exp[0] = exp[255] = 1;
        log[1] = 0;
        for (int i = 1; i < 255; i++) {
            int j = exp[i - 1] << 1; // 0x02 is used as generator (mod ROOT)
            if (j >= 256) {
                j ^= ROOT; // reduce j (mod ROOT)
            }
            exp[i] = j;
            log[j] = i;
        }

        /* compute the substitution box Se[] and its inverse Sd[]
         * based on F(x) = x**{-1} plus affine transform of the output
         */
        Se[0] = 0;
        for (int i = 1; i < 256; i++) {
            Se[i] = exp[255 - log[i]]; // Se[i] = i^{-1}, i.e. mul(Se[i], i) == 1
        }
        /* the selection criterion for the actual affine transform is that
         * the bit matrix corresponding to its linear has a triangular structure:
           0x01     00000001
           0x03     00000011
           0x05     00000101
           0x0f     00001111
           0x1f     00011111
           0x3d     00111101
           0x7b     01111011
           0xd6     11010110
         */
        int[] trans = {0x01, 0x03, 0x05, 0x0f, 0x1f, 0x3d, 0x7b, 0xd6};
        for (int i = 0; i < 256; i++) {
            /* let Se[i] be represented as an 8-row vector V over GF(2);
             * the affine transformation is A*V + T, where the rows of
             * the 8x8 matrix A are contained in trans[0]...trans[7] and
             * the 8-row vector T is contained in trans[8] above.
             */
            int v = 0xb1; // this is the affine part of the transform
            for (int t = 0; t < 8; t++) {
                // column-wise multiplication over GF(2):
                int u = Se[i] & trans[t];
                // sum over GF(2) of all bits of u:
                u ^= u >> 4; u ^= u >> 2; u ^= u >> 1; u &= 1;
                // row alignment of the result:
                v ^= u << t;
            }
            Se[i] = v;
            Sd[v] = i; // inverse substitution box
        }
        /* diffusion and inverse diffusion polynomials:
         * by definition (cf. "The block cipher Square", section 2.1),
         * c(x)d(x) = 1 (mod 1 + x**4)
         * where the polynomial coefficients are taken from GF(2**8);
         * the actual polynomial and its inverse are:
         * c(x) = 3.x**3 + 1.x**2 + 1.x + 2
         * d(x) = B.x**3 + D.x**2 + 9.x + E
         */
        int[] c = {0x2, 0x1, 0x1, 0x3};
        int[] d = {0xE, 0x9, 0xD, 0xB};

        /* substitution/diffusion layers and key schedule transform:
         */
        int v;
        for (int t = 0; t < 256; t++) {
            phi[t] =
                mul (t, c[3]) << 24 ^
                mul (t, c[2]) << 16 ^
                mul (t, c[1]) <<  8 ^
                mul (t, c[0]);
            v = Se[t];
            Te[t] = (Se[t & 3] == 0) ? 0 :
                mul (v, c[3]) << 24 ^
                mul (v, c[2]) << 16 ^
                mul (v, c[1]) <<  8 ^
                mul (v, c[0]);
            v = Sd[t];
            Td[t] = (Sd[t & 3] == 0) ? 0 :
                mul (v, d[3]) << 24 ^
                mul (v, d[2]) << 16 ^
                mul (v, d[1]) <<  8 ^
                mul (v, d[0]);
        }
        /* offset table:
         */
        offset[0] = 0x1;
        for (int i = 1; i < R; i++) {
            offset[i] = mul (offset[i - 1], 0x2);
        }
    } // static


    ////////////////////////////////////////////////////////////////////////////


    private static final int rotr (int x, int s)
    {
        return (x >>> s) | (x <<  (32 - s));
    } // rotr


    private static final int rotl (int x, int s)
    {
        return (x <<  s) | (x >>> (32 - s));
    } // rotl


    /* apply the theta function to a round key:
     */
    private final void transform (int[] roundKey)
    {
    	roundKey[0] = phi[(roundKey[0]       ) & 0xff] ^
        		rotl (phi[(roundKey[0] >>>  8) & 0xff],  8) ^
        		rotl (phi[(roundKey[0] >>> 16) & 0xff], 16) ^
        		rotl (phi[(roundKey[0] >>> 24) & 0xff], 24);
    	roundKey[1] = phi[(roundKey[1]       ) & 0xff] ^
        		rotl (phi[(roundKey[1] >>>  8) & 0xff],  8) ^
        		rotl (phi[(roundKey[1] >>> 16) & 0xff], 16) ^
        		rotl (phi[(roundKey[1] >>> 24) & 0xff], 24);
    	roundKey[2] = phi[(roundKey[2]       ) & 0xff] ^
        		rotl (phi[(roundKey[2] >>>  8) & 0xff],  8) ^
        		rotl (phi[(roundKey[2] >>> 16) & 0xff], 16) ^
        		rotl (phi[(roundKey[2] >>> 24) & 0xff], 24);
    	roundKey[3] = phi[(roundKey[3]       ) & 0xff] ^
        		rotl (phi[(roundKey[3] >>>  8) & 0xff],  8) ^
        		rotl (phi[(roundKey[3] >>> 16) & 0xff], 16) ^
        		rotl (phi[(roundKey[3] >>> 24) & 0xff], 24);
    } // transform


    /**
     * This creates a Square block cipher from a byte array user key.
     * @param key   The 128-bit user key.
     */
    public Square (byte[] key)
    {
        // map user key to first round key:
        for (int i = 0; i < 16; i += 4) {
            roundKeys_e[0][i >> 2] =
                ((int)key[i    ] & 0xff)       |
                ((int)key[i + 1] & 0xff) <<  8 |
                ((int)key[i + 2] & 0xff) << 16 |
                ((int)key[i + 3] & 0xff) << 24;
        }
    	for (int t = 1; t <= R; t++) {
    		// apply the key evolution function:
    		roundKeys_d[R-t][0] = roundKeys_e[t][0] = roundKeys_e[t-1][0] ^ rotr (roundKeys_e[t-1][3], 8) ^ offset[t-1];
    		roundKeys_d[R-t][1] = roundKeys_e[t][1] = roundKeys_e[t-1][1] ^ roundKeys_e[t][0];
    		roundKeys_d[R-t][2] = roundKeys_e[t][2] = roundKeys_e[t-1][2] ^ roundKeys_e[t][1];
    		roundKeys_d[R-t][3] = roundKeys_e[t][3] = roundKeys_e[t-1][3] ^ roundKeys_e[t][2];
    		// apply the theta diffusion function:
    		transform (roundKeys_e[t-1]);
    	}
    	for (int i = 0; i < 4; i++) {
    	    roundKeys_d[R][i] = roundKeys_e[0][i];
    	}
    } // Square


    /**
     * The round function to transform an intermediate data block <code>block</code> with
     * the substitution-diffusion table <code>T</code> and the round key <code>roundKey</code>
     * @param   block       the data block
     * @param   T           the substitution-diffusion table
     * @param   roundKey    the 128-bit round key
     */
    private final void round (int[] block, int[] T, int[] roundKey)
    {
        int t0, t1, t2, t3;

        t0 = block[0];
        t1 = block[1];
        t2 = block[2];
        t3 = block[3];

    	block[0] =  T[(t0       ) & 0xff]
			^ rotl (T[(t1       ) & 0xff],  8)
			^ rotl (T[(t2       ) & 0xff], 16)
			^ rotl (T[(t3       ) & 0xff], 24)
			^ roundKey[0];
    	block[1] =  T[(t0 >>>  8) & 0xff]
			^ rotl (T[(t1 >>>  8) & 0xff],  8)
			^ rotl (T[(t2 >>>  8) & 0xff], 16)
			^ rotl (T[(t3 >>>  8) & 0xff], 24)
    		^ roundKey[1];
    	block[2] =  T[(t0 >>> 16) & 0xff]
			^ rotl (T[(t1 >>> 16) & 0xff],  8)
			^ rotl (T[(t2 >>> 16) & 0xff], 16)
			^ rotl (T[(t3 >>> 16) & 0xff], 24)
    		^ roundKey[2];
    	block[3] =  T[(t0 >>> 24) & 0xff]
			^ rotl (T[(t1 >>> 24) & 0xff],  8)
			^ rotl (T[(t2 >>> 24) & 0xff], 16)
			^ rotl (T[(t3 >>> 24) & 0xff], 24)
    		^ roundKey[3];

        // destroy potentially sensitive information:
        t0 = t1 = t2 = t3 = 0;
    } // round


    /**
     * Encrypt a block.
     * The in and out buffers can be the same.
     * @param in            The data to be encrypted.
     * @param in_offset     The start of data within the in buffer.
     * @param out           The encrypted data.
     * @param out_offset    The start of data within the out buffer.
     */
    public final void blockEncrypt (byte in[], int in_offset, byte out[], int out_offset)
    {
        int[] block = new int[4];

        // map byte array to block and add initial key:
        for (int i = 0; i < 4; i++) {
            block[i] =
                ((int)in[in_offset++] & 0xff)       ^
                ((int)in[in_offset++] & 0xff) <<  8 ^
                ((int)in[in_offset++] & 0xff) << 16 ^
                ((int)in[in_offset++] & 0xff) << 24 ^
                roundKeys_e[0][i];
        }

    	// R - 1 full rounds:
    	for (int r = 1; r < R; r++) {
        	round (block, Te, roundKeys_e[r]);
    	}

    	// last round (diffusion becomes only transposition):
    	round (block, Se, roundKeys_e[R]);

        // map block to byte array:
        for (int i = 0; i < 4; i++) {
            int w = block[i];
            out[out_offset++] = (byte)(w       );
            out[out_offset++] = (byte)(w >>>  8);
            out[out_offset++] = (byte)(w >>> 16);
            out[out_offset++] = (byte)(w >>> 24);
        }

    } // blockEncrypt


    /**
     * Decrypt a block.
     * The in and out buffers can be the same.
     * @param in            The data to be decrypted.
     * @param in_offset     The start of data within the in buffer.
     * @param out           The decrypted data.
     * @param out_offset    The start of data within the out buffer.
     */
    public final void blockDecrypt (byte in[], int in_offset, byte out[], int out_offset)
    {
        int[] block = new int[4];

        // map byte array to block and add initial key:
        for (int i = 0; i < 4; i++) {
            block[i] =
                ((int)in[in_offset++] & 0xff)       ^
                ((int)in[in_offset++] & 0xff) <<  8 ^
                ((int)in[in_offset++] & 0xff) << 16 ^
                ((int)in[in_offset++] & 0xff) << 24 ^
                roundKeys_d[0][i];
        }

    	// R - 1 full rounds:
    	for (int r = 1; r < R; r++) {
        	round (block, Td, roundKeys_d[r]);
    	}

    	// last round (diffusion becomes only transposition):
    	round (block, Sd, roundKeys_d[R]);

        // map block to byte array:
        int w;
        for (int i = 0; i < 4; i++) {
            w = block[i];
            out[out_offset++] = (byte)(w       );
            out[out_offset++] = (byte)(w >>>  8);
            out[out_offset++] = (byte)(w >>> 16);
            out[out_offset++] = (byte)(w >>> 24);
        }

    	// destroy sensitive data:
    	w = 0;
        for (int i = 0; i < 4; i++) {
            block[i] = 0;
        }
    } // blockDecrypt


    protected final void finalize ()
        throws Throwable
    {
        for (int r = 0; r <= R; r++) {
            for (int i = 0; i < 4; i++) {
                roundKeys_e[r][i] = roundKeys_d[r][i] = 0;
            }
        }
        super.finalize ();
    } // finalize

} // Square
