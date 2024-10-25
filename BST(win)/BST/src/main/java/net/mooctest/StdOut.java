/******************************************************************************
 *  Compilation:  javac StdOut.java
 *  Execution:    java StdOut
 *  Dependencies: none
 *
 *  Writes data of various types to standard output.
 *
 ******************************************************************************/

package net.mooctest;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/**
 * 此类提供了将字符串和数字打印到标准输出的方法。
 * <p>
 * <b>入门。</b>
 * 要使用这个类，你的 {@code StdOut.class} 中必须有 { StdOut.class}
 * Java 类路径。如果您使用了我们的自动安装程序，您应该已经准备好了。
 * 否则，请下载
 * <a href = “https://introcs.cs.princeton.edu/java/stdlib/StdOut.java”>StdOut.java</a>
 * 并在您的工作目录中放置一个副本。
 * <p>
 * 这是一个使用 {@code StdOut} 的示例程序：
 * <pre>
 * 公共类 TestStdOut {
 * public static void main（String[] args） {
 * int a = 17;
 * int b = 23;
 * int sum = a + b;
 * StdOut.println（“你好，世界”）;
 * StdOut.printf（“%d + %d = %d\n”， a， b， sum）;
 *       }
 *   }
 * </pre>
 * <p>
 * <b>与 System.out 的差异。</b>
 * {@code StdOut} 的行为类似于 {@link System#out}，
 * 但存在一些技术差异：
 * <ul>
 * <li> {@code StdOut} 将字符集编码强制为 UTF-8，
 * 这是 Unicode 的标准字符编码。
 * <li> {@code StdOut} 将 locale 强制为 {@link Locale#US}，
 * {@link Double#parseDouble（String）}，
 * 和浮点文本。
 * <li> {@code StdOut} 在每次调用 <em></em>
 * {@code print（）} ，以便文本立即出现在终端中。
 * </ul>
 * <p>
 * <b>参考资料。</b>
 * 有关其他文档，
 * 参见 <a href=“https://introcs.cs.princeton.edu/15inout”>第 1.5 节</a>
 * <em>计算机科学：一种跨学科方法</em>
 * 罗伯特·塞奇维克 （Robert Sedgewick） 和凯文·韦恩 （Kevin Wayne） 著。
 *
 * @author 罗伯特·塞奇维克
 * @author 凯文·韦恩
 */
public final class StdOut {

    // force Unicode UTF-8 encoding; otherwise it's system dependent
    private static final String CHARSET_NAME = "UTF-8";

    // assume language = English, country = US for consistency with StdIn
    private static final Locale LOCALE = Locale.US;

    // send output here
    private static PrintWriter out;

    // this is called before invoking any methods
    static {
        try {
            out = new PrintWriter(new OutputStreamWriter(System.out, CHARSET_NAME), true);
        }
        catch (UnsupportedEncodingException e) {
            System.out.println(e);
        }
    }

    // don't instantiate
    private StdOut() { }

   /**
     * Closes standard output.
     * @deprecated Calling close() permanently disables standard output;
     *             subsequent calls to StdOut.println() or System.out.println()
     *             will no longer produce output on standard output.
     */
    @Deprecated
    public static void close() {
        out.close();
    }

   /**
     * Terminates the current line by printing the line-separator string.
     */
    public static void println() {
        out.println();
    }

   /**
     * Prints an object to this output stream and then terminates the line.
     *
     * @param x the object to print
     */
    public static void println(Object x) {
        out.println(x);
    }

   /**
     * Prints a boolean to standard output and then terminates the line.
     *
     * @param x the boolean to print
     */
    public static void println(boolean x) {
        out.println(x);
    }

   /**
     * Prints a character to standard output and then terminates the line.
     *
     * @param x the character to print
     */
    public static void println(char x) {
        out.println(x);
    }

   /**
     * Prints a double to standard output and then terminates the line.
     *
     * @param x the double to print
     */
    public static void println(double x) {
        out.println(x);
    }

