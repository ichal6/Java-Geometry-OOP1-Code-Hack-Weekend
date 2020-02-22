package com.codecool.java.geometry.shapes;

public class Square extends Rectangle {

    public Square(float a){
        super(a, a);
    }

    public String toString(){
        return String.format("Square, a = %f", a);
    }
}
