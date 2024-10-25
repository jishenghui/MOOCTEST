package net.mooctest;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public final class RelativeString {

    private Vector<StringLink> links;
    private String absolute;

    public RelativeString() {
        links = new Vector<StringLink>();
        absolute = "";
    }

    public RelativeString(InputStream I) {
        this();
        try {
            DataInputStream iis = new DataInputStream(I);
            int linkcount = iis.readInt();
            byte[] data = new byte[12];
            for (int i = 0; i < linkcount; i++) {
                iis.read(data);
                links.add(new StringLink(data));
            }
            int abslen=iis.readInt();
            data = new byte[abslen];
            iis.read(data);
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<abslen;i++)
                sb.append((char)data[i]);
            absolute=sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getAbsolute() {
        return absolute;
    }

    public void setAbsolute(String absolute) {
        this.absolute = absolute;
    }

    public int linksCount() {
        return links.size();
    }

    public StringLink getLink(int index) {
        return links.elementAt(index);
    }

    public boolean addLink(StringLink e) {
        return links.add(e);
    }

    @Override
    public String toString() {
        return linksCount() + " links, " + absolute.length() + " absolute chars (" + (8 + absolute.length() + linksCount() * 12) + " Bytes ^= -" + bytessaved() + "Bytes)";
    }

    public void debugPrint() {
        System.out.println("Debugprint: " + this);
        for (int i = 0; i < links.size(); i++) {
            System.out.format("(%0" + (Math.round(Math.floor(Math.log10(links.size()))) + 1) + "d)", i);
            System.out.println(" " + links.elementAt(i));
        }
        System.out.println("[" + absolute + "]");
    }

    public void bytesToStream(OutputStream os) {
        try {
            DataOutputStream oos = null;
            oos = new DataOutputStream(os);
            oos.writeInt(links.size());
            for (int i = 0; i < links.size(); i++) {
                oos.write(links.elementAt(i).toBytes());
            }
            oos.writeInt(absolute.length());
            oos.writeBytes(absolute);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private int bytessaved() {
        int result = -8;
        for (int i = 0; i < links.size(); i++) {
            result += (links.elementAt(i).getLen() - 12);
        }
        return result;
    }
    public int getLength()
    {
        int result = absolute.length();
        for (int i = 0; i < links.size(); i++) {
            result += (links.elementAt(i).getLen());
        }
        return result;
    }
}