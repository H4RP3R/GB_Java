import java.util.Arrays;
import java.util.List;

public class Printer {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 21;
            op = '/';
            b = 5;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        List<Character> operators = Arrays.asList('+', '-', '*', '/');
        if (!operators.contains(op)) {
            System.out.printf("Некорректный оператор: '%s'\n", op);
            return;
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}