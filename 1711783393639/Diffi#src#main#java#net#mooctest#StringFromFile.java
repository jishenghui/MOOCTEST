package net.mooctest;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public final class StringFromFile {

    public static String readString(String fn) throws IOException {
        FileInputStream A = new FileInputStream(fn);
        BufferedInputStream B = new BufferedInputStream(A);
        byte b;
        StringBuffer sb = new StringBuffer();
        synchronized (sb) {
            while (B.available() > 0) {
                sb.append((char) B.read());
            }
        }
        B.close();
        return sb.toString();
    }
}