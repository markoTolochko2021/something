package test.ioNio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test10 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\tmark\\Desktop\\TestIONIO\\M");

        Files.copy(filePath,directoryPath.resolve("test16.txt"));
        System.out.println("Done!!!!");

       

    }
}
