package JavaHomework.Lectures_17.Stream.FirstTask;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstTask {

    public static Set<Integer>randomNumber(int count){
        return new Random()
                .ints(0,100)
                .distinct()
                .limit(count)
                .boxed()
                .filter(it -> it/2 == 0)
                .collect(Collectors.toSet());
    }
    public static void main(String[] args) {

        System.out.println(randomNumber(15));
    }
}
