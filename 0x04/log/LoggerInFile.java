import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerInFile {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLog");

        try {
            FileHandler fileHandler = new FileHandler("logs.txt");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            logger.info("teste de log");
            logger.info("Olá, eu sou o teste da classe principal");

        } catch (IOException e) {
            logger.severe("Erro ao configurar o FileHandler: " + e.getMessage());
        }
    }
}