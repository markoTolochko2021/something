package test.ioNio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        try(FileReader reader = new FileReader("test2.txt")) {
            int character;
            while ((character = reader.read()) != -1){
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
