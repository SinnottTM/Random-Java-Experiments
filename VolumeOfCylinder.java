package com.company.finished;

import java.util.Scanner;

public class VolumeOfCylinder {

    public static void main(String[] args) {

        // Create new Scanner object for taking in a user input
        Scanner input = new Scanner(System.in);

        // Establish the value of PI
        final double PI = 3.14159265359;

        // Ask for user input on dimensions of cylinder
        System.out.print("Enter the radius of a cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the length of a cylinder: ");
        double length = input.nextDouble();

        // Compute the area and volume
        double area = radius * radius * PI;
        double volume = area * length;

        // Display results
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

    }
}

