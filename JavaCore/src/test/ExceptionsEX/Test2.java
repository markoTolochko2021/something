package test.ExceptionsEX;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("test2.txt");

        try {
            FileInputStream fis = new FileInputStream(file);
        }
        catch (FileNotFoundException e){
            System.out.println("We catch exception " +  e);
        }
        finally {
            System.out.println("finaly: Good luck");
        }
        System.out.println("Have a good day!!");
    }
}
