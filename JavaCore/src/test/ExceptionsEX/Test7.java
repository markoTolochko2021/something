package test.ExceptionsEX;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test7 {
   static int abc() {
       int a = 5;
        try {
            File f = new File("Test3.txt");
            FileInputStream fis = new FileInputStream(f);

        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e);
            System.out.println( " a in catch block = " + a);
            return a;
        } finally {
            a =10;
            System.out.println("Finally");
            System.out.println("a in final block = " + a);
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(abc());
    }
}
