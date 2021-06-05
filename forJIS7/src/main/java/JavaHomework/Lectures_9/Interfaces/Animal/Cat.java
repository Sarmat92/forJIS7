package JavaHomework.Lectures_9.Interfaces.Animal;

import java.util.Objects;

public class Cat extends Mammal {

    private String color;

    public Cat() {
    }

    public Cat(String name, Integer age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
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
