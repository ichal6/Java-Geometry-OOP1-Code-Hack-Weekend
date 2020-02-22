package com.codecool.java.geometry.containers;

import java.util.ArrayList;
import java.util.List;

import com.codecool.java.geometry.shapes.Shape;

public class ShapeList implements Printable {
    private List<Shape> shapes;

    public ShapeList(){
        shapes = new ArrayList<Shape>();
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public Shape getShapeAt(int index){
        return shapes.get(index);
    }

    public int size(){
        return shapes.size();
    }

    public void printList(){

    }
    
    public void printTable(){

    }

    public Shape getLargestShapeByPerimeter(){
        int indMax = 0;
        double maxValue = 0;
        for(int index = 0; index < shapes.size(); index++){
            if(shapes.get(index).calculatePerimeter() > maxValue){
                indMax = index;
                maxValue = shapes.get(index).calculatePerimeter();
            }
        }
        return shapes.get(indMax);
    }

    public Shape getLargestShapeByArea(){
        int indMax = 0;
        double maxValue = 0;
        for(int index = 0; index < shapes.size(); index++){
            if(shapes.get(index).calculateArea() > maxValue){
                indMax = index;
                maxValue = shapes.get(index).calculateArea();
            }
        }
        return shapes.get(indMax);
    }
}
