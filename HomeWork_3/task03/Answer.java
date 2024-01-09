import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        List<Integer> numbers = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(numbers);

        System.out.println(numbers);
        System.out.printf("Minimum is %d\n", numbers.get(0));
        System.out.printf("Maximum is %d\n", numbers.get(numbers.size() - 1));

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.size();

        System.out.printf("Average is = %s\n", average);
    }
}