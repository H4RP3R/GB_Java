// Взять набор строк, например, Мороз и солнце день чудесный Еще ты дремлешь друг
// прелестный Пора красавица проснись.
// Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с
// одинаковой длиной не должны “потеряться”.

import java.util.Map;
import java.util.TreeMap;

public class StringsSorting {
    static Map<Double, String> sorStrByLength(String[] stringsArray) {
        Map<Double, String> strMap = new TreeMap<>();

        for (int i = 0; i < stringsArray.length; i++) {
            Double length = Double.valueOf(stringsArray[i].length());
            while (strMap.containsKey(length)) {
                length += 0.000001;
            }
            strMap.put(length, stringsArray[i]);
        }

        return strMap;
    }

    public static void main(String[] args) {
        String dataStr = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        String[] strArr = dataStr.split(" ");
        Map<Double, String> sortedStrdMap = sorStrByLength(strArr);

        for (String string : sortedStrdMap.values()) {
            System.out.println(string);
        }
    }
}