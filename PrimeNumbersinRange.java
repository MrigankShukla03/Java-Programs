// Write a java program to print prime numbers from 1 to 100.
import java.util.Scanner;
public class PrimeNumbersinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The prime numbers within " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
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