// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    static List<String> addBooks(String genre, String[] books) {
        List<String> genreList = new ArrayList<>();
        genreList.add(genre);
        for (String book : books) {
            genreList.add(book);
        }

        return genreList;
    }

    public static void main(String[] args) {
        List<List<String>> bookCatalog = new ArrayList<>();
        List<String> genreList1 = addBooks("sci-fi", new String[] { "Vanished birds", "book2", "book3" });
        List<String> genreList2 = addBooks("genre3", new String[] { "book4", "book5", "book6" });
        List<String> genreList3 = addBooks("genre2", new String[] { "book7", "book8", "book9" });

        bookCatalog.add(genreList1);
        bookCatalog.add(genreList2);
        bookCatalog.add(genreList3);

        for (var line : bookCatalog) {
            System.out.println(line);
        }
    }
}