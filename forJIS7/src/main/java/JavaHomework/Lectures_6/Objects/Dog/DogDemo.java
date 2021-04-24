package JavaHomework.Lectures_6.Objects.Dog;

public class DogDemo {

    public static void main(String[] args) {

        Dog barbos = new Dog("Black","GangstaBarbos",3);

        System.out.println(barbos);
        barbos.eat();
        barbos.sleep();
        barbos.voice();
    }

}
