package com.company.finished;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        // Create new Scanner object for taking a user input
        Scanner in = new Scanner(System.in);

        // Take Input and store it
        System.out.print("Enter temperature in Celsius: ");
        double celsius = in.nextDouble();

        // Convert Celsius to Fahrenheit using the following calculation: F = C * (9/5) + 32
        double fahrenheit = celsius * (9 / 5) + 32;

        // Print result
        System.out.println(celsius + " degree Celsius is equal to " + fahrenheit +" degree Fahrenheit.");

    }
}

