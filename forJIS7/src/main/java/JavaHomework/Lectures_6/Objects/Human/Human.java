package JavaHomework.Lectures_6.Objects.Human;

public class Human {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void greet() {
        System.out.println("Hello! My name is " + getName() + ". " + "I'm " + getAge() + " years old.");
    }

}
