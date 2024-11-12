package net.mooctest;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;

public class CMD {

    /**
     * 基类，用于在解析选项时可能抛出的异常
     */
    public static abstract class OptionException extends Exception {
        OptionException(String msg) {
            super(msg);
        }
    }

    /**
     * 当解析的命令行包含未识别的选项时抛出。`getMessage()` 返回适合报告给用户的错误字符串（英语）。
     */
    public static class UnknownOptionException extends OptionException {
        UnknownOptionException(String optionName) {
            this(optionName, "Unknown option '" + optionName + "'");
        }

        UnknownOptionException(String optionName, String msg) {
            super(msg);
            this.optionName = optionName;
        }

        /**
         * @return 未知选项的名称（例如 "-u"）
         */
        public String getOptionName() {
            return this.optionName;
        }

        private final String optionName;
    }

    /**
     * 当解析的命令行包含多个连接的短选项（如 -abcd），其中一个未知时抛出。`getMessage()` 返回适合报告给用户的错误字符串（英语）。
     */
    public static class UnknownSuboptionException extends UnknownOptionException {
        private char suboption;

        UnknownSuboptionException(String option, char suboption) {
            super(option, "Illegal option: '" + suboption + "' in '" + option + "'");
            this.suboption = suboption;
        }

        public char getSuboption() {
            return suboption;
        }
    }

    /**
     * 当解析的命令行包含多个连接的短选项（如 -abcd），其中一个或多个需要值时抛出。`getMessage()` 返回适合报告给用户的错误字符串（英语）。
     */
    public static class NotFlagException extends UnknownOptionException {
        private char notflag;

        NotFlagException(String option, char unflaggish) {
            super(option, "Illegal option: '" + option + "', '" +
                    unflaggish + "' requires a value");
            notflag = unflaggish;
        }

        /**
         * @return 第一个不是布尔值的字符（例如 'c'）
         */
        public char getOptionChar() {
            return notflag;
        }
    }

    /**
     * 当用户为需要值的选项提供了非法或缺失的值时抛出。`getMessage()` 返回适合报告给用户的错误字符串（英语）。
     * <p>
     * 由于泛型类不能扩展 `java.lang.Throwable`，因此我们返回 `Option<?>` 而不是 `Option<T>`。
     */
    public static class IllegalOptionValueException extends OptionException {
        public <T> IllegalOptionValueException(Option<T> opt, String value) {
            super("Illegal value '" + value + "' for option " +
                    (opt.shortForm() != null ? "-" + opt.shortForm() + "/" : "") +
                    "--" + opt.longForm());
            this.option = opt;
            this.value = value;
        }

        /**
         * @return 非法值的选项名称（例如 "-u"）
         */
        public Option<?> getOption() {
            return this.option;
        }

        /**
         * @return 非法值
         */
        public String getValue() {
            return this.value;
        }

        private final Option<?> option;
        private final String value;
    }

    /**
     * 表示命令行选项
     *
     * @param <T> 此选项配置的数据类型
     */
    public static abstract class Option<T> {

        protected Option(String longForm, boolean wantsValue) {
            this(null, longForm, wantsValue);
        }

        protected Option(char shortForm, String longForm, boolean wantsValue) {
            this(new String(new char[]{shortForm}), longForm, wantsValue);
        }

        private Option(String shortForm, String longForm, boolean wantsValue) {
            if (longForm == null) {
                throw new IllegalArgumentException("Null longForm not allowed");
            }
            this.shortForm = shortForm;
            this.longForm = longForm;
            this.wantsValue = wantsValue;
        }

        public String shortForm() {
            return this.shortForm;
        }

        public String longForm() {
            return this.longForm;
        }

        /**
         * 告诉此选项是否需要值
         */
        public boolean wantsValue() {
            return this.wantsValue;
        }

        public final T getValue(String arg, Locale locale) throws IllegalOptionValueException {
            if (this.wantsValue) {
                if (arg == null) {
                    throw new IllegalOptionValueException(this, "");
                }
                return this.parseValue(arg, locale);
            } else {
                return this.getDefaultValue();
            }
        }

