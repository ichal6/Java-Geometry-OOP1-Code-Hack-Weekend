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
        System.out.println(getShapesTable());
    }
    
    public void printTable(){
        CommandLineTable st = new CommandLineTable();

        st.setShowVerticalLines(true);
        st.setHeaders("idx", "Class", "toString", "Perimeter", "Formula", "Area", "Formula");
        
        for(int idx = 0; idx < shapes.size();idx++){
            String className = shapes.get(idx).getNameClass();
            String toString = shapes.get(idx).toString();
            double perimeterValue = shapes.get(idx).calculatePerimeter();
            String perimeterFormula = shapes.get(idx).getPerimeterFormula();
            double areaValue = shapes.get(idx).calculateArea();
            String areaFormula = shapes.get(idx).getAreaFormula();
            String idxAsString = String.format("%d", idx);
            String perimeterValueAsString = String.format("%f", perimeterValue);
            String areaValueAsString = String.format("%f", areaValue);
            st.addRow(idxAsString, className, toString, perimeterValueAsString, perimeterFormula, areaValueAsString, areaFormula);

        }
        st.print();
    }

    public String getShapesTable(){
        String listAsString = "";
        for(Shape shape : shapes){
            listAsString += shape.toString() + "\n";
        }
        return listAsString;
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
