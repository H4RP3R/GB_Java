// Записать в файл следующие данные:
// Name Surname Age
// Kate Smith 20
// Paul Green 25
// Mike Black 23

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    static void WriteData(String[] strArr) {
        try (FileWriter fw = new FileWriter("data.txt", false)) {
            for (String str : strArr) {
                fw.write(str);
                fw.append("\n");
            }
            fw.flush();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    static void ReadFromFile(String filePath) {
        File file = new File(filePath);
        try (FileReader fr = new FileReader(file)) {
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        String[] dataArr = {
                "Name Surname Age",
                "Kate Smith 20",
                "Paul Green 25",
                "Mike Black 23",
        };

        WriteData(dataArr);
        ReadFromFile("data.txt");
    }
}