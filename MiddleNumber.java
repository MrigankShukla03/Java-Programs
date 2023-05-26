// Write a java program to find the middle number among three numbers using if else.

import java.util.Scanner;
public class MiddleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        if (a > b && a < c || a < b && a > c) {
            System.out.println("The middle number is: " + a);
        }
        else if (b > a && b < c || b < a && b > c)
        {
            System.out.println("The middle number is: " + b);
        }
        else
        {
            System.out.println("The middle number is: " + c);
        }
        sc.close();
    }
}
