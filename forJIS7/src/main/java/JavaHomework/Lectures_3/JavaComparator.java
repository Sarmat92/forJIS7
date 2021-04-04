package Lectures_3;

public class JavaComparator {

    public static void main(String[] args) {
        compare(5);
        compare(0);
        compare(-2);
    }

    public static void compare(int number) {

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else if (number == 0)
            System.out.println("Number is equal zero");
    }
}
