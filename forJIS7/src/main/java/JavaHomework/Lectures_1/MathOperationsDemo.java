package JavaHomework.Lectures_1;
//**********@Checked***************//
public class MathOperationsDemo {

    public static void main(String[] args) {

        int firstNumber = 18;
        int secondNumbers = 2;

        summation(firstNumber, secondNumbers);
        subtract(firstNumber, secondNumbers);
        multiplication(firstNumber, secondNumbers);
        division(firstNumber, secondNumbers);

    }

    public static void summation(int firstNumber, int secondNumber) {
        int sumOfTwoNumbers = firstNumber + secondNumber;
        System.out.println(sumOfTwoNumbers);
    }

    public static void subtract(int firstNumber, int secondNumber) {
        int subtractOfTwoNumbers = firstNumber - secondNumber;
        System.out.println(subtractOfTwoNumbers);
    }

    public static void multiplication(int firstNumber, int secondNumber) {
        int multiplicationOfTwoNumbers = firstNumber * secondNumber;
        System.out.println(multiplicationOfTwoNumbers);
    }

    public static void division(int firstNumber, int secondNumber) {
        int divisionOfTwoNumbers = firstNumber / secondNumber;
        System.out.println(divisionOfTwoNumbers);
    }
}
