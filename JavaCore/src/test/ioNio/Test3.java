package test.ioNio;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {

        try (FileInputStream inputStream =
                new FileInputStream("C:\\Users\\tmark\\Desktop\\TestIONIO\\Marko Tolochko.jpg");
             FileOutputStream outputStream =
                     new FileOutputStream("Marko_Tolochko.jpg")
        ){
            int i;
            while ((i = inputStream.read()) != -1){
                outputStream.write(i);
            }
            System.out.println("Done!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}