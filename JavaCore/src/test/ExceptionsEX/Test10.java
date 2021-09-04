package test.ExceptionsEX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test10 {
    FileInputStream fis1, fis2;
    public void abc(){
        try {
            fis1 = new FileInputStream("test2.txt");
            try {
                fis2 = new FileInputStream("test20.txt");
            }
            catch (FileNotFoundException e){
                System.out.println("file test2 not found");
            }
        }
        catch (FileNotFoundException e){
            System.out.println("file test20 not found");
        }
        finally {
            System.out.println("finally block");
            try {
                fis1.close();
                fis2.close();
            }
            catch (IOException e){
                System.out.println("Founded exception in finally");
            }
        }
    }

    public static void main(String[] args) {
        Test10 test10 = new Test10();
        test10.abc();
    }
}
