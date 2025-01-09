package FileWritingOperations;

import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {
    public static void main(String[] args) throws IOException {
        // Define the content to write into the file
        String content = "This is the content to write into file using FileOutputStream happy learning";
        // Define the path of the file
        String path = "FileOutputStream.txt";

            // Create a file output stream object
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            // Convert the content into bytes
            byte[] writeThis = content.getBytes();
            // Write the content to the file
            fileOutputStream.write(writeThis);
            // Close the file output stream
            fileOutputStream.close();
                }

}
