// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

public class Palindrome {
    static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equalsIgnoreCase(sb.reverse().toString());
    }

    public static void main(String[] args) {
        String inputString = "Наган";
        System.err.println(isPalindrome(inputString));
    }
}