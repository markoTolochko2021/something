package test.ioNio;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) throws IOException {

        File file = new File("test2.txt");
        File folder = new File("C:\\Users\\tmark\\Desktop\\TestIONIO\\A");

        File file2 = new File("C:\\Users\\tmark\\Desktop\\TestIONIO\\A\\test20.txt");
        File folder2 = new File("C:\\Users\\tmark\\Desktop\\TestIONIO\\B");


        System.out.println("file.getAbsolutePath()" + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath()"+folder.getAbsolutePath());
        System.out.println("--------------------------------------------------");

        System.out.println("file.isAbsolut()" + file.isAbsolute());
        System.out.println("folder.isAbsolut()"+folder.isAbsolute());
        System.out.println("--------------------------------------------------");

        System.out.println("file.idDirectory()" + file.isDirectory());
        System.out.println("folder.isDirectory()"+folder.isDirectory());
        System.out.println("--------------------------------------------------");

        System.out.println("file.exists()" + file.exists());
        System.out.println("folder.exists()"+folder.exists());
        System.out.println("--------------------------------------------------");

        System.out.println("file.exists()" + file2.exists());
        System.out.println("folder.exists()"+folder2.exists());
        System.out.println("--------------------------------------------------");

        System.out.println("file.createNewFile()" + file2.createNewFile());
        System.out.println("folder.mkdir()"+folder2.mkdir());
        System.out.println("--------------------------------------------------");

        System.out.println("file.exists()" + file.exists());
        System.out.println("folder.exists()"+folder.exists());
        System.out.println("--------------------------------------------------");

        System.out.println("file.exists()" + file2.exists());
        System.out.println("folder.exists()"+folder2.exists());
        System.out.println("--------------------------------------------------");

        System.out.println("file2.length()" + file2.length());
        System.out.println("folder2.length()"+folder2.length());
        System.out.println("--------------------------------------------------");

        System.out.println("file2.delete()" + file2.delete());
        System.out.println("folder2.delete()"+folder2.delete());
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");


        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));

        System.out.println();








    }
}
