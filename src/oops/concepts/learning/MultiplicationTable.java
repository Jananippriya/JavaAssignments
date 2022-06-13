package oops.concepts.learning;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate multiplication table:");
        int num = sc.nextInt();
        System.out.println("Enter number of terms:");
        int n = sc.nextInt();
        for(int i = 0;i<=n;i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
}
