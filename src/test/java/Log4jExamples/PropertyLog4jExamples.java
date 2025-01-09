package Log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyLog4jExamples

{
    static Logger logger = Logger.getLogger(PropertyLog4jExamples.class); // Create a Logger object
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello World");
        PropertyConfigurator.configure("log4j.properties"); // Configure the logger with properties file
        logger.debug("This is debug message");
        logger.info("This is info message");
        logger.warn("This is warn message");
        logger.error("This is error message");
        logger.fatal("This is fatal message");

    }
}
