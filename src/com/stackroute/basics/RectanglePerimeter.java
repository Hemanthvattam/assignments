package com.stackroute.basics;


import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        new RectanglePerimeter().getValues();
    }

    //get user input from console
    public void getValues() {
        System.out.println("Enter length and breadth of the rectangle:");
        Scanner myObj = new Scanner(System.in);
        double l = myObj.nextDouble();
        double b = myObj.nextDouble();
        System.out.println(perimeterCalculator(l,b));
    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
        return 2*(length+breadth);
    }
}
