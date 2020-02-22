package com.codecool.java.geometry.shapes;

public class EquilateralTriangle extends Triangle {

    // private float a;

    public EquilateralTriangle(float a){
        super(a, a, a);
    }

    public float getA(){
        return a;
    }

    public String toString(){
        return String.format("Equilateral Triangle, a = %f", a);
    }

}
