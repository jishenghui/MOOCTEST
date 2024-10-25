package net.mooctest;
/* dcParseArgs - 用于简化 args[] 处理的 Java 库
 *
 * 版权所有 （C） 2008 Roland Koller <roland@devcity.de>
 *
 * 此库是免费软件;您可以重新分发它和/或
 * 根据 GNU Lesser General Public 的条款对其进行修改
 * 由 Free Software Foundation 发布的许可证;也
 * 许可证的 3.0 版，或（由您选择）任何更高版本。
 *
 * 分发此库是希望它有用，
 * 但没有任何保证;甚至没有
 * 适销性或特定用途的适用性。 参见 GNU
 * 宽通用公共许可证了解更多详情。
 *
 * 您应该已经收到了一份 GNU Lesser General Public 的副本
 * 与此库一起许可;如果没有，请写入 Free Software
 * Foundation， Inc.， 51 Franklin Street， Fifth Floor， Boston， MA 02110-1301 美国
 */


import java.util.ArrayList;
import java.util.List;

public class ArgsParser {

    public static final String SHORT_ARGUMENT_INDICATOR = "-";

    public static final String LONG_ARGUMENT_INDICATOR = "--";

    private String[] args; /* Eine Kopie der übergebenen Parameter */

    private String[] innerArgs; /*
     * Hier werden bereits geparste Felder mit null überschrieben
     */

    public ArgsParser() {
        super();
    }

    public ArgsParser(String[] args) {
        super();
        this.setArgs(args);
    }

    public int getArgsCount() {
        return args.length;
    }

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        if (args == null)
            throw new NullPointerException("args[] cannot be null.");

        this.args = new String[args.length];
        this.innerArgs = new String[args.length];

        for (int i = 0; i < args.length; ++i) {
            this.args[i] = args[i];
            this.innerArgs[i] = args[i];
        }
    }

    public int getArgsLeftCount() {
        int result = 0;
        for (int i = 0; i < innerArgs.length; ++i)
            if (innerArgs[i] != null)
                result++;
        return result;
    }

    public SwitchArgument parseSwitchArgument(String key) {
        boolean isLongKey = (key.length() > 1);

        if (isLongKey) {
            String searchFor = LONG_ARGUMENT_INDICATOR + key;
            for (int i = 0; i < args.length; ++i) {
                if (innerArgs[i] != null) {
                    if (innerArgs[i].equals(searchFor)) {
                        innerArgs[i] = null;
                        return new SwitchArgument(i, key, true);
                    }
                }
            }
        } else {
            int index;
            for (int i = 0; i < args.length; ++i) {
                if (innerArgs[i] != null) {
                    if (innerArgs[i].length() > 1 && (!innerArgs[i].startsWith(LONG_ARGUMENT_INDICATOR))) {
                        index = innerArgs[i].lastIndexOf(key);
                        if (index > 0) {
                            String before = innerArgs[i].substring(0, index);
                            String after = innerArgs[i].substring(index + 1, innerArgs[i].length());
                            innerArgs[i] = before + after;
                            if (innerArgs[i].replace(SHORT_ARGUMENT_INDICATOR, " ").trim().length() == 0)
                                innerArgs[i] = null;
                            return new SwitchArgument(i, key, true);
                        }
                    }
                }
            }
        }
        return new SwitchArgument(-1, key, false);
    }

    public ParameterArgument parseParameterArgument(String key) {
        boolean isLongKey = (key.length() > 1);

        if (isLongKey) {
            String searchFor = LONG_ARGUMENT_INDICATOR + key;
            for (int i = 0; i < innerArgs.length; ++i) {
                if (innerArgs[i] != null) {
                    if (innerArgs[i].equals(searchFor)) {
                        if ((innerArgs.length > (i + 1)) && (innerArgs[i] != null) && (innerArgs[i + 1] != null)) {
                            String value = innerArgs[i + 1];
                            innerArgs[i] = null;
                            innerArgs[i + 1] = null;
                            return new ParameterArgument(i, key, value);
                        } else {
                            /*
                             * Ende eines der Argumentenkette trotz erwartetem Parameter oder Parameterposition wurde schon vorher als
                             * Argument ausgewertet.
                             */
                            return null;
                        }
                    }
                }
            }
        } else {

            int index;
            for (int i = 0; i < args.length; ++i) {
                if (innerArgs[i] != null) {
                    if (innerArgs[i].length() > 1 && (innerArgs[i].startsWith(SHORT_ARGUMENT_INDICATOR))
                            && (!innerArgs[i].startsWith(LONG_ARGUMENT_INDICATOR))) {
                        index = innerArgs[i].indexOf(key);
                        if (index > 0) {
                            if ((index + 1) == innerArgs[i].length()) {
                                /*
                                 * Das letzte Element in einer Kurzargumentliste, ein Parameter muss also wenn überhaupt im nächsten
                                 * Argument liegen
                                 */
                                if ((innerArgs.length > (i + 1)) && (innerArgs[i] != null) && (innerArgs[i + 1]) != null) {
                                    String before = innerArgs[i].substring(0, index);
                                    String after = innerArgs[i].substring(index + 1, innerArgs[i].length());
                                    innerArgs[i] = before + after;
                                    if (innerArgs[i].replace(SHORT_ARGUMENT_INDICATOR, " ").trim().length() == 0)
                                        innerArgs[i] = null;
                                    String value = innerArgs[i + 1];
                                    innerArgs[i + 1] = null;
                                    return new ParameterArgument(i, key, value);
                                } else {
                                    /*
                                     * Ende eines der Argumentenkette trotz erwartetem Parameter oder Parameterposition wurde schon vorher
                                     * als Argument ausgewertet.
                                     */
                                    return null;
                                }
                            } else {
                                /*
                                 * Nicht das letzte Element einer Kurzargumentliste, der Parameter ist damit alles nach dem Index
                                 */
                                String before = innerArgs[i].substring(0, index);
                                String value = innerArgs[i].substring(index + 1, innerArgs[i].length());
                                innerArgs[i] = before;
                                if (innerArgs[i].replace(SHORT_ARGUMENT_INDICATOR, " ").trim().length() == 0)
                                    innerArgs[i] = null;
                                return new ParameterArgument(i, key, value);
                            }
                        }
                    }
                }
            }

        }

        /* nicht gefunden ... */
        return null;
    }

    public List<StringArgument> parseStringArgument() {
        List<StringArgument> result = new ArrayList<StringArgument>();
        for (int i = 0; i < args.length; ++i) {
            if (innerArgs[i] != null) {
                result.add(new StringArgument(i, innerArgs[i]));
                innerArgs[i] = null;
            }
        }
        return result;
    }

}
