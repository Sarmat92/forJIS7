package JavaHomework.Lectures_9.Interfaces.Animal;

import java.util.Objects;

public abstract class Animals {

    private String name;


    public Animals() {
    }

    public Animals(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "animalsName='" + name + '\'' +
                '}';
    }

    public void sleep(){
        System.out.println("Z-z-z-z-z");
    }

    public void fly(){
        System.out.println("Can fly");
    }

    public void run(){
        System.out.println("Can run");
    }
}
