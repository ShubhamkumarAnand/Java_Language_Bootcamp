package org.imskanand.Basic.SectionThree;

import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Delimiters ignore the space between the input -> next()
        System.out.println("Enter the String Values?");
        String str1 = scan.next();
        String str2 = scan.next();

        System.out.println("\t Strings are : "+ str1 +" "+str2);

        // nextLine() delimiters because it puts next break line into place
        scan.nextLine();

        // nextLine() reads the whole line from the input Line without skipping any whitespace
        System.out.println("Enter Sentence for the Evaluator?");
        String statement1 = scan.nextLine();
        String statement2 = scan.nextLine();

        System.out.println("\t Strings are : "+ statement1 +" "+ statement2);
    }
}
