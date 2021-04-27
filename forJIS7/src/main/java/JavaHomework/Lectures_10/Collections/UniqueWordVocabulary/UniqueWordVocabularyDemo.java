package JavaHomework.Lectures_10.Collections.UniqueWordVocabulary;

public class UniqueWordVocabularyDemo {

    public static void main(String[] args) {

        var uniqueWordVocabulary = new UniqueWordVocabulary();

        uniqueWordVocabulary.setAdd("Hello");
        uniqueWordVocabulary.setAdd("hello");
        uniqueWordVocabulary.setAdd("Hello");
        uniqueWordVocabulary.setAdd(" ");
        uniqueWordVocabulary.setAdd("");
        uniqueWordVocabulary.showSetInformation();
        uniqueWordVocabulary.getWordsCount();
    }
}
