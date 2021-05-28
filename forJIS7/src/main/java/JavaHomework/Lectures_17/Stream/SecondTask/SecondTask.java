package JavaHomework.Lectures_17.Stream.SecondTask;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondTask {

    public static Set<String> stringSet = new HashSet<>();

    public static void main(String[] args) {

        stringSet.add("расстрел");
        stringSet.add("пидарас");
        stringSet.add("рас");
        stringSet.add("два");
        stringSet.add("рассвет");
        stringSet.add("закат");

        setStringSet("рас");

    }

    public static void setStringSet(String string) {
        Set<String> startEnd = stringSet.stream()
                .filter(it -> it.endsWith(string) | it.startsWith(string))
                .collect(Collectors.toSet());
        System.out.println(startEnd);


    }
}
