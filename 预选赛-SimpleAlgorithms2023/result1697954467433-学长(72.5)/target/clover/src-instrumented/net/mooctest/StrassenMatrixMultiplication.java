/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;


//Java Program to Implement Strassen Algorithm for Matrix Multiplication

/*
* Uses the divide and conquer approach to multiply two matrices.
* Time Complexity: O(n^2.8074) better than the O(n^3) of the standard matrix multiplication
* algorithm. Space Complexity: O(n^2)
*
* This Matrix multiplication can be performed only on square matrices
* where n is a power of 2. Order of both of the matrices are n \u8133 n.
*
* Reference:
* https://www.tutorialspoint.com/design_and_analysis_of_algorithms/design_and_analysis_of_algorithms_strassens_matrix_multiplication.htm#:~:text=Strassen's%20Matrix%20multiplication%20can%20be,matrices%20are%20n%20%C3%97%20n.
* https://www.geeksforgeeks.org/strassens-matrix-multiplication/
*/

public class StrassenMatrixMultiplication {public static class __CLR4_4_1h7h7lo0xphhz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0053\u0069\u006d\u0070\u006c\u0065\u0041\u006c\u0067\u006f\u0072\u0069\u0074\u0068\u006d\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697946837852L,8589935092L,696,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

 // Function to multiply matrices
 public int[][] multiply(int[][] A, int[][] B) {try{__CLR4_4_1h7h7lo0xphhz.R.inc(619);
     __CLR4_4_1h7h7lo0xphhz.R.inc(620);int n = A.length;

     __CLR4_4_1h7h7lo0xphhz.R.inc(621);int[][] R = new int[n][n];

     __CLR4_4_1h7h7lo0xphhz.R.inc(622);if ((((n == 1)&&(__CLR4_4_1h7h7lo0xphhz.R.iget(623)!=0|true))||(__CLR4_4_1h7h7lo0xphhz.R.iget(624)==0&false))) {{
         __CLR4_4_1h7h7lo0xphhz.R.inc(625);R[0][0] = A[0][0] * B[0][0];
     } }else {{
         // Dividing Matrix into parts
         // by storing sub-parts to variables
         __CLR4_4_1h7h7lo0xphhz.R.inc(626);int[][] A11 = new int[n / 2][n / 2];
         __CLR4_4_1h7h7lo0xphhz.R.inc(627);int[][] A12 = new int[n / 2][n / 2];
         __CLR4_4_1h7h7lo0xphhz.R.inc(628);int[][] A21 = new int[n / 2][n / 2];
         __CLR4_4_1h7h7lo0xphhz.R.inc(629);int[][] A22 = new int[n / 2][n / 2];
         __CLR4_4_1h7h7lo0xphhz.R.inc(630);int[][] B11 = new int[n / 2][n / 2];
         __CLR4_4_1h7h7lo0xphhz.R.inc(631);int[][] B12 = new int[n / 2][n / 2];
         __CLR4_4_1h7h7lo0xphhz.R.inc(632);int[][] B21 = new int[n / 2][n / 2];
         __CLR4_4_1h7h7lo0xphhz.R.inc(633);int[][] B22 = new int[n / 2][n / 2];

         // Dividing matrix A into 4 parts
         __CLR4_4_1h7h7lo0xphhz.R.inc(634);split(A, A11, 0, 0);
         __CLR4_4_1h7h7lo0xphhz.R.inc(635);split(A, A12, 0, n / 2);
         __CLR4_4_1h7h7lo0xphhz.R.inc(636);split(A, A21, n / 2, 0);
         __CLR4_4_1h7h7lo0xphhz.R.inc(637);split(A, A22, n / 2, n / 2);

         // Dividing matrix B into 4 parts
         __CLR4_4_1h7h7lo0xphhz.R.inc(638);split(B, B11, 0, 0);
         __CLR4_4_1h7h7lo0xphhz.R.inc(639);split(B, B12, 0, n / 2);
         __CLR4_4_1h7h7lo0xphhz.R.inc(640);split(B, B21, n / 2, 0);
         __CLR4_4_1h7h7lo0xphhz.R.inc(641);split(B, B22, n / 2, n / 2);

         // Using Formulas as described in algorithm
         // M1:=(A1+A3)\u8133(B1+B2)
         __CLR4_4_1h7h7lo0xphhz.R.inc(642);int[][] M1 = multiply(add(A11, A22), add(B11, B22));

         // M2:=(A2+A4)\u8133(B3+B4)
         __CLR4_4_1h7h7lo0xphhz.R.inc(643);int[][] M2 = multiply(add(A21, A22), B11);

         // M3:=(A1\u922d\u62504)\u8133(B1+A4)
         __CLR4_4_1h7h7lo0xphhz.R.inc(644);int[][] M3 = multiply(A11, sub(B12, B22));

         // M4:=A1\u8133(B2\u922d\u62554)
         __CLR4_4_1h7h7lo0xphhz.R.inc(645);int[][] M4 = multiply(A22, sub(B21, B11));

         // M5:=(A3+A4)\u8133(B1)
         __CLR4_4_1h7h7lo0xphhz.R.inc(646);int[][] M5 = multiply(add(A11, A12), B22);

         // M6:=(A1+A2)\u8133(B4)
         __CLR4_4_1h7h7lo0xphhz.R.inc(647);int[][] M6 = multiply(sub(A21, A11), add(B11, B12));

         // M7:=A4\u8133(B3\u922d\u62551)
         __CLR4_4_1h7h7lo0xphhz.R.inc(648);int[][] M7 = multiply(sub(A12, A22), add(B21, B22));

         // P:=M2+M3\u922d\u62626\u922d\u62627
         __CLR4_4_1h7h7lo0xphhz.R.inc(649);int[][] C11 = add(sub(add(M1, M4), M5), M7);

         // Q:=M4+M6
         __CLR4_4_1h7h7lo0xphhz.R.inc(650);int[][] C12 = add(M3, M5);

         // R:=M5+M7
         __CLR4_4_1h7h7lo0xphhz.R.inc(651);int[][] C21 = add(M2, M4);

         // S:=M1\u922d\u62623\u922d\u62624\u922d\u62625
         __CLR4_4_1h7h7lo0xphhz.R.inc(652);int[][] C22 = add(sub(add(M1, M3), M2), M6);

         __CLR4_4_1h7h7lo0xphhz.R.inc(653);join(C11, R, 0, 0);
         __CLR4_4_1h7h7lo0xphhz.R.inc(654);join(C12, R, 0, n / 2);
         __CLR4_4_1h7h7lo0xphhz.R.inc(655);join(C21, R, n / 2, 0);
         __CLR4_4_1h7h7lo0xphhz.R.inc(656);join(C22, R, n / 2, n / 2);
     }

     }__CLR4_4_1h7h7lo0xphhz.R.inc(657);return R;
 }finally{__CLR4_4_1h7h7lo0xphhz.R.flushNeeded();}}

