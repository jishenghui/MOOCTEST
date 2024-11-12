package net.mooctest;

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
public class BJTreeTester {

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

	public static void main(String[] args) {

		// configure to read from file rather than standard input/output
		if (!USE_STD_IO) {
			try {
				System.setIn(new FileInputStream(inputFileName));
				System.setOut(new PrintStream(outputFileName));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		try {
			Scanner scanner = new Scanner(System.in); // input scanner
			BJTree<String, Airport> bjTree = new BJTree<String, Airport>(); // create the tree
			CommandHandler commandHandler = new CommandHandler(bjTree); // initialize command handler
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine(); // input next line
				String output = commandHandler.processCommand(line); // process this command
				System.out.print(output); // output summary
			}
			scanner.close();
		} catch (Exception e) {
			System.err.println("Unexpected error: " + e.getMessage());
			e.printStackTrace(System.err);
		}
	}
}
