package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle:");
        double radius = input.nextDouble();
        double pi = 3.14;
        System.out.println("The area of the circle with radius " + radius + " is " + Circle.getArea(radius));
    }
}