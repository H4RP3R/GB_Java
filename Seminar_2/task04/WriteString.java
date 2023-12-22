// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteString {
    static private Logger logger = Logger.getLogger(WriteString.class.getName());

    static String repeatString(int n, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    static void writeStrToFile(String str) {
        try (FileWriter fw = new FileWriter("data.txt")) {
            fw.write(str);
            fw.flush();
            logger.info("Saved to file!");
        } catch (IOException e) {
            logger.warning(e.getMessage());
        }
    }

    public static void main(String[] args) {
        logger.setLevel(Level.ALL);

        String dataStr = repeatString(100, "TEST");
        writeStrToFile(dataStr);
    }
}
