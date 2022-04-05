package com.elvin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int random = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.print("Guess a magic number between 0 and 100 \nEnter your guess: ");
        int guess = input.nextInt();

        System.out.print(random);
        while (guess != random) {
            if (guess > random) {
                System.out.println("Your guess is too high \nEnter your guess: ");
                guess = input.nextInt();
            }
            else if (guess < random) {
                System.out.print("Your guess is too low \nEnter your guess: ");
                guess = input.nextInt();
            }
            else  {
                System.out.print("Yes, the number is " + random);
            }
        }


    }
}
