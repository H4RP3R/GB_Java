// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;

public class MoveNumsToTheRight {

    public static void main(String[] args) {
        // int[] nums = { 3, 2, 2, 3 };
        int[] nums = { 1, 2, 3, 4, 5, 3, 6, 7, 3, 3, 8, 9, 3 };
        System.out.println(Arrays.toString(nums));

        moveNumsToTheRight(nums);

        System.out.println(Arrays.toString(nums));
    }

    private static void moveNumsToTheRight(int[] arr) {
        int val = 3;
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (arr[i] == val) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            } else {
                i++;
            }
        }
    }
}