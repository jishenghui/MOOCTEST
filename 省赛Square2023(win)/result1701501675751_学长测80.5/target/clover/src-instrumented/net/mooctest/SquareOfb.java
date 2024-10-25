/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
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

public final class SquareOfb implements SquareMode {public static class __CLR4_4_1a4a4lpnq5vjv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0036\u0030\u0031\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0053\u0071\u0075\u0061\u0072\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1701501669986L,8589935092L,413,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Square sq;
	private final byte[] mask = new byte[Square.BLOCK_LENGTH];
	private int avail = 0; // number of available mask bytes


    public final void setKey (byte[] key)
    	// throws IndexOutOfBoundsException
    {try{__CLR4_4_1a4a4lpnq5vjv.R.inc(364);
        __CLR4_4_1a4a4lpnq5vjv.R.inc(365);sq = new Square (key);
        __CLR4_4_1a4a4lpnq5vjv.R.inc(366);for (int i = 0; (((i < Square.BLOCK_LENGTH)&&(__CLR4_4_1a4a4lpnq5vjv.R.iget(367)!=0|true))||(__CLR4_4_1a4a4lpnq5vjv.R.iget(368)==0&false)); i++) {{
            __CLR4_4_1a4a4lpnq5vjv.R.inc(369);mask[i] = 0;
        }
        }__CLR4_4_1a4a4lpnq5vjv.R.inc(370);avail = 0;
    }finally{__CLR4_4_1a4a4lpnq5vjv.R.flushNeeded();}} // setKey


    public final void setIV (byte[/*Square.BLOCK_LENGTH*/] iv)
    	// throws IndexOutOfBoundsException
    {try{__CLR4_4_1a4a4lpnq5vjv.R.inc(371);
        __CLR4_4_1a4a4lpnq5vjv.R.inc(372);System.arraycopy (iv, 0, mask, 0, Square.BLOCK_LENGTH);
        __CLR4_4_1a4a4lpnq5vjv.R.inc(373);avail = 0;
    }finally{__CLR4_4_1a4a4lpnq5vjv.R.flushNeeded();}} // setIV


    public final void encrypt (byte[] buf, int off, int len)
    {try{__CLR4_4_1a4a4lpnq5vjv.R.inc(374);
    	// if there are enough available mask bytes
    	// to encrypt the whole buffer, just use them:
    	__CLR4_4_1a4a4lpnq5vjv.R.inc(375);if ((((len <= avail)&&(__CLR4_4_1a4a4lpnq5vjv.R.iget(376)!=0|true))||(__CLR4_4_1a4a4lpnq5vjv.R.iget(377)==0&false))) {{
    		__CLR4_4_1a4a4lpnq5vjv.R.inc(378);for (int i = Square.BLOCK_LENGTH - avail, m = len; (((m-- > 0)&&(__CLR4_4_1a4a4lpnq5vjv.R.iget(379)!=0|true))||(__CLR4_4_1a4a4lpnq5vjv.R.iget(380)==0&false)); i++) {{
    			__CLR4_4_1a4a4lpnq5vjv.R.inc(381);buf[off++] ^= mask[i];
    		}
    		}__CLR4_4_1a4a4lpnq5vjv.R.inc(382);avail -= len;
    		__CLR4_4_1a4a4lpnq5vjv.R.inc(383);return;
    	}
    	// use all available (always 0 to Square.BLOCK_LENGTH-1)
    	// mask bytes to encrypt the first bytes of the buffer:
    	}__CLR4_4_1a4a4lpnq5vjv.R.inc(384);for (int i = Square.BLOCK_LENGTH - avail; (((i < Square.BLOCK_LENGTH)&&(__CLR4_4_1a4a4lpnq5vjv.R.iget(385)!=0|true))||(__CLR4_4_1a4a4lpnq5vjv.R.iget(386)==0&false)); i++) {{
    		__CLR4_4_1a4a4lpnq5vjv.R.inc(387);buf[off++] ^= mask[i];
    	}
    	}__CLR4_4_1a4a4lpnq5vjv.R.inc(388);len -= avail;
    	// encrypt the middle of the buffer in blocks of Square.BLOCK_LENGTH bytes:
    	__CLR4_4_1a4a4lpnq5vjv.R.inc(389);while ((((len > Square.BLOCK_LENGTH)&&(__CLR4_4_1a4a4lpnq5vjv.R.iget(390)!=0|true))||(__CLR4_4_1a4a4lpnq5vjv.R.iget(391)==0&false))) {{
    		__CLR4_4_1a4a4lpnq5vjv.R.inc(392);sq.blockEncrypt (mask, 0, mask, 0);
    		__CLR4_4_1a4a4lpnq5vjv.R.inc(393);for (int i = 0; (((i < Square.BLOCK_LENGTH)&&(__CLR4_4_1a4a4lpnq5vjv.R.iget(394)!=0|true))||(__CLR4_4_1a4a4lpnq5vjv.R.iget(395)==0&false)); i++) {{
    		    __CLR4_4_1a4a4lpnq5vjv.R.inc(396);buf[off++] ^= mask[i];
    		}
    		}__CLR4_4_1a4a4lpnq5vjv.R.inc(397);len -= Square.BLOCK_LENGTH;
    	}
    	// encrypt the last len (always 1 to Square.BLOCK_LENGTH) bytes:
   		}__CLR4_4_1a4a4lpnq5vjv.R.inc(398);sq.blockEncrypt (mask, 0, mask, 0);
    	__CLR4_4_1a4a4lpnq5vjv.R.inc(399);for (int i = 0; (((i < len)&&(__CLR4_4_1a4a4lpnq5vjv.R.iget(400)!=0|true))||(__CLR4_4_1a4a4lpnq5vjv.R.iget(401)==0&false)); i++) {{
   		    __CLR4_4_1a4a4lpnq5vjv.R.inc(402);buf[off++] ^= mask[i];
    	}
    	}__CLR4_4_1a4a4lpnq5vjv.R.inc(403);avail = Square.BLOCK_LENGTH - len;
    }finally{__CLR4_4_1a4a4lpnq5vjv.R.flushNeeded();}} // encrypt


    public final void decrypt (byte[] buf, int off, int len)
    {try{__CLR4_4_1a4a4lpnq5vjv.R.inc(404);
        __CLR4_4_1a4a4lpnq5vjv.R.inc(405);encrypt (buf, off, len);
    }finally{__CLR4_4_1a4a4lpnq5vjv.R.flushNeeded();}} // decrypt


    protected final void finalize ()
        throws Throwable
    {try{__CLR4_4_1a4a4lpnq5vjv.R.inc(406);
        __CLR4_4_1a4a4lpnq5vjv.R.inc(407);for (int i = 0; (((i < Square.BLOCK_LENGTH)&&(__CLR4_4_1a4a4lpnq5vjv.R.iget(408)!=0|true))||(__CLR4_4_1a4a4lpnq5vjv.R.iget(409)==0&false)); i++) {{
            __CLR4_4_1a4a4lpnq5vjv.R.inc(410);mask[i] = 0;
        }
        }__CLR4_4_1a4a4lpnq5vjv.R.inc(411);avail = 0;
        __CLR4_4_1a4a4lpnq5vjv.R.inc(412);super.finalize ();
    }finally{__CLR4_4_1a4a4lpnq5vjv.R.flushNeeded();}} // finalize

} // SquareOfb
