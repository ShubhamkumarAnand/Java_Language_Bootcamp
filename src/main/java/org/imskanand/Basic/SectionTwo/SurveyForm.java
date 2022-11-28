package org.imskanand.Basic.SectionTwo;

import java.util.Scanner;

public class SurveyForm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Survey Form!. Thank You for taking the survey");

        int count = 0;
        // Input String
        System.out.println("What is your name?");
        String name = scan.nextLine();
        count++;
        // Input Float
        System.out.println("How much money do you spend on Food?");
        float foodPrice = scan.nextFloat();
        count++;
        // Input Double
        System.out.println("How much money do you spend on Drinks?");
        double drinksPrice = scan.nextDouble();
        count++;
        // Input Int
        System.out.println("How many drinks do you consume in a day?");
        int numOfDrinks = scan.nextInt();
        count++;
        // closing the Scanner
        scan.close();

        System.out.println("\n Thank You "
                + name + " for your Time.\n You have Answered "
                + count + " Questions");
    }
}
