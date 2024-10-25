/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

// YOU SHOULD NOT MODIFY THIS FILE

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Command handler. This inputs a single command line, processes the command (by
 * invoking the appropriate method(s) on the XBSTree), and returns the result as
 * a string.
 */

public class CommandHandler {public static class __CLR4_4_18t8tlo0x9tpr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0034\u0032\u0033\u0035\u0038\u005c\u005c\u0057\u0065\u0069\u0067\u0068\u0074\u0042\u0061\u006c\u0061\u006e\u0063\u0065\u0064\u0054\u0072\u0065\u0065\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697946106729L,8589935092L,460,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	private BJTree<String, Airport> tree; // the BJ Tree

	/**
	 * Construct from a BJ Tree.
	 * 
	 * @param tree The BJ Tree
	 */
	public CommandHandler(BJTree<String, Airport> tree) {try{__CLR4_4_18t8tlo0x9tpr.R.inc(317);
		__CLR4_4_18t8tlo0x9tpr.R.inc(318);this.tree = new BJTree<String, Airport>();
	}finally{__CLR4_4_18t8tlo0x9tpr.R.flushNeeded();}}

	/**
	 * Process a single command and return the string output. Each command begins
	 * with a timestamp and a command (e.g., find, insert, delete) followed by a
	 * list of arguments. The arguments are separated by colons (":"). For example,
	 * the command to delete the LAX airport is "delete:LAX". (Note that timestamps
	 * are ignored in this version.)
	 *
	 * Note that the insert and delete commands both first perform a find to avoid
	 * generating exceptions.
	 *
	 * The preorder command gets a listing of the airports in preorder. It prints
	 * this list and also generates a nicely indented (inorder) presentation of the
	 * tree's contents.
	 * 
	 * @param inputLine The input line with the command and parameters.
	 * @return A short summary of the command's execution/result.
	 */

