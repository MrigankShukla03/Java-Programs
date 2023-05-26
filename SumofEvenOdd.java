// Write a java program to print the sum of even and odd numbers within n.

import java.util.Scanner;
public class SumofEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            }
            else
            {
                sumOdd = sumOdd + i;
            }
        }
        System.out.println("The sum of even numbers within " + n + " is: " + sumEven);
        System.out.println("The sum of odd numbers within " + n + " is: " + sumOdd);

        sc.close();
    }
}