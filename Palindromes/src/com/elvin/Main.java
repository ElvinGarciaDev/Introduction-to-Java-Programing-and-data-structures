package com.elvin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Create a scanner for user input
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a string
        System.out.print("Please enter a string: ");
        String s = input.nextLine();

        //The index of the first character in the string
        int low = 0;

        //The index of the last character in the string
        int high = s.length() - 1;

        boolean isPaldrome = true;
        while (low < high) { //While the high index does not crossover
            if (s.charAt(low) != s.charAt(high)) { //if the first and last char don't match. Is not a Paldrome
                isPaldrome = false;
                break;
            }

            low++;
            high--;
        }

        if (isPaldrome)
            System.out.println(s +" is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
}