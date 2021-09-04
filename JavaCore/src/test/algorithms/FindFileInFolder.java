package test.algorithms;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FindFileInFolder {
    public static void main(String[] args) {

        ArrayList<File> fileList = new ArrayList<>();
        searchFile(new File("D:\\"), fileList);
        for (File file: fileList){
            System.out.println(file.getAbsolutePath());
        }



    }
    private static void searchFile(File rootFile, List<File> fileList){
        if (rootFile.isDirectory()){
            System.out.println("searching at: " + rootFile.getAbsolutePath());
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null){
                for (File file: directoryFiles){
                    if (file.isDirectory()){
                        searchFile(file, fileList);
                    }
                    else {
                        if (file.getName().toLowerCase().endsWith(".jsp"));
                        fileList.add(file);
                    }
                }
            }
        }
    }
}
