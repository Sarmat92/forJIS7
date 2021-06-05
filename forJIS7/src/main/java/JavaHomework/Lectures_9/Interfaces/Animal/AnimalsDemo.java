package JavaHomework.Lectures_9.Interfaces.Animal;

public class AnimalsDemo {

    public static void main(String[] args) {

        Cat cat = new Cat("Barsik",3,"Dark");
        System.out.println(cat.getName());
        cat.sleep();
        cat.run();
        System.out.println();

        Dog dog = new Dog("Friend", 12,4);
        System.out.println(dog.getName());
        dog.sleep();
        dog.run();
        System.out.println();

        Parrot parrot = new Parrot("Kesha","green-red","Song of silence");
        System.out.println(parrot.getName());
        parrot.sleep();
        parrot.fly();
    }
}
