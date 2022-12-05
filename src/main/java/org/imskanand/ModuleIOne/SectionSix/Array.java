package org.imskanand.ModuleIOne.SectionSix;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] kingdoms = {"Mahablipuram", "Maratha", "Vijaynagaram", "Rajputs", "Sikhs"};
        System.out.println(kingdoms[0]);
        System.out.println(kingdoms[1]);
        System.out.println(kingdoms[2]);
        System.out.println(kingdoms[3]);
        System.out.println(kingdoms[4]);

        System.out.println("How Many People do you have in your Family?");
        int numberOfFamilyMembers = scan.nextInt();

        System.out.println("Enter the Name of the Family Member : ");
        String[] familyName = new String[numberOfFamilyMembers];

        for(int i=0; i< familyName.length; i++) {
            System.out.print("Family Member Number "+ (i+1) + " : ");
            familyName[i] = scan.next();
        }
        System.out.println("\n");
        for (String s : familyName) {
            System.out.println("Family Name : " + s);
        }
    }
}
