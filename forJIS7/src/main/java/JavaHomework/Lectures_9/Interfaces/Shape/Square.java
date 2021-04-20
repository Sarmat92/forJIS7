package JavaHomework.Lectures_9.Interfaces.Shape;

public class Square extends AbstractShape{

    private String name;

    public Square() {
    }

    public Square(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                '}';
    }
}
