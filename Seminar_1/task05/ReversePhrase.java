// Во фразе "Добро пожаловать на курс по Java" переставить слова
// в обратном порядке.

public class ReversePhrase {
    public static void main(String[] args) {
        System.out.println(phraseReverse("Добро пожаловать на курс по Java"));
    }

    static String phraseReverse(String phrase) {
        String[] words = phrase.split(" ");

        for (int i = 0, j = words.length - 1; i < j; i++, j--) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }

        return String.join(" ", words);
    }
}