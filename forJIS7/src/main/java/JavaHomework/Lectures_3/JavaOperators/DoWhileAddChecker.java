package JavaHomework.Lectures_3.JavaOperators;

public class DoWhileAddChecker {

    public static void main(String[] args) {

        int number = 0;

        do {
            if (!((number%2) == 0)){
                System.out.print(number + " ");
            }
            number++;
        }while (number <= 50);
    }
}
