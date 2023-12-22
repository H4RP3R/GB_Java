// Напишите метод, который определит тип (расширение) файлов из
// текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg

import java.io.File;

public class FileExtension {
    static File[] listFolderContent() {
        String path = System.getProperty("user.dir");
        File dir = new File(path);
        return dir.listFiles();
    }

    static void printExtensions(File[] folderContent) {
        for (int i = 0; i < folderContent.length; i++) {
            if (folderContent[i].isFile()) {
                String[] nameParts = folderContent[i].getName().split("[.]");
                String ex = nameParts[nameParts.length - 1];
                System.out.printf("%d Расширение файла: %s\n", i + 1, ex);
            }
        }
    }

    public static void main(String[] args) {
        File[] folderContent = listFolderContent();
        printExtensions(folderContent);
    }
}
