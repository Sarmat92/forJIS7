package Lectures_1;
//**********@Checked***************//
public class RandomGenerationDemo {

    public static void main(String[] args) {


        double firstRandomNumber = Math.random() * 10;
        double secondRandomNumbers = Math.random() * 10;
        double thirdRandomNumbers = Math.random() * 10;

        double sumOfRandomNumbers = firstRandomNumber + secondRandomNumbers + thirdRandomNumbers;

        System.out.println("First random number: " + firstRandomNumber);
        System.out.println("Second random number: " + secondRandomNumbers);
        System.out.println("Third random number: " + thirdRandomNumbers);
        System.out.println("Sum of random numbers: " + sumOfRandomNumbers);
    }
}