        /**
         * 覆盖以提取和转换命令行传递的选项值
         */
        protected T parseValue(String arg, Locale locale) throws IllegalOptionValueException {
            return null;
        }

        /**
         * 覆盖以定义当选项不需要值时 `getValue` 返回的默认值
         */
        protected T getDefaultValue() {
            return null;
        }

        private final String shortForm;
        private final String longForm;
        private final boolean wantsValue;


        /**
         * 一个期望布尔值的选项
         */
        public static class BooleanOption extends Option<Boolean> {
            public BooleanOption(char shortForm, String longForm) {
                super(shortForm, longForm, false);
            }

            public BooleanOption(String longForm) {
                super(longForm, false);
            }

            @Override
            public Boolean parseValue(String arg, Locale locale) {
                return Boolean.TRUE;
            }

            @Override
            public Boolean getDefaultValue() {
                return Boolean.TRUE;
            }
        }

        /**
         * 一个期望整数值的选项
         */
        public static class IntegerOption extends Option<Integer> {
            public IntegerOption(char shortForm, String longForm) {
                super(shortForm, longForm, true);
            }

            public IntegerOption(String longForm) {
                super(longForm, true);
            }

            @Override
            protected Integer parseValue(String arg, Locale locale)
                    throws IllegalOptionValueException {
                try {
                    return new Integer(arg);
                } catch (NumberFormatException e) {
                    throw new IllegalOptionValueException(this, arg);
                }
            }
        }

        /**
         * 一个期望长整数值的选项
         */
        public static class LongOption extends Option<Long> {
            public LongOption(char shortForm, String longForm) {
                super(shortForm, longForm, true);
            }

            public LongOption(String longForm) {
                super(longForm, true);
            }

            @Override
            protected Long parseValue(String arg, Locale locale)
                    throws IllegalOptionValueException {
                try {
                    return new Long(arg);
                } catch (NumberFormatException e) {
                    throw new IllegalOptionValueException(this, arg);
                }
            }
        }

        /**
         * 一个期望浮点数值的选项
         */
        public static class DoubleOption extends Option<Double> {
            public DoubleOption(char shortForm, String longForm) {
                super(shortForm, longForm, true);
            }

            public DoubleOption(String longForm) {
                super(longForm, true);
            }

            @Override
            protected Double parseValue(String arg, Locale locale)
                    throws IllegalOptionValueException {
                try {
                    NumberFormat format = NumberFormat.getNumberInstance(locale);
                    Number num = (Number) format.parse(arg);
                    return new Double(num.doubleValue());
                } catch (ParseException e) {
                    throw new IllegalOptionValueException(this, arg);
                }
            }
        }

        /**
         * 一个期望字符串值的选项
         */
        public static class StringOption extends Option<String> {
            public StringOption(char shortForm, String longForm) {
                super(shortForm, longForm, true);
            }

            public StringOption(String longForm) {
                super(longForm, true);
            }

            @Override
            protected String parseValue(String arg, Locale locale) {
                return arg;
            }
        }
    }

        /**
         * 将指定的 Option 添加到接受的选项列表中
         */
        public final <T> Option<T> addOption(Option<T> opt) {
            if (opt.shortForm() != null) {
                this.options.put("-" + opt.shortForm(), opt);
            }
            this.options.put("--" + opt.longForm(), opt);
            return opt;
        }


        /**
         * 用于添加具有短形式和长形式的字符串选项的便捷方法。
         *
         * @param shortForm 选项的短形式，例如：'f' 表示文件名。
         * @param longForm  选项的长形式，例如："file"。
         * @return 新的 Option
         */
        public final Option<String> addStringOption(char shortForm, String longForm) {
            return addOption(new Option.StringOption(shortForm, longForm));
        }

