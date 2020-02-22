package com.codecool.java.geometry.shapes;
import java.lang.Math; 

public class Triangle extends Shape {

    private static final Exception IllegalArgumentException = null;
    protected float a;
    protected float b;
    protected float c;


    public Triangle(float a, float b, float c){
        if(a > 0 & b > 0 & c > 0){
            this.a = a;
            this.b = b;
            this.c = c; 
        }
        else{
            throw new IllegalArgumentException();
        }
        
    }

    public double calculateArea(){
        float s = (a + b + c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));  
    }

    public double calculatePerimeter(){
        return a + b + c;
    }

    public String getAreaFormula(){
        return "sqrt(s*(s-a)*(s-b)*(s-c)) , where s = (a + b + c) / 2";
    }

    public String getPerimeterFormula(){
        return "a + b + c";
    }

    public float getA(){
        return a;
    }

    public float getB(){
        return b;
    }

    public float getC(){
        return c;
    }
}