 // Function to subtract two matrices
 public int[][] sub(int[][] A, int[][] B) {try{__CLR4_4_1h7h7lo0xphhz.R.inc(658);
     __CLR4_4_1h7h7lo0xphhz.R.inc(659);int n = A.length;

     __CLR4_4_1h7h7lo0xphhz.R.inc(660);int[][] C = new int[n][n];

     __CLR4_4_1h7h7lo0xphhz.R.inc(661);for (int i = 0; (((i < n)&&(__CLR4_4_1h7h7lo0xphhz.R.iget(662)!=0|true))||(__CLR4_4_1h7h7lo0xphhz.R.iget(663)==0&false)); i++) {{
         __CLR4_4_1h7h7lo0xphhz.R.inc(664);for (int j = 0; (((j < n)&&(__CLR4_4_1h7h7lo0xphhz.R.iget(665)!=0|true))||(__CLR4_4_1h7h7lo0xphhz.R.iget(666)==0&false)); j++) {{
             __CLR4_4_1h7h7lo0xphhz.R.inc(667);C[i][j] = A[i][j] - B[i][j];
         }
     }}

     }__CLR4_4_1h7h7lo0xphhz.R.inc(668);return C;
 }finally{__CLR4_4_1h7h7lo0xphhz.R.flushNeeded();}}

