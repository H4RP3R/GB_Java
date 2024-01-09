import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
        if (a.length < 2) {
            return a;
        }

        int mid = a.length / 2;
        int[] leftArr = Arrays.copyOfRange(a, 0, mid);
        int[] rightArr = Arrays.copyOfRange(a, mid, a.length);

        leftArr = mergeSort(leftArr);
        rightArr = mergeSort(rightArr);

        a = merge(leftArr, rightArr);

        return a;
    }

    public static int[] merge(int[] left, int[] right) {
        int[] mergedArr = new int[left.length + right.length];

        int i = 0, j = 0, n = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mergedArr[n++] = left[i++];
            } else {
                mergedArr[n++] = right[j++];
            }
        }

        while (i < left.length) {
            mergedArr[n++] = left[i++];
        }

        while (j < right.length) {
            mergedArr[n++] = right[j++];
        }

        return mergedArr;
    }
}