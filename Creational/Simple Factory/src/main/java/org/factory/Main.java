package org.factory;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Enter shape type (Triangle - Circle - Rectangle): ");
            String shapeType = sc.nextLine();

            // ShapeFactory factory = new ShapeFactory(); or make createShape() static
            // Shape shape = factory.createShape(shapeType);
            Shape shape = ShapeFactory.createShape(shapeType);
            shape.draw();
        }


        }
 }
