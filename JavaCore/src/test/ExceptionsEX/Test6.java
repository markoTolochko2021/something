package test.ExceptionsEX;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("Test2.txt");
            System.out.println("object file ready");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("stream ready");
            int counter = 0;
            while (true){
                counter++;
                result.append(fis.read());
                System.out.println("info reading");
                if (counter == 3){
                    fis.close();
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Exception 1" + e);
        }
        catch (IOException e){
            System.out.println("Exception 2" + e);
        }
        finally {
            System.out.println("Finally");
        }
    }
}
