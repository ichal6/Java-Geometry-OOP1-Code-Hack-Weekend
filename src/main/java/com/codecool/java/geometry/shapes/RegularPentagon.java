package com.codecool.java.geometry.shapes;

public class RegularPentagon extends Shape {
    private float a;

    public RegularPentagon(float a){
        if(a > 0){
            this.a = a;
        }else{
            throw new IllegalArgumentException();
        }
        
    }

    public double calculateArea(){
        return (a*a*Math.sqrt(5*(5+2*Math.sqrt(5))))/4;
    }

    public double calculatePerimeter(){
        return 5.0F*a;
    }

    public String getAreaFormula(){
        return "(a*a*Math.sqrt(5*(5+2*Math.sqrt(5))))/4";
    }

    public String getPerimeterFormula(){
        return "5*a";
    }

    public float getA(){
        return a;
    }

    public String getNameClass(){
        return "Regular Pentagon";
    }

    public String toString(){
        return String.format("Rectangle, a = %f", a);
    }
}
