package Log4jExamples;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfigExample {
    static Logger logger = Logger.getLogger(BasicConfigExample.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger logger = Logger.getLogger(BasicConfigExample.class);
        logger.debug("This is debug message");
        logger.info("This is info message");
        logger.warn("This is warn message");
        logger.error("This is error message");
        logger.fatal("This is fatal message");

    }
}
