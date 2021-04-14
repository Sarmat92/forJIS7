package JavaHomework.Lectures_9.Interfaces.Animal;

import java.util.Objects;

public class Dog extends Mammal {

    private String dogName;

    public Dog() {
    }

    public Dog(String animalsName, String mammalName, String dogName) {
        super(animalsName, mammalName);
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(dogName, dog.dogName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dogName);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                '}';
    }

    @Override
    public void about() {
        System.out.println("about Dog");
    }

    @Override
    public void info() {
        System.out.println("Dog is " + getDogName() + " and extends from " + getMammalName() + " and " + getAnimalsName());
    }
}
