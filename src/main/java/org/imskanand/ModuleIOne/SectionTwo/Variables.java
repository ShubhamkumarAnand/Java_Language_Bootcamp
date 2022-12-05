package org.imskanand.ModuleIOne.SectionTwo;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Variables");
        // lowerCamelCase
        // Case sensitive Language
        //Java is Strongly Typed Language

        // Integer Type
        int myAge = 21;
        myAge += 1;
        System.out.println("Age : "+myAge);

        // String Type
        String myName = "Shubham Kumar Anand";

        // String + String + Integer
        System.out.println("My Name is "+ myName + " " +myAge);

        // Character
        // char is faster and memory efficient then String
        char gender = 'M';
        System.out.println(gender);

        // Long Integer Type -> Range More Than (-2,147,483,648 --- 2,147,483,647)
        // 9.2 Trillion range -> Long Integer Range
        long population = 8000000000L;
        System.out.println("The Current Population of Earth : " + population);

        // Decimal Number -> Double & Float
        double urbanPopulation = 62.5;
        System.out.println("The Current Population of Earth living in the urban Settlement: " +urbanPopulation + " %");

        // Avoid using the int and Long for Division
        float dividend = 25.5f;
        float divisor = 1.2f;
        System.out.println("The dividend "+ dividend + " and divisor " + divisor + " = " + (dividend / divisor));
    }
}
