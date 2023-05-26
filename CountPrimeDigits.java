// Write a java program to count how many digits are prime numbers in a given number.

import java.util.Scanner;
public class CountPrimeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("The number of prime digits in the given number is: " + count);
        sc.close();
    }
}