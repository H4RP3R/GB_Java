// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringsDeque {
    static private Logger logger = Logger.getLogger(StringsDeque.class.getName());

    static void handleStringFromInput(Deque<String> storage) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = iScanner.nextLine();
        String message = "";

        switch (userInput) {
            case "print":
                reversedPrint(storage);
                break;

            case "revert":
                String str = storage.pollLast();
                if (str != null) {
                    message = String.format("Delete '%s' %s", str, storage);
                } else {
                    message = "Nothing to delete";
                }
                logger.info(message);
                break;

            default:
                storage.add(userInput);
                message = String.format("String saved! %s", storage);
                logger.info(message);
                break;
        }
    }

    static void reversedPrint(Deque<String> strDeque) {
        Iterator<String> strDequeIter = strDeque.descendingIterator();

        System.out.println();
        while (strDequeIter.hasNext()) {
            System.out.println(strDequeIter.next());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        logger.setLevel(Level.ALL);
        Deque<String> stringsDeque = new ArrayDeque<>();

        while (true) {
            handleStringFromInput(stringsDeque);
        }
    }
}