// Write a java program to print the numbers from n to 1.

import java.util.Scanner;
public class NumbersinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The numbers from " + n + " to 1 are: ");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}