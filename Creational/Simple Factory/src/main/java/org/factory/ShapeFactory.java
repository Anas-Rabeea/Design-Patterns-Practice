package org.factory;

public class ShapeFactory {

    public static Shape createShape(String shape)
    {
        return switch (shape.toLowerCase()) {
            case "triangle" -> new Triangle();
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            default -> throw new IllegalArgumentException("Enter a Valid Shape (Triangle - Circle - Rectangle)");
        };
    }
}