        /**
         * 用于添加只有长形式的字符串选项的便捷方法。
         *
         * @param longForm 选项的长形式，例如："file"。
         * @return 新的 Option
         */
        public final Option<String> addStringOption(String longForm) {
            return addOption(new Option.StringOption(longForm));
        }

        /**
         * 用于添加具有短形式和长形式的整数选项的便捷方法。
         *
         * @param shortForm 选项的短形式，例如：'n' 表示数字。
         * @param longForm  选项的长形式，例如："number"。
         * @return 新的 Option
         */
        public final Option<Integer> addIntegerOption(char shortForm, String longForm) {
            return addOption(new Option.IntegerOption(shortForm, longForm));
        }

        /**
         * 用于添加只有长形式的整数选项的便捷方法。
         *
         * @param longForm 选项的长形式，例如："number"。
         * @return 新的 Option
         */
        public final Option<Integer> addIntegerOption(String longForm) {
            return addOption(new Option.IntegerOption(longForm));
        }

        /**
         * 用于添加具有短形式和长形式的长整数选项的便捷方法。
         *
         * @param shortForm 选项的短形式，例如：'l' 表示长整数。
         * @param longForm  选项的长形式，例如："long"。
         * @return 新的 Option
         */
        public final Option<Long> addLongOption(char shortForm, String longForm) {
            return addOption(new Option.LongOption(shortForm, longForm));
        }

        /**
         * 用于添加只有长形式的长整数选项的便捷方法。
         *
         * @param longForm 选项的长形式，例如："long"。
         * @return 新的 Option
         */
        public final Option<Long> addLongOption(String longForm) {
            return addOption(new Option.LongOption(longForm));
        }

        /**
         * 用于添加具有短形式和长形式的双精度浮点数选项的便捷方法。
         *
         * @param shortForm 选项的短形式，例如：'d' 表示双精度浮点数。
         * @param longForm  选项的长形式，例如："double"。
         * @return 新的 Option
         */
        public final Option<Double> addDoubleOption(char shortForm, String longForm) {
            return addOption(new Option.DoubleOption(shortForm, longForm));
        }

        /**
         * 用于添加只有长形式的双精度浮点数选项的便捷方法。
         *
         * @param longForm 选项的长形式，例如："double"。
         * @return 新的 Option
         */
        public final Option<Double> addDoubleOption(String longForm) {
            return addOption(new Option.DoubleOption(longForm));
        }


        /**
         * 添加一个具有短形式和长形式的布尔选项。
         *
         * @param shortForm 选项的短形式，例如：'v' 表示详细模式。
         * @param longForm  选项的长形式，例如："verbose"。
         * @return 新的 Option
         */
        public final Option<Boolean> addBooleanOption(char shortForm, String longForm) {
            return addOption(new Option.BooleanOption(shortForm, longForm));
        }

        /**
         * 用于添加只有长形式的布尔选项的便捷方法。
         *
         * @param longForm 选项的长形式，例如："verbose"。
         * @return 新的 Option
         */
        public final Option<Boolean> addBooleanOption(String longForm) {
            return addOption(new Option.BooleanOption(longForm));
        }

        /**
         * 相当于 {@link #getOptionValue(Option, Object) getOptionValue(o, null)}。
         *
         * @param o 选项对象
         * @return 选项的解析值
         */
        public final <T> T getOptionValue(Option<T> o) {
            return getOptionValue(o, null);
        }

        /**
         * 返回给定选项的解析值，如果选项未设置，则返回给定的默认值 'def'。
         *
         * @param o   选项对象
         * @param def 默认值
         * @return 选项的解析值或默认值
         */
        public final <T> T getOptionValue(Option<T> o, T def) {
            List<?> v = values.get(o.longForm());

            if (v == null) {
                return def;
            } else if (v.isEmpty()) {
                return null;
            } else {
                /* 铸造应该是安全的，因为 Option.parseValue 必须返回类型 T 的实例或 null */
                @SuppressWarnings("unchecked")
                T result = (T) v.remove(0);
                return result;
            }
        }

