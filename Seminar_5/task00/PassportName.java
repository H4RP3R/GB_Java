// Создать структуру для хранения Номеров паспортов и Фамилий
// сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

import java.util.Map;
import java.util.TreeMap;

public class PassportName {
    public static void main(String[] args) {
        Map<Integer, String> passportData = new TreeMap<>();
        passportData.put(123456, "Иванов");
        passportData.put(321456, "Васильев");
        passportData.put(234561, "Петрова");
        passportData.put(234432, "Иванов");
        passportData.put(654321, "Петрова");
        passportData.put(345678, "Иванов");

        String targetName = "Иванов";
        for (Integer passportNumber : passportData.keySet()) {
            String name = passportData.get(passportNumber);
            if (name.equals(targetName)) {
                System.out.println("Номер паспорта: " + passportNumber + ", Фамилия: " + name);
            }
        }

    }
}