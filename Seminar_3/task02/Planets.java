// Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его
// повторений в списке.
// Задание состоит из двух блоков
// Задание №2.2 (если выполнено первое задание)
// Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Planets {

    static List<String> makeRandomPlanetsList() {
        List<String> randomPlanets = new ArrayList<>();
        randomPlanets.add("Earth");
        randomPlanets.add("Mars");
        randomPlanets.add("Jupiter");
        randomPlanets.add("Earth");
        randomPlanets.add("Mercury");
        randomPlanets.add("Neptune");
        randomPlanets.add("Earth");
        randomPlanets.add("Mars");
        randomPlanets.add("Uranus");
        randomPlanets.add("Venus");
        randomPlanets.add("Saturn");
        randomPlanets.add("Saturn");

        return randomPlanets;
    }

    static void countRepeatPlanets(List<String> planets) {
        Collections.sort(planets);

        String currentPlanet = planets.get(0);
        int counter = 1;

        for (int i = 1; i < planets.size(); i++) {
            if (planets.get(i).equals(currentPlanet)) {
                counter++;
            } else {
                System.out.printf("%s\t%d\n", currentPlanet, counter);
                counter = 1;
                currentPlanet = planets.get(i);
            }
        }
        System.out.printf("%s\t%d\n", currentPlanet, counter);
    }

    static void removeDuplicates(List<String> planets) {
        Collections.sort(planets);

        String currentPlanet = "";
        int meetCounter = 0;
        Iterator<String> planetsIter = planets.iterator();

        while (planetsIter.hasNext()) {
            String pl = planetsIter.next();
            if (currentPlanet.equals(pl) && meetCounter > 0) {
                planetsIter.remove();
            } else {
                meetCounter = 0;
                currentPlanet = pl;
            }
            meetCounter++;
        }
    }

    static void removeDuplicates2(List<String> planets) {
        Collections.sort(planets);

        for (int i = planets.size() - 1; i > 0; i--) {
            if (planets.get(i).equals(planets.get(i - 1))) {
                planets.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        List<String> randomPlanets = makeRandomPlanetsList();
        System.out.println(randomPlanets);
        System.out.println();

        countRepeatPlanets(new ArrayList<>(randomPlanets));
        System.out.println();

        removeDuplicates2(randomPlanets);
        System.out.println(randomPlanets);
    }
}