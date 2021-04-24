package JavaHomework.Lectures_5.Exceptions.OperationHandler;

public class User {

    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void checkAge(User user) throws UserValidationException {
        if (user.getAge() > 0 && user.getAge() <= 120) {
            System.out.println("Отлично, " + user.getFirstName() + " " + user.getLastName() + ". "
                    + "Молоко на губах высохло и песок в трусы не сыпется!");
        }
        if (user.getAge() < 0){
            throw new UserValidationException("ЩЕНОК!!! Иди молоко на губах оботри!");
        }else if (user.getAge()>120){
            throw new UserValidationException("Иди-ка ты песок из трусишек высыпай!");
        }
    }

    public static void checkLastName(User user) throws UserValidationException {
        if (user.getLastName().length() >= 3 && user.getLastName().length() <= 15) {
            System.out.println("Фамилия " + user.getLastName() + " зарегистрирована.");
        } else throw new UserValidationException("Фамилия должна быть больше 3 и меньше 15");
    }

    public static void checkFirstName(User user) throws UserValidationException {
        if (user.getFirstName().length() >= 3 && user.getFirstName().length() <= 15) {
            System.out.println("Имя " + user.getFirstName() + " зарегистрировано.");
        } else throw new UserValidationException("Имя должно быть больше 3 и меньше 15");
    }
}
