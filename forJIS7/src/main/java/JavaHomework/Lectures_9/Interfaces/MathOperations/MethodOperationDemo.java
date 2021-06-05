package JavaHomework.Lectures_9.Interfaces.MathOperations;

public class MethodOperationDemo {

    public static void main(String[] args) {

        OperationExecutor operationExecutor = new OperationExecutor();

        MathOperation [] mathOperations = new MathOperation[4];
        mathOperations[0] = new SummationOperation();
        mathOperations[1] = new DivisionOperation();
        mathOperations[2] = new MultiplicationOperation();
        mathOperations[3] = new SubtractionOperation();

        operationExecutor.execute(mathOperations, 20, 4);

    }
}
