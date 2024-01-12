// Реализовать стэк с помощью массива.
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop(). 

public class MyStack {
    Object[] arr;

    public MyStack() {
        arr = new Object[8];
    }

    public int size() {
        int size = 0;
        for (Object obj : this.arr) {
            if (obj != null) {
                size++;
            }
        }

        return size;
    }

    public void push(Object obj) {
        if (this.size() < this.arr.length) {
            this.arr[this.size()] = obj;
        } else {
            Object[] newArr = new Object[this.size() * 2];
            System.arraycopy(this.arr, 0, newArr, 0, this.size());
            this.arr = newArr;
            this.arr[this.size()] = obj;
        }
    }

    public Object peek() {
        return this.arr[this.size() - 1];
    }

    public Object pop() {
        Object value = this.arr[this.size() - 1];
        this.arr[this.size() - 1] = null;

        return value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.size(); i++) {
            sb.append(this.arr[i]);
            sb.append(i < this.size() - 1 ? ", " : "]");
        }

        return sb.toString();
    }
}
