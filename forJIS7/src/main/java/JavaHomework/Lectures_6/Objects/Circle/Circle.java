package JavaHomework.Lectures_6.Objects.Circle;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public void calculateArea() {
        double resultCalculateArea = 2 * 3.14 * radius;
        System.out.println(resultCalculateArea);
    }

}
