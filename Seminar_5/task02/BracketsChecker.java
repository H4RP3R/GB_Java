// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketsChecker {
    static boolean verifyExpression(String expression) {
        Map<Character, Character> brMap = getBracketsMap();
        Stack<Character> openedBrackets = new Stack<>();

        for (Character br : expression.toCharArray()) {
            if (brMap.containsValue(br)) {
                openedBrackets.push(br);
            } else if (brMap.containsKey(br)) {
                if (openedBrackets.empty() || openedBrackets.pop() != brMap.get(br)) {
                    return false;
                }
            }
        }

        return openedBrackets.empty();
    }

    private static Map<Character, Character> getBracketsMap() {
        Map<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put(')', '(');
        bracketsMap.put(']', '[');
        bracketsMap.put('}', '{');
        bracketsMap.put('>', '<');

        return bracketsMap;
    }

    public static void main(String[] args) {
        String[] expressionsArr = { "a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", " <{a}+{(d*3)}>",
                "{a+]}{(d*3)}" };

        for (String exp : expressionsArr) {
            System.out.println(verifyExpression(exp));
        }
    }
}