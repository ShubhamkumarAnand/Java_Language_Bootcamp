package org.imskanand.Basic.SectionFour;

public class Scope {
    static String dogName = "Bhalu";

    public static void main(String[] args) {
        System.out.println(dogCalculate(7));
        System.out.println(dogName);
    }

    public static int dogCalculate(int dogCount){
        System.out.println(dogName+ " " + dogCount);
        return dogCount;
    }
}
