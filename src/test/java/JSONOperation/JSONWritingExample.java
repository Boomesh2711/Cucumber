package JSONOperation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;


public class JSONWritingExample {
    public static void main(String[] args) throws IOException {
        JSONObject json = new JSONObject(); // Create a JSON object
        json.put("name", "John");        // Add key-value pairs
        json.put("age", 25);
        json.put("isStudent", false);
        json.put("marks", new int[]{90, 85, 80});
        System.out.println(json);
        JSONArray jsonArray = new JSONArray(); // Create a JSON array
        jsonArray.add("Johnny");
        jsonArray.add(30);

        json.put("info", jsonArray); // Add the JSON array to the JSON object
        FileWriter fileWriter=new FileWriter("src/test/java/JSONOperation/JSONExample.json"); // Create a file writer
        fileWriter.write(json.toJSONString()); // Write the JSON object to the file
        fileWriter.close(); // Close the file writer



    }
}
