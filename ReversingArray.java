package com.company.finished;

public class ReversingArray {

    // Function that reverses array and stores it in another array. NB: Setting up Function BEFORE setting up Main.
    static void reverse(int a[], int n) {

        // Setting up new array with same length as array to reverse
        int[] b = new int[n];

        // Setting up separate variable to use within the loop that matches the length of the array
        int j = n;

        // loop to iterate through the first array and place its reversed elements in the second array
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array. Note: \n gives a line break and is used inside the string
        System.out.println("Reversed array is: \n");

        // loop through new array, using k as i already used above
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }

    // Set up Main
    public static void main(String[] args) {

        // Set up array, use reverse method on this array.
        int [] test = {10, 20, 30, 40, 50};
        reverse(test, test.length);
    }
}