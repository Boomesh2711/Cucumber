package JSONOperation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Iterator;

public class JSONReadingExample {
    public static void main(String[] args) throws IOException, ParseException {
                // The code for reading JSON data from a file will be added here
        JSONParser jsonparser = new JSONParser();
        FileReader fileReader = new FileReader("src/test/java/JSONOperation/JSONExample.json");
        Object ParsedObject =jsonparser.parse(fileReader); // Parsing the JSON data from the file
        // Typecasting the parsed object to JSONObject because the parsed object is of type Object
        JSONObject jsonObject = (JSONObject) ParsedObject;
        String name =(String)jsonObject.get("name");  // Getting the value of the key "name"
        Long age = (Long)jsonObject.get("age");
        JSONArray array = (JSONArray)jsonObject.get("marks");  // Getting the value of array "marks"
        Iterator iterator= array.iterator();                   // Creating an iterator for the array
        while (iterator.hasNext()){                            // Iterating through the array
            System.out.println(iterator.next());
        }
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Is Student: "+jsonObject.get("isStudent"));
        System.out.println("Info: "+jsonObject.get("info"));

    }
}
