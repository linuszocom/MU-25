package vecka49.FactoryPattern;

public class Main {

    static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        String userInput = "SQUARE";

        Shape shape = factory.getShape(userInput);


        if (shape != null) {
            shape.draw();
        }
    }
}