 // Function to add two matrices
 public int[][] add(int[][] A, int[][] B) {try{__CLR4_4_1h7h7lo0xphhz.R.inc(669);
     __CLR4_4_1h7h7lo0xphhz.R.inc(670);int n = A.length;

     __CLR4_4_1h7h7lo0xphhz.R.inc(671);int[][] C = new int[n][n];

     __CLR4_4_1h7h7lo0xphhz.R.inc(672);for (int i = 0; (((i < n)&&(__CLR4_4_1h7h7lo0xphhz.R.iget(673)!=0|true))||(__CLR4_4_1h7h7lo0xphhz.R.iget(674)==0&false)); i++) {{
         __CLR4_4_1h7h7lo0xphhz.R.inc(675);for (int j = 0; (((j < n)&&(__CLR4_4_1h7h7lo0xphhz.R.iget(676)!=0|true))||(__CLR4_4_1h7h7lo0xphhz.R.iget(677)==0&false)); j++) {{
             __CLR4_4_1h7h7lo0xphhz.R.inc(678);C[i][j] = A[i][j] + B[i][j];
         }
     }}

     }__CLR4_4_1h7h7lo0xphhz.R.inc(679);return C;
 }finally{__CLR4_4_1h7h7lo0xphhz.R.flushNeeded();}}

 // Function to split parent matrix into child matrices
 public void split(int[][] P, int[][] C, int iB, int jB) {try{__CLR4_4_1h7h7lo0xphhz.R.inc(680);
     __CLR4_4_1h7h7lo0xphhz.R.inc(681);for (int i1 = 0, i2 = iB; (((i1 < C.length)&&(__CLR4_4_1h7h7lo0xphhz.R.iget(682)!=0|true))||(__CLR4_4_1h7h7lo0xphhz.R.iget(683)==0&false)); i1++, i2++) {{
         __CLR4_4_1h7h7lo0xphhz.R.inc(684);for (int j1 = 0, j2 = jB; (((j1 < C.length)&&(__CLR4_4_1h7h7lo0xphhz.R.iget(685)!=0|true))||(__CLR4_4_1h7h7lo0xphhz.R.iget(686)==0&false)); j1++, j2++) {{
             __CLR4_4_1h7h7lo0xphhz.R.inc(687);C[i1][j1] = P[i2][j2];
         }
     }}
 }}finally{__CLR4_4_1h7h7lo0xphhz.R.flushNeeded();}}

 // Function to join child matrices into (to) parent matrix
 public void join(int[][] C, int[][] P, int iB, int jB) {try{__CLR4_4_1h7h7lo0xphhz.R.inc(688);
     __CLR4_4_1h7h7lo0xphhz.R.inc(689);for (int i1 = 0, i2 = iB; (((i1 < C.length)&&(__CLR4_4_1h7h7lo0xphhz.R.iget(690)!=0|true))||(__CLR4_4_1h7h7lo0xphhz.R.iget(691)==0&false)); i1++, i2++) {{
         __CLR4_4_1h7h7lo0xphhz.R.inc(692);for (int j1 = 0, j2 = jB; (((j1 < C.length)&&(__CLR4_4_1h7h7lo0xphhz.R.iget(693)!=0|true))||(__CLR4_4_1h7h7lo0xphhz.R.iget(694)==0&false)); j1++, j2++) {{
             __CLR4_4_1h7h7lo0xphhz.R.inc(695);P[i2][j2] = C[i1][j1];
         }
     }}
 }}finally{__CLR4_4_1h7h7lo0xphhz.R.flushNeeded();}}
}
