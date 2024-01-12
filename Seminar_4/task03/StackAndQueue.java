// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди.

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {
    static void addToStack(Object[] objArr) {
        Stack<Object> baggageStack = new Stack<>();
        baggageStack.addAll(List.of(objArr));
        System.out.println(baggageStack);
    }

    static void addToQueue(Object[] objArr) {
        Queue<Object> baggageQueue = new LinkedList<>();
        baggageQueue.addAll(List.of(objArr));
        System.out.println(baggageQueue);
    }

    public static void main(String[] args) {
        String[] dataArr = { "носки", "трусы", "майка", "кеды" };

        addToStack(dataArr);
        addToQueue(dataArr);
    }
}