package FileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {
    public static void main(String[] args) throws IOException {

        // Define the content to write into the file
        String content = "This is the content to write into file";
        // Define the path of the file
        String path = "sample.txt";

        FileWriter fileWriter= new FileWriter(path); // Create a file writer object
        fileWriter.write(content);                  // Write the content to the file
        fileWriter.close();                         // Close the file writer
    }
}
