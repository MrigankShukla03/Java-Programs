// Write a java program to print first n prime numbers.

import java.util.Scanner;
public class FirstNPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The first " + n + " prime numbers are: ");
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        sc.close();
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}