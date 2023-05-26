// Write a java program to print the perfect numbers within n.

import java.util.Scanner;
public class PerfectNumberinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The perfect numbers within " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
