import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyAppTest {
    @Test
    public void testLogging() {
        Logger logger = LogManager.getLogger(MyApp.class);
        logger.error("This is an error message.");
        logger.debug("This is a debug message.");
        logger.info("This is an info message");

        // Verificar que los mensajes se han registrado correctamente en los archivos de salida
        assertTrue(new File("logs/error.log").exists());
        assertTrue(new File("logs/debug.log").exists());
        assertTrue(new File("logs/info.log").exists());

    }
}
