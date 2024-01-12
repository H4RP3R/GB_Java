// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

import java.util.LinkedList;
import java.util.Scanner;

public class StringHandler {
    static String[] getUserInput() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter a string like 'text~num': ");
        String userInput = iScanner.nextLine();

        return userInput.split("~");
    }

    static void handleInput(String[] inputArr, LinkedList<String> strStorage) {
        String text = inputArr[0];
        int num = 0;

        try {
            num = Integer.parseInt(inputArr[1]);
        } catch (Exception e) {
            System.err.println(e);
        }

        switch (text) {
            case "print":
                try {
                    System.out.println(strStorage.get(num));
                    strStorage.remove(num);
                } catch (Exception e) {
                    System.err.println(e);
                }
                break;

            default:
                try {
                    strStorage.add(num, text);
                } catch (Exception e) {
                    System.err.println(e);
                }
                break;
        }

        System.out.println(strStorage);
    }

    public static void main(String[] args) {
        LinkedList<String> stringsStorage = new LinkedList<>();

        while (true) {
            String[] userInputArr = getUserInput();
            handleInput(userInputArr, stringsStorage);
        }
    }
}