import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        var currentValue = phoneBook.putIfAbsent(name, new ArrayList<Integer>(List.of(phoneNum)));
        if (currentValue != null) {
            phoneBook.get(name).add(phoneNum);
        }
    }

    public ArrayList<Integer> find(String name) {
        ArrayList<Integer> searchResult = phoneBook.get(name);
        return searchResult != null ? searchResult : new ArrayList<>();
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
}