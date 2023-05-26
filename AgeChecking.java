// Write a java program to check the age of user whether the user is eligible for voting or not.

import java.util.Scanner;
public class AgeChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible for voting.");
        }
        else
        {
            System.out.println("You are not eligible for voting.");
        }
        sc.close();
    }
}

