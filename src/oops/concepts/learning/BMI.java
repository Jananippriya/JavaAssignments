package oops.concepts.learning;

import java.util.Scanner;

/* Java Assignment
3. Problem Statement –
        The body mass index (BMI) is commonly used by health and nutrition professionals to estimate
        human body fat in populations. It is computed by taking the individual's weight (mass) in
        kilograms and dividing it by the square of their height in meters.

 */
public class BMI {
    public static void calculateBMI(double height, double weight){
        double BMI = weight/(height * height);
        System.out.println("Your BMI is "+BMI);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your height in m:");
        double height = sc.nextDouble();
        System.out.println("Your weight in kg:");
        double weight = sc.nextDouble();
        calculateBMI(height,weight);
    }
}
