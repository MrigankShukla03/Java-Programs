// Write a java program to count and print the number of divisor of n

import java.util.Scanner;
public class DivisorCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println("The number of divisors of " + n + " is " + count);
        sc.close();
    }
}