package net.mooctest;
public class Option {

    private String mname;
    private String mbeschriebung;
    private String mdelim;
    private boolean mhasArg;
    private String mdefaultv;
    private String mvalue;
    private boolean misSet;

    public Option(String name, String beschreibung, boolean hasArg, String delim, String defaultv) {
        this.mname = name;
        this.mbeschriebung = beschreibung;
        this.mdelim = delim;
        this.mhasArg = hasArg;
        this.mdefaultv = defaultv;
        misSet = false;
    }
    
    public Option(String name, String beschreibung) {
        this(name, beschreibung, false, "", "");
    }
    
    public Option(String name) {
        this(name, "", false, "", "");
    }
    
    public Option(String name, boolean hasArg, String delim, String defaultv) {
        this(name, "", hasArg, delim, defaultv);
    }

    public String getBeschriebung() {
        return mbeschriebung;
    }

    public String getDelim() {
        return mdelim;
    }

    public boolean isHasArg() {
        return mhasArg;
    }

    public String getName() {
        return mname;
    }

    public String getDefaultv() {
        return mdefaultv;
    }

    public boolean isIsSet() {
        return misSet;
    }

    public String getValue() {
        if (!mhasArg) {
            throw new RuntimeException("Option has no argument.");
        }
        if (!misSet) {
            throw new RuntimeException("Option is not set.");
        }
        return mvalue;
    }

    public boolean is(String s) {
        return s.startsWith((mname.isEmpty() ? "" : "-") + mname + (mhasArg ? mdelim : "")) && !misSet;
    }

    public void parse(String s) {
        misSet = true;
        if (mhasArg) {
            mvalue = s.substring(mname.length() + (mname.isEmpty() ? 0 : 1) + mdelim.length());
        } else {
            mvalue = mdefaultv;
        }
    }
}
