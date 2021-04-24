package JavaHomework.Lectures_9.Interfaces.Animal;

import java.util.Objects;

public class Dog extends Mammal {

    private Integer countOfLegs;

    public Dog() {
    }

    public Dog(String name, Integer age, Integer countOfLegs) {
        super(name, age);
        this.countOfLegs = countOfLegs;
    }

    public Integer getCountOfLegs() {
        return countOfLegs;
    }

    public void setCountOfLegs(Integer countOfLegs) {
        this.countOfLegs = countOfLegs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(countOfLegs, dog.countOfLegs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), countOfLegs);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "countOfLegs=" + countOfLegs +
                '}';
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void run() {
        super.run();
    }
}
