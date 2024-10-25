/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//**
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

public final class Square {public static class __CLR4_4_100lpnq5vgy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0036\u0030\u0031\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0053\u0071\u0075\u0061\u0072\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1701501669986L,8589935092L,148,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    {try{__CLR4_4_100lpnq5vgy.R.inc(0);
        __CLR4_4_100lpnq5vgy.R.inc(1);return ((((a == 0 || b == 0) )&&(__CLR4_4_100lpnq5vgy.R.iget(2)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(3)==0&false))? 0 :
            exp[(log[a] + log[b]) % 255];
    }finally{__CLR4_4_100lpnq5vgy.R.flushNeeded();}} // mul


    static {try{__CLR4_4_100lpnq5vgy.R.inc(4);
        /* produce log and exp, needed for multiplying in the field GF(2**8):
         */
        __CLR4_4_100lpnq5vgy.R.inc(5);exp[0] = exp[255] = 1;
        __CLR4_4_100lpnq5vgy.R.inc(6);log[1] = 0;
        __CLR4_4_100lpnq5vgy.R.inc(7);for (int i = 1; (((i < 255)&&(__CLR4_4_100lpnq5vgy.R.iget(8)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(9)==0&false)); i++) {{
            __CLR4_4_100lpnq5vgy.R.inc(10);int j = exp[i - 1] << 1; // 0x02 is used as generator (mod ROOT)
            __CLR4_4_100lpnq5vgy.R.inc(11);if ((((j >= 256)&&(__CLR4_4_100lpnq5vgy.R.iget(12)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(13)==0&false))) {{
                __CLR4_4_100lpnq5vgy.R.inc(14);j ^= ROOT; // reduce j (mod ROOT)
            }
            }__CLR4_4_100lpnq5vgy.R.inc(15);exp[i] = j;
            __CLR4_4_100lpnq5vgy.R.inc(16);log[j] = i;
        }

        /* compute the substitution box Se[] and its inverse Sd[]
         * based on F(x) = x**{-1} plus affine transform of the output
         */
        }__CLR4_4_100lpnq5vgy.R.inc(17);Se[0] = 0;
        __CLR4_4_100lpnq5vgy.R.inc(18);for (int i = 1; (((i < 256)&&(__CLR4_4_100lpnq5vgy.R.iget(19)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(20)==0&false)); i++) {{
            __CLR4_4_100lpnq5vgy.R.inc(21);Se[i] = exp[255 - log[i]]; // Se[i] = i^{-1}, i.e. mul(Se[i], i) == 1
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
        }__CLR4_4_100lpnq5vgy.R.inc(22);int[] trans = {0x01, 0x03, 0x05, 0x0f, 0x1f, 0x3d, 0x7b, 0xd6};
        __CLR4_4_100lpnq5vgy.R.inc(23);for (int i = 0; (((i < 256)&&(__CLR4_4_100lpnq5vgy.R.iget(24)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(25)==0&false)); i++) {{
            /* let Se[i] be represented as an 8-row vector V over GF(2);
             * the affine transformation is A*V + T, where the rows of
             * the 8x8 matrix A are contained in trans[0]...trans[7] and
             * the 8-row vector T is contained in trans[8] above.
             */
            __CLR4_4_100lpnq5vgy.R.inc(26);int v = 0xb1; // this is the affine part of the transform
            __CLR4_4_100lpnq5vgy.R.inc(27);for (int t = 0; (((t < 8)&&(__CLR4_4_100lpnq5vgy.R.iget(28)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(29)==0&false)); t++) {{
                // column-wise multiplication over GF(2):
                __CLR4_4_100lpnq5vgy.R.inc(30);int u = Se[i] & trans[t];
                // sum over GF(2) of all bits of u:
                __CLR4_4_100lpnq5vgy.R.inc(31);u ^= u >> 4; __CLR4_4_100lpnq5vgy.R.inc(32);u ^= u >> 2; __CLR4_4_100lpnq5vgy.R.inc(33);u ^= u >> 1; __CLR4_4_100lpnq5vgy.R.inc(34);u &= 1;
                // row alignment of the result:
                __CLR4_4_100lpnq5vgy.R.inc(35);v ^= u << t;
            }
            }__CLR4_4_100lpnq5vgy.R.inc(36);Se[i] = v;
            __CLR4_4_100lpnq5vgy.R.inc(37);Sd[v] = i; // inverse substitution box
        }
        /* diffusion and inverse diffusion polynomials:
         * by definition (cf. "The block cipher Square", section 2.1),
         * c(x)d(x) = 1 (mod 1 + x**4)
         * where the polynomial coefficients are taken from GF(2**8);
         * the actual polynomial and its inverse are:
         * c(x) = 3.x**3 + 1.x**2 + 1.x + 2
         * d(x) = B.x**3 + D.x**2 + 9.x + E
         */
        }__CLR4_4_100lpnq5vgy.R.inc(38);int[] c = {0x2, 0x1, 0x1, 0x3};
        __CLR4_4_100lpnq5vgy.R.inc(39);int[] d = {0xE, 0x9, 0xD, 0xB};

        /* substitution/diffusion layers and key schedule transform:
         */
        __CLR4_4_100lpnq5vgy.R.inc(40);int v;
        __CLR4_4_100lpnq5vgy.R.inc(41);for (int t = 0; (((t < 256)&&(__CLR4_4_100lpnq5vgy.R.iget(42)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(43)==0&false)); t++) {{
            __CLR4_4_100lpnq5vgy.R.inc(44);phi[t] =
                mul (t, c[3]) << 24 ^
                mul (t, c[2]) << 16 ^
                mul (t, c[1]) <<  8 ^
                mul (t, c[0]);
            __CLR4_4_100lpnq5vgy.R.inc(45);v = Se[t];
            __CLR4_4_100lpnq5vgy.R.inc(46);Te[t] = ((((Se[t & 3] == 0) )&&(__CLR4_4_100lpnq5vgy.R.iget(47)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(48)==0&false))? 0 :
                mul (v, c[3]) << 24 ^
                mul (v, c[2]) << 16 ^
                mul (v, c[1]) <<  8 ^
                mul (v, c[0]);
            __CLR4_4_100lpnq5vgy.R.inc(49);v = Sd[t];
            __CLR4_4_100lpnq5vgy.R.inc(50);Td[t] = ((((Sd[t & 3] == 0) )&&(__CLR4_4_100lpnq5vgy.R.iget(51)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(52)==0&false))? 0 :
                mul (v, d[3]) << 24 ^
                mul (v, d[2]) << 16 ^
                mul (v, d[1]) <<  8 ^
                mul (v, d[0]);
        }
        /* offset table:
         */
        }__CLR4_4_100lpnq5vgy.R.inc(53);offset[0] = 0x1;
        __CLR4_4_100lpnq5vgy.R.inc(54);for (int i = 1; (((i < R)&&(__CLR4_4_100lpnq5vgy.R.iget(55)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(56)==0&false)); i++) {{
            __CLR4_4_100lpnq5vgy.R.inc(57);offset[i] = mul (offset[i - 1], 0x2);
        }
    }}finally{__CLR4_4_100lpnq5vgy.R.flushNeeded();}} // static


    ////////////////////////////////////////////////////////////////////////////


    private static final int rotr (int x, int s)
    {try{__CLR4_4_100lpnq5vgy.R.inc(58);
        __CLR4_4_100lpnq5vgy.R.inc(59);return (x >>> s) | (x <<  (32 - s));
    }finally{__CLR4_4_100lpnq5vgy.R.flushNeeded();}} // rotr


    private static final int rotl (int x, int s)
    {try{__CLR4_4_100lpnq5vgy.R.inc(60);
        __CLR4_4_100lpnq5vgy.R.inc(61);return (x <<  s) | (x >>> (32 - s));
    }finally{__CLR4_4_100lpnq5vgy.R.flushNeeded();}} // rotl


    /* apply the theta function to a round key:
     */
    private final void transform (int[] roundKey)
    {try{__CLR4_4_100lpnq5vgy.R.inc(62);
    	__CLR4_4_100lpnq5vgy.R.inc(63);roundKey[0] = phi[(roundKey[0]       ) & 0xff] ^
        		rotl (phi[(roundKey[0] >>>  8) & 0xff],  8) ^
        		rotl (phi[(roundKey[0] >>> 16) & 0xff], 16) ^
        		rotl (phi[(roundKey[0] >>> 24) & 0xff], 24);
    	__CLR4_4_100lpnq5vgy.R.inc(64);roundKey[1] = phi[(roundKey[1]       ) & 0xff] ^
        		rotl (phi[(roundKey[1] >>>  8) & 0xff],  8) ^
        		rotl (phi[(roundKey[1] >>> 16) & 0xff], 16) ^
        		rotl (phi[(roundKey[1] >>> 24) & 0xff], 24);
    	__CLR4_4_100lpnq5vgy.R.inc(65);roundKey[2] = phi[(roundKey[2]       ) & 0xff] ^
        		rotl (phi[(roundKey[2] >>>  8) & 0xff],  8) ^
        		rotl (phi[(roundKey[2] >>> 16) & 0xff], 16) ^
        		rotl (phi[(roundKey[2] >>> 24) & 0xff], 24);
    	__CLR4_4_100lpnq5vgy.R.inc(66);roundKey[3] = phi[(roundKey[3]       ) & 0xff] ^
        		rotl (phi[(roundKey[3] >>>  8) & 0xff],  8) ^
        		rotl (phi[(roundKey[3] >>> 16) & 0xff], 16) ^
        		rotl (phi[(roundKey[3] >>> 24) & 0xff], 24);
    }finally{__CLR4_4_100lpnq5vgy.R.flushNeeded();}} // transform


    /**
     * This creates a Square block cipher from a byte array user key.
     * @param key   The 128-bit user key.
     */
    public Square (byte[] key)
    {try{__CLR4_4_100lpnq5vgy.R.inc(67);
        // map user key to first round key:
        __CLR4_4_100lpnq5vgy.R.inc(68);for (int i = 0; (((i < 16)&&(__CLR4_4_100lpnq5vgy.R.iget(69)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(70)==0&false)); i += 4) {{
            __CLR4_4_100lpnq5vgy.R.inc(71);roundKeys_e[0][i >> 2] =
                ((int)key[i    ] & 0xff)       |
                ((int)key[i + 1] & 0xff) <<  8 |
                ((int)key[i + 2] & 0xff) << 16 |
                ((int)key[i + 3] & 0xff) << 24;
        }
    	}__CLR4_4_100lpnq5vgy.R.inc(72);for (int t = 1; (((t <= R)&&(__CLR4_4_100lpnq5vgy.R.iget(73)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(74)==0&false)); t++) {{
    		// apply the key evolution function:
    		__CLR4_4_100lpnq5vgy.R.inc(75);roundKeys_d[R-t][0] = roundKeys_e[t][0] = roundKeys_e[t-1][0] ^ rotr (roundKeys_e[t-1][3], 8) ^ offset[t-1];
    		__CLR4_4_100lpnq5vgy.R.inc(76);roundKeys_d[R-t][1] = roundKeys_e[t][1] = roundKeys_e[t-1][1] ^ roundKeys_e[t][0];
    		__CLR4_4_100lpnq5vgy.R.inc(77);roundKeys_d[R-t][2] = roundKeys_e[t][2] = roundKeys_e[t-1][2] ^ roundKeys_e[t][1];
    		__CLR4_4_100lpnq5vgy.R.inc(78);roundKeys_d[R-t][3] = roundKeys_e[t][3] = roundKeys_e[t-1][3] ^ roundKeys_e[t][2];
    		// apply the theta diffusion function:
    		__CLR4_4_100lpnq5vgy.R.inc(79);transform (roundKeys_e[t-1]);
    	}
    	}__CLR4_4_100lpnq5vgy.R.inc(80);for (int i = 0; (((i < 4)&&(__CLR4_4_100lpnq5vgy.R.iget(81)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(82)==0&false)); i++) {{
    	    __CLR4_4_100lpnq5vgy.R.inc(83);roundKeys_d[R][i] = roundKeys_e[0][i];
    	}
    }}finally{__CLR4_4_100lpnq5vgy.R.flushNeeded();}} // Square


    /**
     * The round function to transform an intermediate data block <code>block</code> with
     * the substitution-diffusion table <code>T</code> and the round key <code>roundKey</code>
     * @param   block       the data block
     * @param   T           the substitution-diffusion table
     * @param   roundKey    the 128-bit round key
     */
    private final void round (int[] block, int[] T, int[] roundKey)
    {try{__CLR4_4_100lpnq5vgy.R.inc(84);
        __CLR4_4_100lpnq5vgy.R.inc(85);int t0, t1, t2, t3;

        __CLR4_4_100lpnq5vgy.R.inc(86);t0 = block[0];
        __CLR4_4_100lpnq5vgy.R.inc(87);t1 = block[1];
        __CLR4_4_100lpnq5vgy.R.inc(88);t2 = block[2];
        __CLR4_4_100lpnq5vgy.R.inc(89);t3 = block[3];

    	__CLR4_4_100lpnq5vgy.R.inc(90);block[0] =  T[(t0       ) & 0xff]
			^ rotl (T[(t1       ) & 0xff],  8)
			^ rotl (T[(t2       ) & 0xff], 16)
			^ rotl (T[(t3       ) & 0xff], 24)
			^ roundKey[0];
    	__CLR4_4_100lpnq5vgy.R.inc(91);block[1] =  T[(t0 >>>  8) & 0xff]
			^ rotl (T[(t1 >>>  8) & 0xff],  8)
			^ rotl (T[(t2 >>>  8) & 0xff], 16)
			^ rotl (T[(t3 >>>  8) & 0xff], 24)
    		^ roundKey[1];
    	__CLR4_4_100lpnq5vgy.R.inc(92);block[2] =  T[(t0 >>> 16) & 0xff]
			^ rotl (T[(t1 >>> 16) & 0xff],  8)
			^ rotl (T[(t2 >>> 16) & 0xff], 16)
			^ rotl (T[(t3 >>> 16) & 0xff], 24)
    		^ roundKey[2];
    	__CLR4_4_100lpnq5vgy.R.inc(93);block[3] =  T[(t0 >>> 24) & 0xff]
			^ rotl (T[(t1 >>> 24) & 0xff],  8)
			^ rotl (T[(t2 >>> 24) & 0xff], 16)
			^ rotl (T[(t3 >>> 24) & 0xff], 24)
    		^ roundKey[3];

        // destroy potentially sensitive information:
        __CLR4_4_100lpnq5vgy.R.inc(94);t0 = t1 = t2 = t3 = 0;
    }finally{__CLR4_4_100lpnq5vgy.R.flushNeeded();}} // round


    /**
     * Encrypt a block.
     * The in and out buffers can be the same.
     * @param in            The data to be encrypted.
     * @param in_offset     The start of data within the in buffer.
     * @param out           The encrypted data.
     * @param out_offset    The start of data within the out buffer.
     */
    public final void blockEncrypt (byte in[], int in_offset, byte out[], int out_offset)
    {try{__CLR4_4_100lpnq5vgy.R.inc(95);
        __CLR4_4_100lpnq5vgy.R.inc(96);int[] block = new int[4];

        // map byte array to block and add initial key:
        __CLR4_4_100lpnq5vgy.R.inc(97);for (int i = 0; (((i < 4)&&(__CLR4_4_100lpnq5vgy.R.iget(98)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(99)==0&false)); i++) {{
            __CLR4_4_100lpnq5vgy.R.inc(100);block[i] =
                ((int)in[in_offset++] & 0xff)       ^
                ((int)in[in_offset++] & 0xff) <<  8 ^
                ((int)in[in_offset++] & 0xff) << 16 ^
                ((int)in[in_offset++] & 0xff) << 24 ^
                roundKeys_e[0][i];
        }

    	// R - 1 full rounds:
    	}__CLR4_4_100lpnq5vgy.R.inc(101);for (int r = 1; (((r < R)&&(__CLR4_4_100lpnq5vgy.R.iget(102)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(103)==0&false)); r++) {{
        	__CLR4_4_100lpnq5vgy.R.inc(104);round (block, Te, roundKeys_e[r]);
    	}

    	// last round (diffusion becomes only transposition):
    	}__CLR4_4_100lpnq5vgy.R.inc(105);round (block, Se, roundKeys_e[R]);

        // map block to byte array:
        __CLR4_4_100lpnq5vgy.R.inc(106);for (int i = 0; (((i < 4)&&(__CLR4_4_100lpnq5vgy.R.iget(107)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(108)==0&false)); i++) {{
            __CLR4_4_100lpnq5vgy.R.inc(109);int w = block[i];
            __CLR4_4_100lpnq5vgy.R.inc(110);out[out_offset++] = (byte)(w       );
            __CLR4_4_100lpnq5vgy.R.inc(111);out[out_offset++] = (byte)(w >>>  8);
            __CLR4_4_100lpnq5vgy.R.inc(112);out[out_offset++] = (byte)(w >>> 16);
            __CLR4_4_100lpnq5vgy.R.inc(113);out[out_offset++] = (byte)(w >>> 24);
        }

    }}finally{__CLR4_4_100lpnq5vgy.R.flushNeeded();}} // blockEncrypt


    /**
     * Decrypt a block.
     * The in and out buffers can be the same.
     * @param in            The data to be decrypted.
     * @param in_offset     The start of data within the in buffer.
     * @param out           The decrypted data.
     * @param out_offset    The start of data within the out buffer.
     */
    public final void blockDecrypt (byte in[], int in_offset, byte out[], int out_offset)
    {try{__CLR4_4_100lpnq5vgy.R.inc(114);
        __CLR4_4_100lpnq5vgy.R.inc(115);int[] block = new int[4];

        // map byte array to block and add initial key:
        __CLR4_4_100lpnq5vgy.R.inc(116);for (int i = 0; (((i < 4)&&(__CLR4_4_100lpnq5vgy.R.iget(117)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(118)==0&false)); i++) {{
            __CLR4_4_100lpnq5vgy.R.inc(119);block[i] =
                ((int)in[in_offset++] & 0xff)       ^
                ((int)in[in_offset++] & 0xff) <<  8 ^
                ((int)in[in_offset++] & 0xff) << 16 ^
                ((int)in[in_offset++] & 0xff) << 24 ^
                roundKeys_d[0][i];
        }

    	// R - 1 full rounds:
    	}__CLR4_4_100lpnq5vgy.R.inc(120);for (int r = 1; (((r < R)&&(__CLR4_4_100lpnq5vgy.R.iget(121)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(122)==0&false)); r++) {{
        	__CLR4_4_100lpnq5vgy.R.inc(123);round (block, Td, roundKeys_d[r]);
    	}

    	// last round (diffusion becomes only transposition):
    	}__CLR4_4_100lpnq5vgy.R.inc(124);round (block, Sd, roundKeys_d[R]);

        // map block to byte array:
        __CLR4_4_100lpnq5vgy.R.inc(125);int w;
        __CLR4_4_100lpnq5vgy.R.inc(126);for (int i = 0; (((i < 4)&&(__CLR4_4_100lpnq5vgy.R.iget(127)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(128)==0&false)); i++) {{
            __CLR4_4_100lpnq5vgy.R.inc(129);w = block[i];
            __CLR4_4_100lpnq5vgy.R.inc(130);out[out_offset++] = (byte)(w       );
            __CLR4_4_100lpnq5vgy.R.inc(131);out[out_offset++] = (byte)(w >>>  8);
            __CLR4_4_100lpnq5vgy.R.inc(132);out[out_offset++] = (byte)(w >>> 16);
            __CLR4_4_100lpnq5vgy.R.inc(133);out[out_offset++] = (byte)(w >>> 24);
        }

    	// destroy sensitive data:
    	}__CLR4_4_100lpnq5vgy.R.inc(134);w = 0;
        __CLR4_4_100lpnq5vgy.R.inc(135);for (int i = 0; (((i < 4)&&(__CLR4_4_100lpnq5vgy.R.iget(136)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(137)==0&false)); i++) {{
            __CLR4_4_100lpnq5vgy.R.inc(138);block[i] = 0;
        }
    }}finally{__CLR4_4_100lpnq5vgy.R.flushNeeded();}} // blockDecrypt


    protected final void finalize ()
        throws Throwable
    {try{__CLR4_4_100lpnq5vgy.R.inc(139);
        __CLR4_4_100lpnq5vgy.R.inc(140);for (int r = 0; (((r <= R)&&(__CLR4_4_100lpnq5vgy.R.iget(141)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(142)==0&false)); r++) {{
            __CLR4_4_100lpnq5vgy.R.inc(143);for (int i = 0; (((i < 4)&&(__CLR4_4_100lpnq5vgy.R.iget(144)!=0|true))||(__CLR4_4_100lpnq5vgy.R.iget(145)==0&false)); i++) {{
                __CLR4_4_100lpnq5vgy.R.inc(146);roundKeys_e[r][i] = roundKeys_d[r][i] = 0;
            }
        }}
        }__CLR4_4_100lpnq5vgy.R.inc(147);super.finalize ();
    }finally{__CLR4_4_100lpnq5vgy.R.flushNeeded();}} // finalize

} // Square
