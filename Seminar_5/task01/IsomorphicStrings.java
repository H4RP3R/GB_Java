// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
// и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
// некоторую букву во втором слове, при этом:
//   1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
//   порядка следования. (Например, add - egg изоморфны)
//   2. буква может не меняться, а остаться такой же. (Например, note - code)

// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    static boolean areStringsIsomorphic(String str1, String str2) {
        String[] letterArr1 = str1.split("");
        String[] letterArr2 = str2.split("");
        Map<String, String> lettersMap = new HashMap<>();
        StringBuilder resurrectedString = new StringBuilder();

        for (int i = 0; i < letterArr1.length; i++) {
            lettersMap.put(letterArr1[i], letterArr2[i]);
        }

        for (String letter : letterArr1) {
            resurrectedString.append(lettersMap.get(letter));
        }

        return str2.equals(resurrectedString.toString());
    }

    public static void main(String[] args) {
        System.out.println(areStringsIsomorphic("add", "egg"));
        System.out.println(areStringsIsomorphic("note", "code"));
        System.out.println(areStringsIsomorphic("foo", "bar"));
        System.out.println(areStringsIsomorphic("paper", "title"));
    }
}
