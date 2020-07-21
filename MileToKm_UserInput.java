package com.company.finished;

import java.util.Scanner;

public class MileToKm_UserInput {

    public static void main(String[] args) {

        // Create new Scanner object for taking in a user input
        Scanner s = new Scanner(System.in);

        // Request distance in miles
        System.out.print("Enter distance in miles:");

        // Return miles to Km
        double distanceInMiles = s.nextDouble();
        System.out.println(distanceInMiles + " miles = " + milesToKm(distanceInMiles) + " km");

        // Request distance in km
        System.out.print("Enter distance in km:");

        // Return Km to miles
        double distanceInKm = s.nextDouble();
        System.out.println(distanceInKm + " km = " + kmToMiles(distanceInKm) + " miles");
    }

    // Converting Miles to Km
    public static double milesToKm(double distanceInMiles) {
        return distanceInMiles * 1.609;
    }

    // Converting Km to Miles
    public static double kmToMiles(double distanceInKm) {
        return distanceInKm * 0.621;
    }

}

