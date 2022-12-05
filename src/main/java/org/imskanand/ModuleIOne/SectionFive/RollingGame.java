package org.imskanand.ModuleIOne.SectionFive;

import java.util.Scanner;

public class RollingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Java Roll Game! Enter the Number between 1 and 6\n");
        System.out.println("\t\tIf you roll 6, Game Ends");
        System.out.println("\t\tIf you roll 4, No Score Points");
        System.out.println("\t\tIf you roll other than that You Score 1 Points\n");
        System.out.println("Must Score 3 or More Points to Win the Game");
        int score = 0;

        while(score < 3){
            int inputNumber = scan.nextInt();
            if(inputNumber>6 || inputNumber<1){
                System.out.println("Invalid input number! Try Again");
                continue;
            }
            if(inputNumber == 6){
                System.out.println("You have entered 6 the Game Exit! \nYour Score is " + score);
                break;
            }
            if(inputNumber ==4){
                System.out.println("You have entered 4, no Point has been Scored!");
                continue;
            }
            System.out.println("Entered Number: " + inputNumber);
            score++;

        }
    }
}
