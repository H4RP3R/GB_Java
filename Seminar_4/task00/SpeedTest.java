// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// Сравните с предыдущим.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpeedTest {
    public static void main(String[] args) {
        int max = 1_000_000;

        long start = System.currentTimeMillis();
        List<Integer> arrList = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            arrList.add(i);
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.printf("ArrayList add %d\n", elapsed);

        start = System.currentTimeMillis();
        LinkedList<Integer> lnkLst = new LinkedList<>();
        for (int i = 0; i < max; i++) {
            lnkLst.add(i);
        }
        finish = System.currentTimeMillis();
        elapsed = finish - start;
        System.out.printf("LinkedList add %d\n", elapsed);

        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            arrList.remove(0);
        }
        finish = System.currentTimeMillis();
        elapsed = finish - start;
        System.out.printf("ArrayList remove first %d\n", elapsed);

        start = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            lnkLst.removeFirst();
        }
        finish = System.currentTimeMillis();
        elapsed = finish - start;
        System.out.printf("LinkedList remove first %d\n", elapsed);
    }
}