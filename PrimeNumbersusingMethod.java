// WWrite a java program to Count the prime numbers present in n.
import java.util.Scanner;
public class PrimeNumbersusingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("The number of prime numbers within " + n + " is: " + count);
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

