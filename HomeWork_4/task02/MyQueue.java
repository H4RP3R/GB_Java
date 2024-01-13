import java.util.LinkedList;

class MyQueue<T> {
    // Напишите свое решение ниже
    public LinkedList<T> ll = new LinkedList<>();

    public void enqueue(T element) {
        // Напишите свое решение ниже
        this.ll.add(element);
    }

    public T dequeue() {
        // Напишите свое решение ниже
        return this.ll.pop();
    }

    public T first() {
        // Напишите свое решение ниже
        return this.ll.peek();

    }

    public LinkedList<T> getElements() {
        // Напишите свое решение ниже
        return ll;
    }
}