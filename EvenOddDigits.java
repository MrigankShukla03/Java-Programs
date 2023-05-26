// Write a java program to count how many even and odd digits present in a given number.

import java.util.Scanner;
public class EvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
            n = n / 10;
        }
        System.out.println("The number of even digits in the number is: " + evenCount);
        System.out.println("The number of odd digits in the number is: " + oddCount);
        sc.close();
    }
}