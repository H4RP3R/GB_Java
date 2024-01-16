// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXIV = 2024

// 'I', 1
// 'V', 5
// 'X', 10
// 'L', 50
// 'C', 100
// 'D', 500
// 'M', 1000

import java.util.HashMap;
import java.util.Map;

public class RomanToArabic {
    static Map<String, Integer> numsMap = new HashMap<>();

    static int convertToArabic(String romStr) {
        String[] romArr = romStr.split("");
        int arNum = 0;

        for (int i = 0; i < romArr.length; i++) {
            if (i < romArr.length - 1 && numsMap.get(romArr[i]) < numsMap.get(romArr[i + 1])
                    && "IXCM".contains(romArr[i])) {
                arNum += (numsMap.get(romArr[i + 1]) - numsMap.get(romArr[i]));
                i++;
            } else {
                arNum += numsMap.get(romArr[i]);
            }
        }

        return arNum;
    }

    public static void main(String[] args) {
        numsMap.put("I", 1);
        numsMap.put("V", 5);
        numsMap.put("X", 10);
        numsMap.put("L", 50);
        numsMap.put("C", 100);
        numsMap.put("D", 500);
        numsMap.put("M", 1000);

        System.out.println(convertToArabic("MMXXIV"));
        System.out.println(convertToArabic("MCMXCIX"));
    }
}