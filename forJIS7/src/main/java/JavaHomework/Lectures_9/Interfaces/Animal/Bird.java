package JavaHomework.Lectures_9.Interfaces.Animal;

import java.util.Objects;

public class Bird extends Animals {

    private String birdName;

    public Bird() {
    }


    public Bird(String animalsName, String birdName) {
        super(animalsName);
        this.birdName = birdName;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(birdName, bird.birdName);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "birdName='" + birdName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), birdName);
    }

    @Override
    public void about() {
        System.out.println("about Bird");
    }

    @Override
    public void info() {
        System.out.println("Bird is " + getBirdName()+" and extends from "+ getAnimalsName());
    }
}
