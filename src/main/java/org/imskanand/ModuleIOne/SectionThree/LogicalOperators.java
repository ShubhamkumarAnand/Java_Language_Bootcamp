package org.imskanand.ModuleIOne.SectionThree;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your CS Marks?");
        float csMarks = scan.nextFloat();

        System.out.println("Enter Your Math Marks?");
        float mathMarks = scan.nextFloat();

        if(csMarks >= 75 && mathMarks>=75){
            System.out.println("Congratulations you are Eligible For the 100% Scholarship!");
        }else if(csMarks >= 60 || mathMarks>=70){
            System.out.println("Congratulations you are Eligible For the 60% Scholarship");
        }else{
            System.out.println("Sorry, You are not eligible for the Scholarship");
        }
    }
}
