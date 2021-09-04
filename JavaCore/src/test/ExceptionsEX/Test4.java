package test.ExceptionsEX;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
    void abc() throws FileNotFoundException {
        File file = new File("test4.txt");

//        try {
            FileInputStream fis = new FileInputStream(file);
//        } catch (FileNotFoundException e) {
//            System.out.println("We catch exception " + e);
//        }
    }
        void def() throws FileNotFoundException{
            System.out.println("Hello");
//            try {
                abc();
//            } catch (FileNotFoundException e) {
//                System.out.println("We catch exception " + e);
//            }
        }
    public static void main(String[] args) /*throws FileNotFoundException */{

        Test4 t = new Test4();
        try {
            t.def();
        }
        catch (FileNotFoundException e){
            System.out.println("Exception: " + e);
            e.printStackTrace();

        }




        System.out.println("Have a good day!!");
    }
}
