package com.company.java;

public class Area {
    //The area method is called overloaded method
    public double area(double length,double height){
        return (length*height);
    }
    public double area(double radius){
        return (Math.PI*radius*radius);
    }
    public int area(int lentght){
        return (lentght*lentght);
    }
}
