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
        
        


        // TODO: implement user interaction here. You can change the code below
	    while (isRunning) {
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            Shape newShape = new Circle(3.0F);;
            switch (option) {
                case 1:

                    String newShapeName = scanner.nextLine();
                    newShapeName = scanner.nextLine();
                    switch(newShapeName){
                        case "circle":
                            newShape = new Circle(3.0F);
                            break;
                        case "equilaternaltriangle":
                            newShape = new EquilateralTriangle(3.0F);
                            break;
                        case "rectangle":
                            newShape = new Rectangle(3.0F, 4.0F);
                            break;
                        case "regularpentagon":
                            newShape = new RegularPentagon(5.3F);
                            break;
                        case "square":
                            newShape = new Square(5.1F);
                            break;
                        case "triangle":
                            newShape = new Triangle(2.6F, 4.2F, 5.1F);
                            break;
                        default:
                            System.out.println("You put incorrect data");
                            

                    }
                    shapes.addShape(newShape);
                    break;
                case 2:
                    shapes.printList();
                    break;
                case 3:
                    shapes.getLargestShapeByPerimeter();
                    break;
                case 4:
                    shapes.getLargestShapeByArea();
                    break;
                case 5:
                    shapes.printTable();
                    break;
                case 0:
                    isRunning = false;
                    break;

            }
        }
        
    }
}
