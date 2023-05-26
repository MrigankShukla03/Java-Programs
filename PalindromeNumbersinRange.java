// Write a java program to print all the 3 digits Palindrome numbers from 100 to 999.
import java.util.Scanner;
public class PalindromeNumbersinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 999;
        int count = 0;
        System.out.println("The palindrome numbers within " + n + " are: ");
        for (int i = 100; i <= n; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
                System.out.println("The number of palindrome numbers within " + n + " is " + count);
                count++;
            }
        }
        sc.close();
    }
    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == n) {
            return true;
        }
        return false;
    }
}
