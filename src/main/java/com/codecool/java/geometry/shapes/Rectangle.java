package com.codecool.java.geometry.shapes;

public class Rectangle extends Shape {
    protected float a;
    protected float b;

    public Rectangle(float a, float b){
        if(a > 0 & b > 0){
           this.a = a;
        this.b = b; 
        }else{
            throw new IllegalArgumentException();
        }
        
    }

    public double calculateArea(){

        return a*b;
    }

    public double calculatePerimeter(){
        return 2*a + 2*b;
    }

    public String getAreaFormula(){
        return "a*b";
    }

    public String getPerimeterFormula(){
        return "2*a + 2*b";
    }

    public float getA(){
        return a;
    }

    public float getB(){
        return b;
    }
}
