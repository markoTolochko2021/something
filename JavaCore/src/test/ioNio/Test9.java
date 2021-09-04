package test.ioNio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Test9 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\tmark\\Desktop\\TestIONIO\\M");

        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("directoryPath.getFileName() " + directoryPath.getFileName());
        System.out.println("-----------------------------------------");

        System.out.println("filePath " + filePath.getParent());
        System.out.println("directoryPath " + directoryPath.getParent());
        System.out.println("-----------------------------------------");

        System.out.println("filePath " + filePath.getRoot());
        System.out.println("directoryPath " + directoryPath.getRoot());
        System.out.println("-----------------------------------------");

        System.out.println("filePath " + filePath.isAbsolute());
        System.out.println("directoryPath " + directoryPath.isAbsolute());
        System.out.println("-----------------------------------------");

        System.out.println("filePath " + filePath.toAbsolutePath());
        System.out.println("directoryPath " + directoryPath.toAbsolutePath());
        System.out.println("-----------------------------------------");

        System.out.println("filePath " + filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath " + directoryPath.toAbsolutePath().getRoot());
        System.out.println("-----------------------------------------");


        System.out.println("directoryPath " + directoryPath.resolve(filePath));
        System.out.println("-----------------------------------------");

        System.out.println("filePath " + filePath.getFileName());
        System.out.println("directoryPath " + directoryPath.getFileName());
        System.out.println("-----------------------------------------");

        Path anotherPath = Paths.get("C:\\Users\\tmark\\Desktop\\TestIONIO\\M\\N\\Z\\test20.txt");
        System.out.println("directoryPath " + directoryPath.relativize(anotherPath));
        System.out.println("-----------------------------------------");

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if (!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }

        System.out.println("directory " + Files.isReadable(filePath));
        System.out.println("directory " + Files.isWritable(filePath));
        System.out.println("directory " + Files.isExecutable(filePath));

        Path filePath2 = Paths.get("C:\\Users\\tmark\\IdeaProjects\\JavaCore\\test15.txt");
        System.out.println("Files " + Files.isSameFile(filePath, filePath2));
        System.out.println("-----------------------------------------");
        System.out.println("Files " + Files.size(filePath));








    }
}
