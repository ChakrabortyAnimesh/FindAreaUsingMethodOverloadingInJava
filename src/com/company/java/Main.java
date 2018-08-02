package com.company.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Area ob=new Area();
        double rectangle = ob.area(45.5, 85.12);
        double circle = ob.area(5.3);
        int square = ob.area(20);

        System.out.println("The area of rectangle is: " + rectangle);
        System.out.println("The area of circle is: "+circle);
        System.out.println("The area of square is: "+square);
    }
}
