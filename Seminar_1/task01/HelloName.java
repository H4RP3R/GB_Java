// Написать программу, которая запросит пользователя ввести
// <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String userName = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", userName);
        iScanner.close();
    }
}