package FileReadingOperations;

import java.io.*;

public class UsingBufferedReader {
    public static void main(String[] args) throws IOException {
        // Define the path of the file
        String path = "BufferedWriter.txt";
        // Create a file reader object
        FileReader fileReader = new FileReader(path);
        // Create a buffered reader object
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String currentline=bufferedReader.readLine();

        while (currentline!=null){
            System.out.println(currentline);
            currentline=bufferedReader.readLine();
            System.out.printf("The current line is %s\n",currentline);
        }


        System.out.println(currentline);
        bufferedReader.close();


    }
}
