/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Testing program for the BJTree data structure.
 * 
 * Input may be read from standard input/output or from files. See the comments
 * below. This creates a new BJTree and then invokes the CommandHandler to
 * process the commands.
 */
public class BJTreeTester {static class __CLR4_4_18888lo0x9tpc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0034\u0032\u0033\u0035\u0038\u005c\u005c\u0057\u0065\u0069\u0067\u0068\u0074\u0042\u0061\u006c\u0061\u006e\u0063\u0065\u0064\u0054\u0072\u0065\u0065\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697946106729L,8589935092L,317,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	// --------------------------------------------------------------------------------------------
	// Uncomment these to read from standard input and output
	private static final boolean USE_STD_IO = true;
	// private static String inputFileName = "";
	// private static String outputFileName = "";
	// --------------------------------------------------------------------------------------------
	// Uncomment these to read from a file (USE THESE FOR YOUR TESTING ONLY)
	// private static final boolean USE_STD_IO = false;
	private static String inputFileName = "tests/test01-input.txt";
	private static String outputFileName = "tests/test01-output.txt";
	// --------------------------------------------------------------------------------------------

	public static void main(String[] args) {try{__CLR4_4_18888lo0x9tpc.R.inc(296);

		// configure to read from file rather than standard input/output
		__CLR4_4_18888lo0x9tpc.R.inc(297);if ((((!USE_STD_IO)&&(__CLR4_4_18888lo0x9tpc.R.iget(298)!=0|true))||(__CLR4_4_18888lo0x9tpc.R.iget(299)==0&false))) {{
			__CLR4_4_18888lo0x9tpc.R.inc(300);try {
				__CLR4_4_18888lo0x9tpc.R.inc(301);System.setIn(new FileInputStream(inputFileName));
				__CLR4_4_18888lo0x9tpc.R.inc(302);System.setOut(new PrintStream(outputFileName));
			} catch (FileNotFoundException e) {
				__CLR4_4_18888lo0x9tpc.R.inc(303);e.printStackTrace();
			}
		}

		}__CLR4_4_18888lo0x9tpc.R.inc(304);try {
			__CLR4_4_18888lo0x9tpc.R.inc(305);Scanner scanner = new Scanner(System.in); // input scanner
			__CLR4_4_18888lo0x9tpc.R.inc(306);BJTree<String, Airport> bjTree = new BJTree<String, Airport>(); // create the tree
			__CLR4_4_18888lo0x9tpc.R.inc(307);CommandHandler commandHandler = new CommandHandler(bjTree); // initialize command handler
			__CLR4_4_18888lo0x9tpc.R.inc(308);while ((((scanner.hasNextLine())&&(__CLR4_4_18888lo0x9tpc.R.iget(309)!=0|true))||(__CLR4_4_18888lo0x9tpc.R.iget(310)==0&false))) {{
				__CLR4_4_18888lo0x9tpc.R.inc(311);String line = scanner.nextLine(); // input next line
				__CLR4_4_18888lo0x9tpc.R.inc(312);String output = commandHandler.processCommand(line); // process this command
				__CLR4_4_18888lo0x9tpc.R.inc(313);System.out.print(output); // output summary
			}
			}__CLR4_4_18888lo0x9tpc.R.inc(314);scanner.close();
		} catch (Exception e) {
			__CLR4_4_18888lo0x9tpc.R.inc(315);System.err.println("Unexpected error: " + e.getMessage());
			__CLR4_4_18888lo0x9tpc.R.inc(316);e.printStackTrace(System.err);
		}
	}finally{__CLR4_4_18888lo0x9tpc.R.flushNeeded();}}
}