	public String processCommand(String inputLine) throws Exception {try{__CLR4_4_18t8tlo0x9tpr.R.inc(319);
		__CLR4_4_18t8tlo0x9tpr.R.inc(320);String output = new String(); // for storing summary output
		__CLR4_4_18t8tlo0x9tpr.R.inc(321);Scanner line = new Scanner(inputLine);
		__CLR4_4_18t8tlo0x9tpr.R.inc(322);try {
			__CLR4_4_18t8tlo0x9tpr.R.inc(323);line.useDelimiter(":"); // use ":" to separate arguments
			__CLR4_4_18t8tlo0x9tpr.R.inc(324);int time = ((((line.hasNext() )&&(__CLR4_4_18t8tlo0x9tpr.R.iget(325)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(326)==0&false))? line.nextInt() : 0); // next command
			__CLR4_4_18t8tlo0x9tpr.R.inc(327);if ((((time <= 0)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(328)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(329)==0&false))) {{
				__CLR4_4_18t8tlo0x9tpr.R.inc(330);throw new Exception("Invalid input: Time value is not strictly positive");
			}
			}__CLR4_4_18t8tlo0x9tpr.R.inc(331);String cmd = ((((line.hasNext() )&&(__CLR4_4_18t8tlo0x9tpr.R.iget(332)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(333)==0&false))? line.next() : ""); // next command

			// -----------------------------------------------------
			// INSERT code name city country x y
			// -----------------------------------------------------
			__CLR4_4_18t8tlo0x9tpr.R.inc(334);if ((((cmd.compareTo("insert") == 0)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(335)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(336)==0&false))) {{
				__CLR4_4_18t8tlo0x9tpr.R.inc(337);String code = line.next(); // get parameters
				__CLR4_4_18t8tlo0x9tpr.R.inc(338);String name = line.next();
				__CLR4_4_18t8tlo0x9tpr.R.inc(339);String city = line.next();
				__CLR4_4_18t8tlo0x9tpr.R.inc(340);String country = line.next();
				__CLR4_4_18t8tlo0x9tpr.R.inc(341);float x = line.nextFloat();
				__CLR4_4_18t8tlo0x9tpr.R.inc(342);float y = line.nextFloat();
				__CLR4_4_18t8tlo0x9tpr.R.inc(343);float weight = line.nextFloat();
				__CLR4_4_18t8tlo0x9tpr.R.inc(344);if ((((weight <= 0)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(345)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(346)==0&false))) {{
					__CLR4_4_18t8tlo0x9tpr.R.inc(347);throw new Exception("Invalid input: Insert weight is not strictly positive");
				}
				}__CLR4_4_18t8tlo0x9tpr.R.inc(348);if ((((tree.find(code) != null)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(349)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(350)==0&false))) {{ // code already in dictionary?
					__CLR4_4_18t8tlo0x9tpr.R.inc(351);output += "insert(" + code + "): failure - duplicate code" + System.lineSeparator();
				} }else {{
					__CLR4_4_18t8tlo0x9tpr.R.inc(352);Airport ap = new Airport(code, name, city, country, x, y); // create airport object
					__CLR4_4_18t8tlo0x9tpr.R.inc(353);tree.insert(code, ap, weight); // insert into tree
					__CLR4_4_18t8tlo0x9tpr.R.inc(354);output += "insert(" + code + "): successful {" + ap.getString("attributes")
							+ "} wt: " + weight + System.lineSeparator();
				}
			}}
			// -----------------------------------------------------
			// DELETE code
			// -----------------------------------------------------
			}else {__CLR4_4_18t8tlo0x9tpr.R.inc(355);if ((((cmd.compareTo("delete") == 0)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(356)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(357)==0&false))) {{
				__CLR4_4_18t8tlo0x9tpr.R.inc(358);String code = line.next(); // get parameters
				__CLR4_4_18t8tlo0x9tpr.R.inc(359);if ((((tree.find(code) == null)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(360)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(361)==0&false))) {{
					__CLR4_4_18t8tlo0x9tpr.R.inc(362);output += "delete(" + code + "): failure - nonexistent code" + System.lineSeparator();
				} }else {{
					__CLR4_4_18t8tlo0x9tpr.R.inc(363);tree.delete(code); // delete from tree
					__CLR4_4_18t8tlo0x9tpr.R.inc(364);output += "delete(" + code + "): successful" + System.lineSeparator();
				}
			}}
			// -----------------------------------------------------
			// CLEAR
			// -----------------------------------------------------
			}else {__CLR4_4_18t8tlo0x9tpr.R.inc(365);if ((((cmd.compareTo("clear") == 0)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(366)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(367)==0&false))) {{
				__CLR4_4_18t8tlo0x9tpr.R.inc(368);tree.clear(); // clear the tree
				__CLR4_4_18t8tlo0x9tpr.R.inc(369);output += "clear: successful" + System.lineSeparator();
			}
			// -----------------------------------------------------
			// FIND code
			// -----------------------------------------------------
			}else {__CLR4_4_18t8tlo0x9tpr.R.inc(370);if ((((cmd.compareTo("find") == 0)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(371)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(372)==0&false))) {{
				__CLR4_4_18t8tlo0x9tpr.R.inc(373);String code = line.next(); // get parameters
				__CLR4_4_18t8tlo0x9tpr.R.inc(374);Airport result = tree.find(code); // find in tree
				__CLR4_4_18t8tlo0x9tpr.R.inc(375);output += summarizeFind(cmd, code, result); // summarize result
			}
			// -----------------------------------------------------
			// FIND-DOWN code
			// -----------------------------------------------------
			}else {__CLR4_4_18t8tlo0x9tpr.R.inc(376);if ((((cmd.compareTo("find-down") == 0)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(377)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(378)==0&false))) {{
				__CLR4_4_18t8tlo0x9tpr.R.inc(379);String code = line.next(); // get parameters
				__CLR4_4_18t8tlo0x9tpr.R.inc(380);Airport result = tree.findDown(code); // find in tree
				__CLR4_4_18t8tlo0x9tpr.R.inc(381);output += summarizeFind(cmd, code, result); // summarize result
			}
			// -----------------------------------------------------
			// FIND-UP code
			// -----------------------------------------------------
			}else {__CLR4_4_18t8tlo0x9tpr.R.inc(382);if ((((cmd.compareTo("find-up") == 0)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(383)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(384)==0&false))) {{
				__CLR4_4_18t8tlo0x9tpr.R.inc(385);String code = line.next(); // get parameters
				__CLR4_4_18t8tlo0x9tpr.R.inc(386);Airport result = tree.findUp(code); // find in tree
				__CLR4_4_18t8tlo0x9tpr.R.inc(387);output += summarizeFind(cmd, code, result); // summarize result
			}
			// -----------------------------------------------------
			// GET-MIN
			// -----------------------------------------------------
			}else {__CLR4_4_18t8tlo0x9tpr.R.inc(388);if ((((cmd.compareTo("get-min") == 0)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(389)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(390)==0&false))) {{
				__CLR4_4_18t8tlo0x9tpr.R.inc(391);Airport result = tree.getMin(); // get min in tree
				__CLR4_4_18t8tlo0x9tpr.R.inc(392);output += summarizeGet(cmd, result); // summarize result
			}
			// -----------------------------------------------------
			// GET-MAX
			// -----------------------------------------------------
			}else {__CLR4_4_18t8tlo0x9tpr.R.inc(393);if ((((cmd.compareTo("get-max") == 0)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(394)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(395)==0&false))) {{
				__CLR4_4_18t8tlo0x9tpr.R.inc(396);Airport result = tree.getMax(); // get max in tree
				__CLR4_4_18t8tlo0x9tpr.R.inc(397);output += summarizeGet(cmd, result); // summarize result
			}
			// -----------------------------------------------------
			// PREORDER - get a preorder list of entries and print
			// the tree with indentation
			// -----------------------------------------------------
			}else {__CLR4_4_18t8tlo0x9tpr.R.inc(398);if ((((cmd.compareTo("preorder") == 0)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(399)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(400)==0&false))) {{
				__CLR4_4_18t8tlo0x9tpr.R.inc(401);ArrayList<String> entries = tree.getPreorderList();
				__CLR4_4_18t8tlo0x9tpr.R.inc(402);Iterator<String> iter = entries.iterator(); // iterator for the list
				__CLR4_4_18t8tlo0x9tpr.R.inc(403);output += "Preorder list:" + System.lineSeparator();
				__CLR4_4_18t8tlo0x9tpr.R.inc(404);while ((((iter.hasNext())&&(__CLR4_4_18t8tlo0x9tpr.R.iget(405)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(406)==0&false))) {{ // output the preorder list (flat)
					__CLR4_4_18t8tlo0x9tpr.R.inc(407);output += "  " + iter.next() + System.lineSeparator();
				}
				}__CLR4_4_18t8tlo0x9tpr.R.inc(408);output += treeStructure(entries); // summarize tree contents (indented)
			}
			// -----------------------------------------------------
			// Invalid command or empty
			// -----------------------------------------------------
			}else {{
				__CLR4_4_18t8tlo0x9tpr.R.inc(409);if ((((cmd.compareTo("") == 0)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(410)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(411)==0&false)))
					{__CLR4_4_18t8tlo0x9tpr.R.inc(412);System.err.println("Error: Empty line");
				}else
					{__CLR4_4_18t8tlo0x9tpr.R.inc(413);System.err.println("Error: Invalid command - \"" + cmd + "\"");
			}}
		}}}}}}}}}} catch (Exception | Error e) { // something went wrong?
			__CLR4_4_18t8tlo0x9tpr.R.inc(414);output = "Unexpected error encountered: " + e.getMessage() + System.lineSeparator();
			__CLR4_4_18t8tlo0x9tpr.R.inc(415);System.err.print(output);
			__CLR4_4_18t8tlo0x9tpr.R.inc(416);e.printStackTrace(System.err);
		} finally { // always executed
			__CLR4_4_18t8tlo0x9tpr.R.inc(417);line.close(); // close the input scanner
		}
		__CLR4_4_18t8tlo0x9tpr.R.inc(418);return output; // return summary output
	}finally{__CLR4_4_18t8tlo0x9tpr.R.flushNeeded();}}

	/**
	 * Summarize the results of the find commands.
	 * 
	 * @param cmd    The command (find, find-down, find-up)
	 * @param result The find result (null, if not found)
	 * @return String encoding the results
	 */
	static String summarizeFind(String cmd, String code, Airport result) {try{__CLR4_4_18t8tlo0x9tpr.R.inc(419);
		__CLR4_4_18t8tlo0x9tpr.R.inc(420);String output = new String(cmd + "(" + code + "): ");
		__CLR4_4_18t8tlo0x9tpr.R.inc(421);if ((((result != null)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(422)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(423)==0&false))) {{
			__CLR4_4_18t8tlo0x9tpr.R.inc(424);output += "found [" + result + "]" + System.lineSeparator();
		} }else {{
			__CLR4_4_18t8tlo0x9tpr.R.inc(425);output += "not found" + System.lineSeparator();
		}
		}__CLR4_4_18t8tlo0x9tpr.R.inc(426);return output;
	}finally{__CLR4_4_18t8tlo0x9tpr.R.flushNeeded();}}

	/**
	 * Summarize the results of the get command.
	 * 
	 * @param cmd    The command (get-min or get-max)
	 * @param result The find result (null, if not found)
	 * @return String encoding the results
	 */
	static String summarizeGet(String cmd, Airport result) {try{__CLR4_4_18t8tlo0x9tpr.R.inc(427);
		__CLR4_4_18t8tlo0x9tpr.R.inc(428);String output = new String(cmd + ": ");
		__CLR4_4_18t8tlo0x9tpr.R.inc(429);if ((((result != null)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(430)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(431)==0&false))) {{
			__CLR4_4_18t8tlo0x9tpr.R.inc(432);output += "found [" + result + "]" + System.lineSeparator();
		} }else {{
			__CLR4_4_18t8tlo0x9tpr.R.inc(433);output += "not found" + System.lineSeparator();
		}
		}__CLR4_4_18t8tlo0x9tpr.R.inc(434);return output;
	}finally{__CLR4_4_18t8tlo0x9tpr.R.flushNeeded();}}

	/**
	 * Print the tree contents with indentation.
	 * 
	 * @param entries List of entries in preorder
	 * @return String encoding the tree structure
	 */
	static String treeStructure(ArrayList<String> entries) {try{__CLR4_4_18t8tlo0x9tpr.R.inc(435);
		__CLR4_4_18t8tlo0x9tpr.R.inc(436);String output = "Tree structure:" + System.lineSeparator();
		__CLR4_4_18t8tlo0x9tpr.R.inc(437);Iterator<String> iter = entries.iterator(); // iterator for the list
		__CLR4_4_18t8tlo0x9tpr.R.inc(438);if ((((iter.hasNext())&&(__CLR4_4_18t8tlo0x9tpr.R.iget(439)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(440)==0&false))) {{ // tree is nonempty
			__CLR4_4_18t8tlo0x9tpr.R.inc(441);output += treeStructureHelper(iter, "  "); // print everything
		}
		}__CLR4_4_18t8tlo0x9tpr.R.inc(442);return output;
	}finally{__CLR4_4_18t8tlo0x9tpr.R.flushNeeded();}}

	/**
	 * Recursive helper for treeStructure. The argument iterator specifies the next
	 * node from the preorder list to be printed, and the argument indent indicates
	 * the indentation to be performed (of the form "| | | ...").
	 * 
	 * @param iter   Iterator for the entries in the list
	 * @param indent String indentation for the current line
	 */
	static String treeStructureHelper(Iterator<String> iter, String indent) {try{__CLR4_4_18t8tlo0x9tpr.R.inc(443);
		__CLR4_4_18t8tlo0x9tpr.R.inc(444);final String levelIndent = "| "; // the indentation for each level of the tree
		__CLR4_4_18t8tlo0x9tpr.R.inc(445);String output = "";
		__CLR4_4_18t8tlo0x9tpr.R.inc(446);if ((((iter.hasNext())&&(__CLR4_4_18t8tlo0x9tpr.R.iget(447)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(448)==0&false))) {{
			__CLR4_4_18t8tlo0x9tpr.R.inc(449);String entry = iter.next(); // get the next entry
			__CLR4_4_18t8tlo0x9tpr.R.inc(450);Boolean isExtern = (entry.length() > 0 && entry.charAt(0) == '['); // external?
			__CLR4_4_18t8tlo0x9tpr.R.inc(451);if ((((isExtern)&&(__CLR4_4_18t8tlo0x9tpr.R.iget(452)!=0|true))||(__CLR4_4_18t8tlo0x9tpr.R.iget(453)==0&false))) {{ // print external node entry
				__CLR4_4_18t8tlo0x9tpr.R.inc(454);output += indent + entry + System.lineSeparator();
			} }else {{
				__CLR4_4_18t8tlo0x9tpr.R.inc(455);output += treeStructureHelper(iter, indent + levelIndent); // print left subtree
				__CLR4_4_18t8tlo0x9tpr.R.inc(456);output += indent + entry + System.lineSeparator(); // print this node
				__CLR4_4_18t8tlo0x9tpr.R.inc(457);output += treeStructureHelper(iter, indent + levelIndent); // print right subtree
			}
		}} }else {{
			__CLR4_4_18t8tlo0x9tpr.R.inc(458);System.err.println("Unexpected trailing elements in entries list"); // shouldn't get here!
		}
		}__CLR4_4_18t8tlo0x9tpr.R.inc(459);return output;
	}finally{__CLR4_4_18t8tlo0x9tpr.R.flushNeeded();}}
}
