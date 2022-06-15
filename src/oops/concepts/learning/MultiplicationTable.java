package oops.concepts.learning;

import java.util.Scanner;

/* Java Assignment
Write a program in Java to display the multiplication table of a given integer.
Test Data: Input the number (Table to be calculated): Input number of terms: 5
Expected Output:
5 X 0 = 0
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25
 */
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
