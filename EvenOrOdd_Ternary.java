package com.company.finished;

import java.util.Scanner;

public class EvenOrOdd_Ternary {

    public static void main(String[] args) {

        // Create new Scanner object for taking a user input
        Scanner reader = new Scanner(System.in);

        // Ask for user number input
        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        // Set up ternary statement to test if number is even or odd
        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);

    }

}
