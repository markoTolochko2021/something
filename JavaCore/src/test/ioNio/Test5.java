package test.ioNio;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test5 {
    public static void main(String[] args) {

        try (RandomAccessFile file =
                new RandomAccessFile("test10.txt" , "rw")
                ){
          /*  int a = file.read();
            System.out.println((char) a);*/

           /* a = file.read();
            System.out.println((char) a);*/

            file.seek(110);
            String s = file.readLine();
            System.out.println(s);

            long position = file.getFilePointer();
            System.out.println(position);

           /* file.seek(0);
            file.writeBytes("Hello");*/
            file.seek(file.length() -1);
            file.writeBytes("\n\t\t\t\tTaras Shevchenko");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
