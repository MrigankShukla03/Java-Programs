// Write a java program to check whether a number is perfect or not.

import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println("The number is perfect number.");
        }
        else
        {
            System.out.println("The number is not perfect number.");
        }
        sc.close();
    }
}