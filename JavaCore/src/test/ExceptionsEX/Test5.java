package test.ExceptionsEX;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test5 {
    public static void main(String[] args) {
        try {
            File file = new File("test4.txt");
            FileInputStream fis = new FileInputStream(file);
        }
        catch (FileNotFoundException e){
            System.out.println("Exception 1: " + e);
        }
        catch (NullPointerException e){
            System.out.println("Exception 2: " + e);
        }
    }
}
