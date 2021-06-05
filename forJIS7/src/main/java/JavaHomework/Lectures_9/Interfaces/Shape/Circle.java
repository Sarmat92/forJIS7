package JavaHomework.Lectures_9.Interfaces.Shape;

public class Circle extends AbstractShape {

    private String name;

    public Circle() {
    }

    public Circle(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                '}';
    }
}
