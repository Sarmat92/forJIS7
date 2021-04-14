package JavaHomework.Lectures_9.Interfaces.Animal;

import java.util.Objects;

public class Mammal extends Animals {

    private String mammalName;

    public Mammal() {
    }


    public Mammal(String animalsName, String mammalName) {
        super(animalsName);
        this.mammalName = mammalName;
    }

    public String getMammalName() {
        return mammalName;
    }

    public void setMammalName(String mammalName) {
        this.mammalName = mammalName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Objects.equals(mammalName, mammal.mammalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mammalName);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "mammalName='" + mammalName + '\'' +
                '}';
    }

    @Override
    public void about() {
        System.out.println("about Mammal");
    }

    @Override
    public void info() {
        System.out.println("Mammal is "+getMammalName()+" and extends from "+getAnimalsName());
    }
}
