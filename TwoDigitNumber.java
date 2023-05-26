// Write a java program to check wheather the number is two digit or not.

import java.util.Scanner;
public class TwoDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 10 && n <= 99) {
            System.out.println("The number is two digit number.");
        }
        else
        {
            System.out.println("The number is not two digit number.");
        }
        sc.close();
    }
}
