package com.codecool.java.geometry.shapes;

public class Circle extends Shape {
    private float r;
    private double pi = Math.PI;

    public Circle(float r){
        if(r > 0){
            this.r = r;
        }else{
            throw new IllegalArgumentException("All arguments must be greater than 0");
        }
        
    }

    public double calculateArea(){
        return pi*r*r;
    }

    public double calculatePerimeter(){
        return 2*pi*r;
    }

    public String getAreaFormula(){
        return "pi*r*r";
    }

    public String getPerimeterFormula(){
        return "2*pi*r";
    }

    public float getR(){
        return r;
    }
}
