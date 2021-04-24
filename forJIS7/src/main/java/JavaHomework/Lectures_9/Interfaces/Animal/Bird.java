package JavaHomework.Lectures_9.Interfaces.Animal;

import java.util.Objects;

public abstract class Bird extends Animals {

    private String featherColor;

    public Bird() {
    }

    public Bird(String name, String featherColor) {
        super(name);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(featherColor, bird.featherColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), featherColor);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                '}';
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void fly() {
        super.fly();
    }
}
