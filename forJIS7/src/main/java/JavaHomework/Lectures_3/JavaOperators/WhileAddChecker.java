package JavaHomework.Lectures_3.JavaOperators;

public class WhileAddChecker {
    public static void main(String[] args) {

        int number = 0;

        while (number <= 50){
            if (!((number%2) ==0)){
                System.out.print(number + " ");
            }
            number++;
        }
    }
}
