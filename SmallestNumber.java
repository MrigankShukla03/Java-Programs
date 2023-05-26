// Write a java program to find the smallest number among three numbers.

import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        if (a < b && a < c) {
            System.out.println("The smallest number is: " + a);
        } 
        else if (b < a && b < c) 
        {
            System.out.println("The smallest number is: " + b);
        }
        else 
        {
            System.out.println("The smallest number is: " + c);
        }
        sc.close();
    }
}