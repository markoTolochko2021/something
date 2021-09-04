package test.ExceptionsEX;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("Test2.txt");
            FileInputStream fis = new FileInputStream(f);

        } catch (FileNotFoundException e) {
            System.out.println("Exception");
            throw e;

        } finally {
            System.out.println("Finally");
        }
    }
    public static void main(String[] args) {

    }
}
