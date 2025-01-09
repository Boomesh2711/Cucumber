package FileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {
    public static void main(String[] args) throws IOException {
        // Define the content to write into the file
        String content = "This is the content to write into file using BufferedWriter";
        // Define the path of the file
        String path = "BufferedWriter.txt";
        // Create a file writer object
        FileWriter fileWriter = new FileWriter(path);
        // Create a buffered writer object
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        // Write the content to the file
        bufferedWriter.write(content);
        // Close the buffered writer
        bufferedWriter.close();
    }
}
