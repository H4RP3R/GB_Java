// Настроить проект, вывести в консоль “Hello world!”.
// Вывести в консоль системные дату и время.

import java.time.LocalDateTime;

public class HelloWorldDate {

    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Hello World!");
        System.out.println(currentDateTime);
    }
}