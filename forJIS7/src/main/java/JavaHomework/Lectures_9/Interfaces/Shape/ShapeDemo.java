package JavaHomework.Lectures_9.Interfaces.Shape;

public class ShapeDemo {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Circle");
        shapes[1] = new Square("Square");
        shapes[2] = new Triangle("Triangle");

        for (Shape shapeArray : shapes) {
            System.out.println(shapeArray.getName());
        }

    }
}
