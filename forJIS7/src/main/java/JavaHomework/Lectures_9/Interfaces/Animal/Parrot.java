package JavaHomework.Lectures_9.Interfaces.Animal;

import java.util.Objects;

public class Parrot extends Bird {

    private String parrotName;

    public Parrot() {
    }


    public Parrot(String animalsName, String birdName, String parrotName) {
        super(animalsName, birdName);
        this.parrotName = parrotName;
    }

    public String getParrotName() {
        return parrotName;
    }

    public void setParrotName(String parrotName) {
        this.parrotName = parrotName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return Objects.equals(parrotName, parrot.parrotName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), parrotName);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "parrotName='" + parrotName + '\'' +
                '}';
    }

    @Override
    public void about() {
        System.out.println("about Parrot");
    }

    @Override
    public void info() {
        System.out.println("Parrot is " + getParrotName() + " and extends from " + getBirdName()+" and "+getAnimalsName());
    }
}
