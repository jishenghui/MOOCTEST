/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
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

public final class SquareCts implements SquareMode {public static class __CLR4_4_17h7hlpnq5vip{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0036\u0030\u0031\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0053\u0071\u0075\u0061\u0072\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1701501669986L,8589935092L,347,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Square sq;
	private final byte[] mask = new byte[Square.BLOCK_LENGTH];


    public final void setKey (byte[] key)
    	// throws IndexOutOfBoundsException
    {try{__CLR4_4_17h7hlpnq5vip.R.inc(269);
        __CLR4_4_17h7hlpnq5vip.R.inc(270);sq = new Square (key);
        __CLR4_4_17h7hlpnq5vip.R.inc(271);for (int i = 0; (((i < Square.BLOCK_LENGTH)&&(__CLR4_4_17h7hlpnq5vip.R.iget(272)!=0|true))||(__CLR4_4_17h7hlpnq5vip.R.iget(273)==0&false)); i++) {{
            __CLR4_4_17h7hlpnq5vip.R.inc(274);mask[i] = 0;
        }
    }}finally{__CLR4_4_17h7hlpnq5vip.R.flushNeeded();}} // setKey


    public final void setIV (byte[] iv)
    	// throws IndexOutOfBoundsException
    {try{__CLR4_4_17h7hlpnq5vip.R.inc(275);
        __CLR4_4_17h7hlpnq5vip.R.inc(276);System.arraycopy (iv, 0, mask, 0, Square.BLOCK_LENGTH);
    	// encrypt the IV so that possibility of correlation with ciphertext is avoided (this is done for compatibility with Pegwit):
    	__CLR4_4_17h7hlpnq5vip.R.inc(277);sq.blockEncrypt (mask, 0, mask, 0);
    }finally{__CLR4_4_17h7hlpnq5vip.R.flushNeeded();}} // setIV


    public final void encrypt (byte[] buf, int off, int len)
    	// throws IndexOutOfBoundsException
    {try{__CLR4_4_17h7hlpnq5vip.R.inc(278);
        __CLR4_4_17h7hlpnq5vip.R.inc(279);if ((((len < Square.BLOCK_LENGTH)&&(__CLR4_4_17h7hlpnq5vip.R.iget(280)!=0|true))||(__CLR4_4_17h7hlpnq5vip.R.iget(281)==0&false))) {{
            __CLR4_4_17h7hlpnq5vip.R.inc(282);throw new IndexOutOfBoundsException ();
        }
    	}__CLR4_4_17h7hlpnq5vip.R.inc(283);while ((((len >= Square.BLOCK_LENGTH)&&(__CLR4_4_17h7hlpnq5vip.R.iget(284)!=0|true))||(__CLR4_4_17h7hlpnq5vip.R.iget(285)==0&false))) {{
    		// mask and encrypt the current block:
    		__CLR4_4_17h7hlpnq5vip.R.inc(286);for (int i = 0; (((i < Square.BLOCK_LENGTH)&&(__CLR4_4_17h7hlpnq5vip.R.iget(287)!=0|true))||(__CLR4_4_17h7hlpnq5vip.R.iget(288)==0&false)); i++) {{
    		    __CLR4_4_17h7hlpnq5vip.R.inc(289);buf[off + i] ^= mask[i];
    		}
    		}__CLR4_4_17h7hlpnq5vip.R.inc(290);sq.blockEncrypt (buf, off, buf, off);
    		__CLR4_4_17h7hlpnq5vip.R.inc(291);for (int i = 0; (((i < Square.BLOCK_LENGTH)&&(__CLR4_4_17h7hlpnq5vip.R.iget(292)!=0|true))||(__CLR4_4_17h7hlpnq5vip.R.iget(293)==0&false)); i++) {{
    		    __CLR4_4_17h7hlpnq5vip.R.inc(294);mask[i] = buf[off++];
    		}
    		}__CLR4_4_17h7hlpnq5vip.R.inc(295);len -= Square.BLOCK_LENGTH;
    	}
        }__CLR4_4_17h7hlpnq5vip.R.inc(296);if ((((len != 0)&&(__CLR4_4_17h7hlpnq5vip.R.iget(297)!=0|true))||(__CLR4_4_17h7hlpnq5vip.R.iget(298)==0&false))) {{
            // mask the last, *incomplete* block:
            __CLR4_4_17h7hlpnq5vip.R.inc(299);for (int i = 0; (((i < len)&&(__CLR4_4_17h7hlpnq5vip.R.iget(300)!=0|true))||(__CLR4_4_17h7hlpnq5vip.R.iget(301)==0&false)); i++) {{
                __CLR4_4_17h7hlpnq5vip.R.inc(302);mask[i] ^= buf[off + i];
            }
            // encrypt the masking result:
    		}__CLR4_4_17h7hlpnq5vip.R.inc(303);sq.blockEncrypt (mask, 0, mask, 0);
    		// shift ciphertext pieces to suitable offsets:
    		__CLR4_4_17h7hlpnq5vip.R.inc(304);System.arraycopy (buf, off - Square.BLOCK_LENGTH, buf, off, len);
    		__CLR4_4_17h7hlpnq5vip.R.inc(305);System.arraycopy (mask, 0, buf, off - Square.BLOCK_LENGTH, Square.BLOCK_LENGTH);
        }
    }}finally{__CLR4_4_17h7hlpnq5vip.R.flushNeeded();}} // encrypt


