import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyApp {
    private static final Logger logger = LogManager.getLogger(MyApp.class);
    public static void main(String[] args) {
        logger.error("This is an error message.");
        logger.debug("This is a debug message.");
        logger.info("This is an info message");
    }
}
