package org.imskanand.Basic.SectionFour;

import java.util.Scanner;

public class DiceJack {
    public static int finalSum(){
        int val1 = (int)(10*Math.random());
        int val2 = (int)(10*Math.random());
        int val3 = (int)(10*Math.random());
        return val1 + val2 + val3;
    }

    public static boolean checkResult(int predictedValue){
        return (predictedValue)==finalSum();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value You Expected: ");
        int predictedValue = scan.nextInt();
        if(checkResult(predictedValue)){
            System.out.println("Your Prediction was correct!");
        }else{
            System.out.println("Try Again!");
        }
    }
}
