package com.company.finished;

import java.util.Scanner;

class PoundsIntoKilograms {static double kilograms= 0;

    public static void main(String[] args) {

        // Create new Scanner object for taking a user input
        Scanner input = new Scanner(System.in);

        // Set up ratio of
        double kilogramsInPounds = 0.454;

        //Ask the user for the number in pounds
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        // Convert into kilograms
        kilograms = pounds * kilogramsInPounds;

        // show the results
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");

    }
}
