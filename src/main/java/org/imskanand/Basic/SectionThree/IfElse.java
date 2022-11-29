package org.imskanand.Basic.SectionThree;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int myAge = scan.nextInt();
        if(myAge < 18){
            System.out.println("Not Eligible for Driving");
        } else if (myAge >=18 && myAge <= 75) {
            System.out.println("Eligible for Voting and Driving");
        }else{
            System.out.println("Now Eligible for Voting, Driving as well as Drinking! Cheers Mate!!!!!");
        }
        scan.close();
    }
}
