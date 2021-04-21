package JavaHomework.Lectures_9.Interfaces.MathOperations;

public class OperationExecutor {

    void execute(MathOperation[]operations, double a, double b){
        for (MathOperation mathOperation: operations) {
            System.out.println(mathOperation.compute(a,b));
        }
    }
}
