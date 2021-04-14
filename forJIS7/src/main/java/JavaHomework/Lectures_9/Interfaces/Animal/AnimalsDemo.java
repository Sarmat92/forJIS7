package JavaHomework.Lectures_9.Interfaces.Animal;

public class AnimalsDemo {

    public static void main(String[] args) {

        Animals animals = new Animals("Father of all animals");
        animals.info();
        animals.about();
        System.out.println();

        Animals animalsMammal = new Mammal("Father of all animals","Father of all mammal");
        animalsMammal.info();
        animalsMammal.about();
        System.out.println();

        Animals animalsCat = new Cat("Father of all animals","Father of all mammal","Boris");
        animalsCat.info();
        animalsCat.about();
        System.out.println();

        Animals animalDog = new Dog("Father of all animals","Father of all mammal","Druzok");
        animalDog.info();
        animalDog.about();
        System.out.println();

        Animals animalBird = new Bird("Father of all animals","Chirik");
        animalBird.info();
        animalBird.about();
        System.out.println();

        Animals animalParrot = new Parrot("Father of all animals","Chirik","Ara");
        animalParrot.info();
        animalParrot.about();
    }
}