    public final void decrypt (byte[] buf, int off, int len)
    	// throws IndexOutOfBoundsException
    {try{__CLR4_4_17h7hlpnq5vip.R.inc(306);
        __CLR4_4_17h7hlpnq5vip.R.inc(307);if ((((len < Square.BLOCK_LENGTH)&&(__CLR4_4_17h7hlpnq5vip.R.iget(308)!=0|true))||(__CLR4_4_17h7hlpnq5vip.R.iget(309)==0&false))) {{
            __CLR4_4_17h7hlpnq5vip.R.inc(310);throw new IndexOutOfBoundsException ();
        }
    	}__CLR4_4_17h7hlpnq5vip.R.inc(311);byte[] temp = new byte[Square.BLOCK_LENGTH];
    	__CLR4_4_17h7hlpnq5vip.R.inc(312);while ((((len >= 2*Square.BLOCK_LENGTH)&&(__CLR4_4_17h7hlpnq5vip.R.iget(313)!=0|true))||(__CLR4_4_17h7hlpnq5vip.R.iget(314)==0&false))) {{
    	    __CLR4_4_17h7hlpnq5vip.R.inc(315);for (int i = 0; (((i < Square.BLOCK_LENGTH)&&(__CLR4_4_17h7hlpnq5vip.R.iget(316)!=0|true))||(__CLR4_4_17h7hlpnq5vip.R.iget(317)==0&false)); i++) {{
    	        __CLR4_4_17h7hlpnq5vip.R.inc(318);temp[i] = buf[off + i];
    	    }
    		// decrypt and unmask the block:
    		}__CLR4_4_17h7hlpnq5vip.R.inc(319);sq.blockDecrypt (buf, off, buf, off);
    		__CLR4_4_17h7hlpnq5vip.R.inc(320);for (int i = 0; (((i < Square.BLOCK_LENGTH)&&(__CLR4_4_17h7hlpnq5vip.R.iget(321)!=0|true))||(__CLR4_4_17h7hlpnq5vip.R.iget(322)==0&false)); i++) {{
    		    __CLR4_4_17h7hlpnq5vip.R.inc(323);buf[off++] ^= mask[i]; __CLR4_4_17h7hlpnq5vip.R.inc(324);mask[i] = temp[i];
    	    }
    		}__CLR4_4_17h7hlpnq5vip.R.inc(325);len -= Square.BLOCK_LENGTH;
    	}
    	// now Square.BLOCK_LENGTH <= len < 2*Square.BLOCK_LENGTH;
    	// save the current block for chaining:
   		}__CLR4_4_17h7hlpnq5vip.R.inc(326);System.arraycopy (buf, off, temp, 0, Square.BLOCK_LENGTH);
        __CLR4_4_17h7hlpnq5vip.R.inc(327);if ((((len > Square.BLOCK_LENGTH)&&(__CLR4_4_17h7hlpnq5vip.R.iget(328)!=0|true))||(__CLR4_4_17h7hlpnq5vip.R.iget(329)==0&false))) {{
    		// decrypt and unmask the last *incomplete* block:
    		__CLR4_4_17h7hlpnq5vip.R.inc(330);sq.blockDecrypt (buf, off, buf, off);
    		__CLR4_4_17h7hlpnq5vip.R.inc(331);for (int i = 0; (((i < len - Square.BLOCK_LENGTH)&&(__CLR4_4_17h7hlpnq5vip.R.iget(332)!=0|true))||(__CLR4_4_17h7hlpnq5vip.R.iget(333)==0&false)); i++) {{
    			// at this point, buf[off + Square.BLOCK_LENGTH + i] contains
    			// a cipherbyte, and buf[off + i] contains the exclusive-or of
    			// this cipherbyte with the corresponding plainbyte...
    			__CLR4_4_17h7hlpnq5vip.R.inc(334);buf[off + i] ^= buf[off + Square.BLOCK_LENGTH + i] ^= buf[off + i];
    			// ... now buf[off + i] contains the pure cipherbyte and
    			// buf[off + Square.BLOCK_LENGTH + i] contains the plainbyte.
    		}
        }}
		// decrypt and unmask the last *complete* block:
		}__CLR4_4_17h7hlpnq5vip.R.inc(335);sq.blockDecrypt (buf, off, buf, off);
		__CLR4_4_17h7hlpnq5vip.R.inc(336);for (int i = 0; (((i < Square.BLOCK_LENGTH)&&(__CLR4_4_17h7hlpnq5vip.R.iget(337)!=0|true))||(__CLR4_4_17h7hlpnq5vip.R.iget(338)==0&false)); i++) {{
		    __CLR4_4_17h7hlpnq5vip.R.inc(339);buf[off++] ^= mask[i]; __CLR4_4_17h7hlpnq5vip.R.inc(340);mask[i] = temp[i];
		}
    }}finally{__CLR4_4_17h7hlpnq5vip.R.flushNeeded();}} // decrypt


    protected final void finalize ()
        throws Throwable
    {try{__CLR4_4_17h7hlpnq5vip.R.inc(341);
        __CLR4_4_17h7hlpnq5vip.R.inc(342);for (int i = 0; (((i < Square.BLOCK_LENGTH)&&(__CLR4_4_17h7hlpnq5vip.R.iget(343)!=0|true))||(__CLR4_4_17h7hlpnq5vip.R.iget(344)==0&false)); i++) {{
            __CLR4_4_17h7hlpnq5vip.R.inc(345);mask[i] = 0;
        }
        }__CLR4_4_17h7hlpnq5vip.R.inc(346);super.finalize ();
    }finally{__CLR4_4_17h7hlpnq5vip.R.flushNeeded();}} // finalize

} // SquareCts