   /**
     * Prints an integer to standard output and then terminates the line.
     *
     * @param x the integer to print
     */
    public static void println(float x) {
        out.println(x);
    }

   /**
     * Prints an integer to standard output and then terminates the line.
     *
     * @param x the integer to print
     */
    public static void println(int x) {
        out.println(x);
    }

   /**
     * Prints a long to standard output and then terminates the line.
     *
     * @param x the long to print
     */
    public static void println(long x) {
        out.println(x);
    }

   /**
     * Prints a short integer to standard output and then terminates the line.
     *
     * @param x the short to print
     */
    public static void println(short x) {
        out.println(x);
    }

   /**
     * Prints a byte to standard output and then terminates the line.
     * <p>
     * To write binary data, see {@link BinaryStdOut}.
     *
     * @param x the byte to print
     */
    public static void println(byte x) {
        out.println(x);
    }

   /**
     * Flushes standard output.
     */
    public static void print() {
        out.flush();
    }

   /**
     * Prints an object to standard output and flushes standard output.
     * 
     * @param x the object to print
     */
    public static void print(Object x) {
        out.print(x);
        out.flush();
    }

   /**
     * Prints a boolean to standard output and flushes standard output.
     * 
     * @param x the boolean to print
     */
    public static void print(boolean x) {
        out.print(x);
        out.flush();
    }

   /**
     * Prints a character to standard output and flushes standard output.
     * 
     * @param x the character to print
     */
    public static void print(char x) {
        out.print(x);
        out.flush();
    }

   /**
     * Prints a double to standard output and flushes standard output.
     * 
     * @param x the double to print
     */
    public static void print(double x) {
        out.print(x);
        out.flush();
    }

   /**
     * Prints a float to standard output and flushes standard output.
     * 
     * @param x the float to print
     */
    public static void print(float x) {
        out.print(x);
        out.flush();
    }

   /**
     * Prints an integer to standard output and flushes standard output.
     * 
     * @param x the integer to print
     */
    public static void print(int x) {
        out.print(x);
        out.flush();
    }

   /**
     * Prints a long integer to standard output and flushes standard output.
     * 
     * @param x the long integer to print
     */
    public static void print(long x) {
        out.print(x);
        out.flush();
    }

   /**
     * Prints a short integer to standard output and flushes standard output.
     * 
     * @param x the short integer to print
     */
    public static void print(short x) {
        out.print(x);
        out.flush();
    }

   /**
     * Prints a byte to standard output and flushes standard output.
     *
     * @param x the byte to print
     */
    public static void print(byte x) {
        out.print(x);
        out.flush();
    }

   /**
     * Prints a formatted string to standard output, using the specified format
     * string and arguments, and then flushes standard output.
     *
     *
     * @param format the <a href = "http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax">format string</a>
     * @param args   the arguments accompanying the format string
     */
    public static void printf(String format, Object... args) {
        out.printf(LOCALE, format, args);
        out.flush();
    }

   /**
     * Prints a formatted string to standard output, using the locale and
     * the specified format string and arguments; then flushes standard output.
     *
     * @param locale the locale
     * @param format the <a href = "http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax">format string</a>
     * @param args   the arguments accompanying the format string
     */
    public static void printf(Locale locale, String format, Object... args) {
        out.printf(locale, format, args);
        out.flush();
    }
}

/******************************************************************************
 *  Copyright 2002-2018, Robert Sedgewick and Kevin Wayne.
 *
 *  This file is part of algs4.jar, which accompanies the textbook
 *
 *      Algorithms, 4th edition by Robert Sedgewick and Kevin Wayne,
 *      Addison-Wesley Professional, 2011, ISBN 0-321-57351-X.
 *      http://algs4.cs.princeton.edu
 *
 *
 *  algs4.jar is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  algs4.jar is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with algs4.jar.  If not, see http://www.gnu.org/licenses.
 ******************************************************************************/
