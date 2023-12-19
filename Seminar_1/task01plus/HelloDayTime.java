// В консоли запросить имя пользователя. В зависимости от
// текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.time.LocalTime;
import java.util.Scanner;

public class HelloDayTime {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = iScanner.nextLine();
        iScanner.close();

        LocalTime currentTime = LocalTime.now();
        LocalTime morning = LocalTime.parse("05:00:00");
        LocalTime day = LocalTime.parse("12:00:00");
        LocalTime evening = LocalTime.parse("18:00:00");
        LocalTime night = LocalTime.parse("23:00:00");

        if (currentTime.isBefore(morning)) {
            System.out.printf("Good night, %s!\n", userName);
        } else if (currentTime.isBefore(day)) {
            System.out.printf("Good morning, %s!\n", userName);
        } else if (currentTime.isBefore(evening)) {
            System.out.printf("Good day, %s!\n", userName);
        } else if (currentTime.isBefore(night)) {
            System.out.printf("Good evening, %s!\n", userName);
        }

    }
}