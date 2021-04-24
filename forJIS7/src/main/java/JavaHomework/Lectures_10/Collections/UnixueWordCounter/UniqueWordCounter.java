package JavaHomework.Lectures_10.Collections.UnixueWordCounter;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {

    public static Map<String, Integer> mapValue = new HashMap<>();
    static int counter = 1;

    public static void main(String[] args) {

        addWord("dog");
        addWord("dog");
        addWord("dog");
        addWord("cat");
        addWord("world");
        printWordsFrequency();
    }

    public static void addWord(String word) {
        for (Map.Entry<String, Integer> map : mapValue.entrySet()) {
            if (map.getKey().contains(word)) {
                counter++;
            }
        }
        mapValue.put(word, counter);
    }

    public static void printWordsFrequency() {
        for (Map.Entry<String, Integer> map : mapValue.entrySet()) {
            System.out.println(map.getKey() + " -> " + map.getValue());
        }
    }

    public static int getMostFrequentWord() {
        int frequentWord = mapValue.get(0);

        return frequentWord;
    }
}
