package test.ExceptionsEX;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File f = new File("test2.txt");
        FileInputStream fis = new FileInputStream(f);
        fis.read();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(100);
    }
}
