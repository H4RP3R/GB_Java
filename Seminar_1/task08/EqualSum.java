// Задан массив, например, nums = [1,7,3,6,5,6].
// Написать программу, которая найдет индекс i для этого массива
// такой, что сумма элементов с индексами < i равна сумме
// элементов с индексами > i.

import java.util.Arrays;
import java.util.stream.IntStream;

public class EqualSum {

    public static void main(String[] args) {
        int[] nums = { 2, 1, 7, 3, 6, 5, 6, 1, 1 };

        System.out.println(findIndex(nums));
    }

    private static int findIndex(int[] numsArr) {
        for (int i = 1; i < numsArr.length; i++) {
            if (IntStream.of(
                    Arrays.copyOfRange(numsArr, 0, i))
                    .sum() == IntStream.of(Arrays.copyOfRange(numsArr, i + 1, numsArr.length)).sum()) {
                return i;
            }
        }
        return -1;
    }
}