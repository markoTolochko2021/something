package test.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {

        Scanner scan = null;

        Set<String> set = new TreeSet<>();
        try{
            scan = new Scanner(new FileReader(new File("C:\\Users\\tmark\\Desktop\\TestIONIO\\BibaAndBoba.txt")));
            scan.useDelimiter("\\w");
            while (scan.hasNext()){
                String word = scan.next();
                set.add(word);
            }
            for (String word: set){
                System.out.println(word);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Problem");
        }
        finally {
            scan.close();
        }



    }
}
