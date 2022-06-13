package oops.concepts.learning;

import java.util.Scanner;

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
