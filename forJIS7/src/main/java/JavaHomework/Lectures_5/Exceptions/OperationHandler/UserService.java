package JavaHomework.Lectures_5.Exceptions.OperationHandler;

public class UserService {

    public static void main(String[] args)  {

        User user = new User("Tolik", "Pipkin", 20);

        User.checkFirstName(user);

        User.checkLastName(user);

        User.checkAge(user);

    }


}
