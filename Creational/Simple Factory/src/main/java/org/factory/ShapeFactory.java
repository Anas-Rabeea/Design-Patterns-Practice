package org.factory;

public final class ShapeFactory
{
    // No instances needed for a stateless class
    private ShapeFactory() {}

    public static Shape createShape(String shape)
    {
        // NOTICE : we use SimpleFactory Pattern when no Logic more than creating the object needed
        return switch (shape.toLowerCase()) {
            case "triangle" -> new Triangle();
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            default -> throw new IllegalArgumentException("Enter a Valid Shape (Triangle - Circle - Rectangle)");
        };
    }
    // Too many switch cases so we use Factory Method
}
