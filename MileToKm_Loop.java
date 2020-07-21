package com.company.finished;

public class MileToKm_Loop {

    public static void main(String[] args) {

        // Set up variable for miles to kilometer
        double milesInKm = 1.609;

        // Set up loop to 10 to give distance breakdown
        for (double i = 1; i < 11; i++) {
            System.out.println(i + " mile is " + (i * milesInKm));
        }
    }
}
