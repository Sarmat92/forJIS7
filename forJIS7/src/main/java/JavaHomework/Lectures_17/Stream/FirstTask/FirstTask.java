package JavaHomework.Lectures_17.Stream.FirstTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstTask {

    public static Set<Integer> randomNumber(int count) { // первый вариант
        return new Random()
                .ints(0, 100)
                .distinct()
                .limit(count)
                .boxed()
                .filter(it -> it % 2 == 0)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {

        System.out.println(randomNumber(15));

        randomNumber();                             // второй вариант
        System.out.println(randomList);
        randomList.stream()
                .filter(it -> it % 2 == 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static List<Integer> randomList = new ArrayList<>();

    public static void randomNumber() {
        for (int i = 0; i < 10; i++) {
            randomList.add((int) (Math.random() * 100));
        }
    }
}
