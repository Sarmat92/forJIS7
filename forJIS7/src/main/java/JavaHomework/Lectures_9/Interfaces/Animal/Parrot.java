package JavaHomework.Lectures_9.Interfaces.Animal;

import java.util.Objects;

public class Parrot extends Bird {

    private String songName;

    public Parrot() {
    }

    public Parrot(String name, String featherColor, String songName) {
        super(name, featherColor);
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return Objects.equals(songName, parrot.songName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), songName);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "songName='" + songName + '\'' +
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
