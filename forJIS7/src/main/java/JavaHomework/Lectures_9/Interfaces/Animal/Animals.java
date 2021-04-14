package JavaHomework.Lectures_9.Interfaces.Animal;

import java.util.Objects;

public class Animals {

    private String animalsName;


    public Animals() {
    }

    public Animals(String animalsName) {
        this.animalsName = animalsName;

    }

    public String getAnimalsName() {
        return animalsName;
    }

    public void setAnimalsName(String animalsName) {
        this.animalsName = animalsName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(animalsName, animals.animalsName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalsName);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "animalsName='" + animalsName + '\'' +
                '}';
    }

    public void about(){
        System.out.println("about Animal");
    }

    public void info() {
        System.out.println("Animal is " + getAnimalsName());
    }
}
