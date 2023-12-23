import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public void sort(int[] mas) throws IOException {
        log = new File("log.txt");
        fileWriter = new FileWriter(log);
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    int temp = mas[i + 1];
                    mas[i + 1] = mas[i];
                    mas[i] = temp;
                    sorted = false;
                }
            }
            LocalDateTime dateTimeNow = java.time.LocalDateTime.now();
            String dtnForm = dateTimeNow.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            String line = String.format("%s %s", dtnForm, Arrays.toString(mas));
            fileWriter.write(line);
            fileWriter.append(System.lineSeparator());
        }
        fileWriter.flush();
    }
}