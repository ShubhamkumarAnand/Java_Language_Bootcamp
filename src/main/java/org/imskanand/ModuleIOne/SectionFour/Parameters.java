package org.imskanand.ModuleIOne.SectionFour;

public class Parameters {
    // If a Functions is doing the computation then it shouldn't be handling the final result
    // Vice Versa
    public static void calculateArea(double length, double width){
        double area = length * width;
        System.out.println(area);
    }

    public static double calculateVolume(double radius){
        return ((4.0/3)*Math.pow(radius,3));
    }

    public static void calculateWaiterTip(double totalAmount){
        double waiterTip = totalAmount * 0.15;
        System.out.println(waiterTip);
    }


    /*
    * Function Name: calculateBMI
    *
    * @param weight
    * @param height
    * @return BMI
    *
    * Inside the Function
    *   - check if the height is less tan 2m
    *   - check if the weight is more than 10kg
    *   - Calculate the BMI value and returns it
    * */
    public static double calculateBMI(double weight, double height){
        if(weight < 10 && height > 2 ){
            System.out.println("Invalid weight ans height values");
            System.exit(0);
        }
        return (weight/height*height);
    }

    public static void main(String[] args) {
        calculateArea(2.5,8.4);
        calculateWaiterTip(234.45);
        System.out.println(calculateVolume(3.44));
        double BMI = calculateBMI(68.5,1.745);
        System.out.println("Your BMI is " + BMI);
    }
}
