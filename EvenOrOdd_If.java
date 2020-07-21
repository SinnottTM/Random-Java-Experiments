package com.company.finished;

import java.util.Scanner;

public class EvenOrOdd_If {

    public static void main(String[] args) {

        // Create new Scanner object for taking a user input
        Scanner reader = new Scanner(System.in);

        // Ask for user number input
        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        // Set up if statement to test if number is even or odd
        if(num % 2 == 0)
            System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
    }
}

