// Реализовать стэк с помощью массива.
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop(). 

public class MyStack {
    private Object[] arr;
    private int defaultCapacity = 8;
    private int size = 0;

    public MyStack() {
        arr = new Object[defaultCapacity];
    }

    public MyStack(int capacity) {
        arr = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public void push(Object obj) {
        if (size() < arr.length) {
            arr[size()] = obj;
        } else {
            Object[] newArr = new Object[(int) (size() * 1.5) + 1];
            System.arraycopy(arr, 0, newArr, 0, size());
            arr = newArr;
            arr[size()] = obj;
        }
        size++;
    }

    public Object peek() {
        if (size() > 0) {
            return arr[size() - 1];
        }

        return null;
    }

    public Object pop() {
        if (size() > 0) {
            Object value = arr[size() - 1];
            arr[size() - 1] = null;
            size--;
            return value;
        }

        return null;
    }

    public String toString() {
        if (size() <= 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size(); i++) {
            sb.append(arr[i]);
            sb.append(i < size() - 1 ? ", " : "]");
        }

        return sb.toString();
    }
}
