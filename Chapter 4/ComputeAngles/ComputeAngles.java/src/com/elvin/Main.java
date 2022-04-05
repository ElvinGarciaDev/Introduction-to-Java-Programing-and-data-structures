package com.elvin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        //Promt the user to enter the three points
        System.out.println("Enter three points: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //Compute three sides
        double a = Math.sqrt( (x2 - x3) * (x2 - x3)
        + (y2 - y3) * (y2 -y3));

        double b = Math.sqrt((x1 − x3) * (x1 − x3) + (y1 − y3) * (y1 − y3));
       


    }
}
