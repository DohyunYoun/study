package patterns.factorymethod;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("Circle");
        Shape square = factory.getShape("Square");

        circle.draw();
        square.draw();
    }
}
