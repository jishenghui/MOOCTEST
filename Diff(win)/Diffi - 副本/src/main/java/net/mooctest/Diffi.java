package net.mooctest;
import java.util.Vector;


public final class Diffi {

    Vector<Option> options;

    public Diffi(Option... opts) {
        options = new Vector<Option>();
        for (Option o : opts) {
            options.add(o);
        }
    }

    public void addOption(Option obj) {
        options.addElement(obj);
    }

    public void parse(String[] args) {
        argloop:
        for (String s : args) {
            for (Option o : options) {
                if (o.is(s)) {
                    o.parse(s);
                    continue argloop;
                }
            }
        }
    }
}