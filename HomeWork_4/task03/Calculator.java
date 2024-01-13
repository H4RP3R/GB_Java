import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
    private static Deque<Double> results = new ArrayDeque<>();

    public double calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        switch (op) {
            case '+':
                results.add((double) (a + b));
                break;

            case '-':
                results.add((double) (a - b));
                break;

            case '*':
                results.add((double) (a * b));
                break;

            case '/':
                results.add((double) a / (double) b);
                break;

            case '<':
                results.removeLast();
                break;
        }

        return results.getLast();
    }
}