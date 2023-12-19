// Напишите метод, который находит самую длинную строку общего
// префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".

public class MaxPrefix {

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" }; // fl

        System.out.println(maxPrefix(strs));
    }

    static String maxPrefix(String[] wordsArr) {
        String pref = wordsArr[0];

        for (int i = 1; i < wordsArr.length; i++) {
            while (wordsArr[i].indexOf(pref) != 0) {
                pref = pref.substring(0, pref.length() - 1);
                if (pref.isEmpty()) {
                    return pref;
                }
            }
        }

        return pref;
    }
}