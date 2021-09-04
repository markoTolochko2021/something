package test.ioNio;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader("test2.txt"));
            BufferedWriter bufferedWriter =
                    new BufferedWriter(new BufferedWriter(new FileWriter("test3.txt") {
            }))){
//            int character;
//            while ((character = bufferedReader.read()) != -1){
//                bufferedWriter.write(character);
//            }
            String line;
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.write('\n');
            }
            System.out.println("Done!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
