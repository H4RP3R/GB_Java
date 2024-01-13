import java.util.LinkedList;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        int mid = ll.size() / 2;
        for (int i = 0, j = ll.size() - 1; i < mid; i++, j--) {
            Object temp = ll.get(i);
            ll.set(i, ll.get(j));
            ll.set(j, temp);
        }
        return ll;
    }
}