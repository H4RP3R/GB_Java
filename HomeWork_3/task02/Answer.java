import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Iterator<Integer> listIter = list.iterator();

        while (listIter.hasNext()) {
            if (listIter.next() % 2 == 0) {
                listIter.remove();
            }
        }

        System.out.println(list);
    }
}