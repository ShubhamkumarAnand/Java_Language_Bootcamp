package org.imskanand.ModuleIOne.SectionFive;

import java.util.Scanner;

public class GuessTheNumber {
    public static int randomNumber() {
        return (int)(Math.random() * 6);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the number between 1-5!");
        int number = randomNumber();
        int guessedNumber = scan.nextInt();
        while(!(guessedNumber==number)) {
            System.out.print("Guess Again : ");
            guessedNumber = scan.nextInt();
        }
        System.out.println("You are Right!");
    }
}
