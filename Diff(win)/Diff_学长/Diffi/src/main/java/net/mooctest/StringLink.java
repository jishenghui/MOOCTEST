package net.mooctest;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class StringLink {

    private int posOrig;
    private int posNew;
    private int len;

    public StringLink(int posOrig, int posNew, int len) {
        this.posOrig = posOrig;
        this.posNew = posNew;
        this.len = len;
    }

    public StringLink(byte[] data) {
        DataInputStream iis = null;
        try {
            ByteArrayInputStream bos = new ByteArrayInputStream(data);
            iis = new DataInputStream(bos);
            len = iis.readInt();
            posOrig = iis.readInt();
            posNew = iis.readInt();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                iis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public int getLen() {
        return len;
    }

    public int getPosNew() {
        return posNew;
    }

    public int getPosOrig() {
        return posOrig;
    }

    @Override
    public String toString() {
        return "{" + len + ": " + posOrig + "-->" + posNew + "}";
    }

    public byte[] toBytes() {
        DataOutputStream oos = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream(12);
            oos = new DataOutputStream(bos);
            oos.writeInt(len);
            oos.writeInt(posOrig);
            oos.writeInt(posNew);
            oos.flush();
            return bos.toByteArray();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }
}