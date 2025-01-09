package FileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPath {
    public static void main(String[] args) throws IOException {
        String content = "This is the content to write into file using Path";
        String loaction = "Path.txt";
      Path path= Paths.get(loaction);
      Files.write(path,content.getBytes());
    }
}
