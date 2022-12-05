package org.imskanand.ModuleIOne.SectionFive;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Well Hello, " + name+"! Can I write something for you?");
        String message = scan.nextLine();
        System.out.println("What number of Time should i Write?");
        int numberOfTime = scan.nextInt();
        for(int i = 0;i<numberOfTime;i++){
            System.out.println((i+1) + " : " + message);
        }
        System.out.println("\n\t\tThank You!");
    }
}
