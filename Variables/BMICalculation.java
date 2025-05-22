package Variables;

import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        double weight;
        System.out.print("Enter your weight in Kgs: ");
        weight = input.nextFloat();

        double height;
        System.out.print("Enter your height in Metres: ");
        height = input.nextFloat();

        double BMI = weight / (height * height);
        System.out.println("Your BMI value is: " + BMI);

    }
}
