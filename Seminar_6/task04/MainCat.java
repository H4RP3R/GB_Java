// 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
// Поместите в него некоторое количество объектов.
// 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
// Убедитесь, что все они сохранились во множество.
// 3. Создайте метод public boolean equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
// должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
// 4. Создайте метод public int hashCode()
// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
// Objects.hash(...))
// 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat(100, "Мурзик", 3, "Белый");
        Cat cat2 = new Cat(101, "Васька", 5, "Рыжий");
        Cat cat3 = new Cat(102, "Мурка", 2, "Серый");

        Cat cat4 = new Cat(100, "Мурзик", 3, "Белый");
        Cat cat5 = new Cat(101, "Васька", 5, "Рыжий");
        Cat cat6 = new Cat(102, "Мурка", 2, "Серый");

        Set<Cat> clinicDB = new HashSet<>(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6));
        for (Cat cat : clinicDB) {
            System.out.println(cat);
        }
    }
}