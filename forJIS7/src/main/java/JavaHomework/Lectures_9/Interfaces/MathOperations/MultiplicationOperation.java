package JavaHomework.Lectures_9.Interfaces.MathOperations;

public class MultiplicationOperation implements MathOperation{

    @Override
    public double compute(double a, double b) {
        double execute = a * b;
        System.out.println("Умножение");
        return execute;
    }
}
