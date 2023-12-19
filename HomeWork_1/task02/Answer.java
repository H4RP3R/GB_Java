import java.util.stream.IntStream;

class Answer {
    static public void printPrimeNums() {
        // Напишите свое решение ниже
        int[] numbers = IntStream.rangeClosed(2, 1000).toArray();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] != 0 && numbers[j] % numbers[i] == 0) {
                    numbers[j] = 0;
                }
            }
        }

        for (int num : numbers) {
            if (num != 0) {
                System.out.println(num);
            }
        }
    }
}