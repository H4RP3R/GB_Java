class HeapSort {
    public static void buildTree(int[] tree, int sortLength, int i) {
        // Введите свое решение ниже
        int maxPos = i;
        int leftPos = (2 * i) + 1;
        int rightPos = (2 * i) + 2;

        if (leftPos < sortLength && tree[leftPos] > tree[maxPos])
            maxPos = leftPos;

        if (rightPos < sortLength && tree[rightPos] > tree[maxPos])
            maxPos = rightPos;

        if (maxPos != i) {
            int temp = tree[i];
            tree[i] = tree[maxPos];
            tree[maxPos] = temp;

            buildTree(tree, sortLength, maxPos);
        }

    }

    public static void heapSort(int[] sortArray, int sortLength) {
        // Введите свое решение ниже
        for (int i = sortLength / 2 - 1; i >= 0; i--)
            buildTree(sortArray, sortLength, i);

        for (int i = sortLength - 1; i > 0; i--) {
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;

            buildTree(sortArray, i, 0);
        }
    }
}