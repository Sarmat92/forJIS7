package JavaHomework.Lectures_9.Interfaces.Animal;

import java.util.Objects;

public abstract class Mammal extends Animals {

    private Integer age;

    public Mammal() {
    }

    public Mammal(String name, Integer age) {
        super(name);
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Objects.equals(age, mammal.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "age=" + age +
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

    @Override
    public void fly() {
        super.fly();
    }
}
