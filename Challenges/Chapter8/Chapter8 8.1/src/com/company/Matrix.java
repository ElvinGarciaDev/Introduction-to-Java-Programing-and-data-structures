package com.company;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
	// write your code here
        double[][] array; //declare array

        array = new double[3][4]; //create array

        //create a scanner for input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-4 matrix row by row: ");

        for(int i = 0; i < array.length; i++)
            for(int c = 0; c < array[i].length; c++)
                array[i][c] = input.nextDouble();

        System.out.print("What row would you like to add: ");
        int user = input.nextInt();

        double total = sum(array, user);

        System.out.println("\n " + total);

    }

    public static double sum(double[][] matrix, int columnIndex) {
        double sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][columnIndex];
        }
        return sum;

    }
    
}
