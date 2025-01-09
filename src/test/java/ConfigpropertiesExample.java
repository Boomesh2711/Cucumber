import com.beust.jcommander.Parameterized;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.cucumber.java.an.E;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class ConfigpropertiesExample {
    public static void main(String[] args) throws IOException {
        WebDriver driver;

        FileInputStream fileInputStream = new FileInputStream("config.properties"); // Create an object of FileInputStream
        Properties properties = new Properties(); // Create an object of Properties
        properties.load(fileInputStream); // Load the properties file
        String browser=properties.getProperty("browser"); // Get the value of browser property
        String driverpath=properties.getProperty("driverpath"); // Get the value of driverpath property
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",driverpath);
        }
        else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",driverpath);
        }
        else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver",driverpath);
        }
        else{
            System.out.println("Invalid browser");
        }
        WebDriverManager.chromedriver().setup();
        driver = new EdgeDriver();
       driver.get("https://www.google.com");

    }
}
