package JavaHomework.Lectures_5.Exceptions.OperationHandler;

public class UserValidationException extends RuntimeException {

    UserValidationException(String massage) {
        super(massage);
    }
}
