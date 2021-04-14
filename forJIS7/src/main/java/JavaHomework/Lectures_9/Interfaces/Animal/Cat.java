package JavaHomework.Lectures_9.Interfaces.Animal;

import java.util.Objects;

public class Cat extends Mammal {

    private String catName;

    public Cat() {
    }


    public Cat(String animalsName, String mammalName, String catName) {
        super(animalsName, mammalName);
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(catName, cat.catName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), catName);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                '}';
    }

    @Override
    public void about() {
        System.out.println("about Cat");
    }

    @Override
    public void info() {
        System.out.println("Cat is "+getCatName()+" and extends from "+getMammalName()+" and "+getAnimalsName());
    }
}
