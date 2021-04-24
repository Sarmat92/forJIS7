package JavaHomework.Lectures_10.Collections.UnixueWordCounter;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {

    public static Map<String, Integer> mapValue = new HashMap<>();

    public static void main(String[] args) {

        addWord("dog");
        addWord("dog");
        addWord("dog");
        addWord("cat");
        addWord("world");
        addWord("dog");
        printWordsFrequency();
        getMostFrequentWord();
    }

    public static void addWord(String word) {
        if (mapValue.containsKey(word)) {
            mapValue.put(word, mapValue.get(word) + 1);
        } else mapValue.put(word, 1);


    }

    public static void printWordsFrequency() {
        for (Map.Entry<String, Integer> map : mapValue.entrySet()) {
            System.out.println(map.getKey() + " -> " + map.getValue());
        }
    }

    public static void getMostFrequentWord() {
        Integer maxElement = 1;
        String result;

        for (Map.Entry<String, Integer> maxMap : mapValue.entrySet()) {
            if (maxMap.getValue() > maxElement) {
                maxElement = maxMap.getValue();
                result = maxMap.getKey();
                System.out.println("Чаще всего вводится -> " + result);
            }
        }
    }
}
