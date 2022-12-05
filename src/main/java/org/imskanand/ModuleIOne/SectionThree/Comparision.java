package org.imskanand.ModuleIOne.SectionThree;

public class Comparision {
    public static void main(String[] args) {
        // Never use the == or != operator to compare the string comparison
        // For String equals or !equals are used to compare
        String myName = "Shubham Kumar Anand";
        String myRealName = "Aatma Ram Panday";

        System.out.println(!myName.equals(myRealName));

        String officeName = "Shubham Kumar Anand";
        System.out.println(myName.equals(officeName));
    }
}
