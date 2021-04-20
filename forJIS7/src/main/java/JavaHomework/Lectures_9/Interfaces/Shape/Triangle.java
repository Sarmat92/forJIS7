package JavaHomework.Lectures_9.Interfaces.Shape;

public class Triangle extends AbstractShape{

    private String name;

    public Triangle() {
    }

    public Triangle(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                '}';
    }
}
