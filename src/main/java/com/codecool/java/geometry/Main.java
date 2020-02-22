package com.codecool.java.geometry;

import java.util.Scanner;

import com.codecool.java.geometry.containers.ShapeList;
import com.codecool.java.geometry.shapes.*;

public class Main {

    public static void main(String[] args) {
	    ShapeList shapes = new ShapeList();
        boolean isRunning = true;

        Shape circle = new Circle(3.0F);
        Shape rectangle = new Rectangle(3.0F, 2.5F);
        Shape triangle = new Triangle(2.4F, 4.1F, 6.1F);
        Shape square = new Square(2.45F);

        shapes.addShape(circle);
        shapes.addShape(rectangle);
        shapes.addShape(triangle);
        shapes.addShape(square);

        for(int index = 0; index < shapes.size(); index++){
            System.out.println(String.format("%.2f", shapes.getShapeAt(index).calculateArea()));
        }
        /*
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();


        // TODO: implement user interaction here. You can change the code below
	    while (isRunning) {

            switch (option) {
                case 1:
                    // Add new shape
                    break;
                case 2:
                    // Show all shapes
                    break;
                case 3:
                    // Show shape with the largest perimeter
                    break;
                case 4:
                    // Show shape with the largest area
                    break;
                case 5:
                    // Show formulas
                    break;
                case 0:
                    isRunning = false;
                    break;

            }
        }
        */
    }
}