        /**
         * 返回给定选项的所有出现的解析值的集合，如果选项未设置，则返回空集合。
         *
         * @param option 选项对象
         * @return 选项的解析值集合
         */
        public final <T> Collection<T> getOptionValues(Option<T> option) {
            Collection<T> result = new ArrayList<T>();

            while (true) {
                T o = getOptionValue(option, null);

                if (o == null) {
                    return result;
                } else {
                    result.add(o);
                }
            }
        }

        /**
         * 返回非选项参数。
         *
         * @return 非选项参数数组
         */
        public final String[] getRemainingArgs() {
            return this.remainingArgs;
        }

        /**
         * 从给定的命令行参数列表中提取选项和非选项参数。使用默认区域设置解析可能与区域设置相关的选项值。
         *
         * @param argv 命令行参数数组
         * @throws OptionException 解析过程中发生错误时抛出
         */
        public final void parse(String[] argv) throws OptionException {
            parse(argv, Locale.getDefault());
        }

        /**
         * 从给定的命令行参数列表中提取选项和非选项参数。使用指定的区域设置解析可能与区域设置相关的选项值。
         *
         * @param argv   命令行参数数组
         * @param locale 区域设置
         * @throws OptionException 解析过程中发生错误时抛出
         */
        public final void parse(String[] argv, Locale locale) throws OptionException {
            ArrayList<Object> otherArgs = new ArrayList<Object>();
            int position = 0;
            this.values = new HashMap<String, List<?>>(10);
            while (position < argv.length) {
                String curArg = argv[position];
                if (curArg.startsWith("-")) {
                    if (curArg.equals("--")) { // 选项结束
                        position += 1;
                        break;
                    }
                    String valueArg = null;
                    if (curArg.startsWith("--")) { // 处理 --arg=value
                        int equalsPos = curArg.indexOf("=");
                        if (equalsPos != -1) {
                            valueArg = curArg.substring(equalsPos + 1);
                            curArg = curArg.substring(0, equalsPos);
                        }
                    } else if (curArg.length() > 2) {  // 处理 -abcd
                        for (int i = 1; i < curArg.length(); i++) {
                            Option<?> opt = this.options.get("-" + curArg.charAt(i));
                            if (opt == null) {
                                throw new UnknownSuboptionException(curArg, curArg.charAt(i));
                            }
                            if (opt.wantsValue()) {
                                throw new NotFlagException(curArg, curArg.charAt(i));
                            }
                            addValue(opt, null, locale);
                        }
                        position++;
                        continue;
                    }

                    Option<?> opt = this.options.get(curArg);
                    if (opt == null) {
                        throw new UnknownOptionException(curArg);
                    }

                    if (opt.wantsValue()) {
                        if (valueArg == null) {
                            position += 1;
                            if (position < argv.length) {
                                valueArg = argv[position];
                            }
                        }
                        addValue(opt, valueArg, locale);
                    } else {
                        addValue(opt, null, locale);
                    }

                    position += 1;
                } else {
                    otherArgs.add(curArg);
                    position += 1;
                }
            }
            for (; position < argv.length; ++position) {
                otherArgs.add(argv[position]);
            }

            this.remainingArgs = new String[otherArgs.size()];
            remainingArgs = otherArgs.toArray(remainingArgs);
        }

        private <T> void addValue(Option<T> opt, String valueArg, Locale locale) throws IllegalOptionValueException {
            T value = opt.getValue(valueArg, locale);
            String lf = opt.longForm();

            /* 铸造是类型安全的，因为我们在该方法中是唯一添加元素到 values 映射的地方 */
            @SuppressWarnings("unchecked")
            List<T> v = (List<T>) values.get(lf);

            if (v == null) {
                v = new ArrayList<T>();
                values.put(lf, v);
            }

            v.add(value);
        }

        private String[] remainingArgs = null;
        private Map<String, Option<?>> options = new HashMap<String, Option<?>>(10);
        private Map<String, List<?>> values = new HashMap<String, List<?>>(10);
    }

