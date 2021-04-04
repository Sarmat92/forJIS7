package JavaHomework.Lectures_3;

import java.util.Scanner;

public class PhraseAnalyser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово: ");
        String words = scanner.nextLine();
        System.out.println(phraseAnalyser(words));
    }

    public static String phraseAnalyser(String str) {
        if (str.startsWith("Make") && str.endsWith("great again")) {
            return "It stands no chance";
        } else if (str.startsWith("Make") || str.endsWith("great again")) {
            return "It could be worse";
        } else return "It is fine, really";
    }
}
