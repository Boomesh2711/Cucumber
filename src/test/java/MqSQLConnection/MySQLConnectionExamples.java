package MqSQLConnection;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class MySQLConnectionExamples {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Mention the database type and the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Create a connection and define the database URL
        Connection connection= DriverManager.getConnection("jdbc:mysql://root@localhost/super_heros"); // jdbc:mysql://root@localhost/selenium_users
       // Create a statement object
        Statement statement=  connection.createStatement();
        // Execute SQL query
        ResultSet result= statement.executeQuery("select * from super_heros");
        // Iterate through the result set and print the values
     while(result.next()){  // next() method is used to move the cursor to the next row
         System.out.println("Name: "+result.getString("name")+" Nick name: "+result.getString("Nick Name") +" Power: "+result.getString("Power"));
     }

    }
}
