package JavaHomework.Lectures_10.Collections.UniqueWordVocabulary;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {

    public Set<String> set = new HashSet();

    public void showSetInformation() {
        for (String setEach : set) {
            System.out.println(setEach);
        }
    }

    public void setAdd(String word) {
        if (!(word == null) || !word.isEmpty()) {
            set.add(word);
        }
    }

    public void getWordsCount() {
        int counter = 0;
        for (int i = 0; i < set.size(); i++) {
            counter++;
        }
        System.out.println("Число элементов в списке: " + counter);
    }
}
