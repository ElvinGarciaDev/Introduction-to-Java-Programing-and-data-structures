package com.elvin;

public class Formatting {

    public static void main(String[] args) {
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        System.out.printf("Interest is $%.2f", interest);
        System.out.printf("Interest is $%.5f", interest);

    }
}
