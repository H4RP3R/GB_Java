import java.util.LinkedList;

class MyQueue<T> {
    // Напишите свое решение ниже
    private LinkedList<T> ll = new LinkedList<>();

    public void enqueue(T element) {
        // Напишите свое решение ниже
        ll.add(element);
    }

    public T dequeue() {
        // Напишите свое решение ниже
        return ll.pop();
    }

    public T first() {
        // Напишите свое решение ниже
        return ll.peek();

    }

    public LinkedList<T> getElements() {
        // Напишите свое решение ниже
        return ll;
    }
}