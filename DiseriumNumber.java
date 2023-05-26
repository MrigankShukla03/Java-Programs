// Write a java program to print first n diserium numbers.
import java.util.Scanner;
public class DiseriumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The first " + n + " diserium numbers are: ");
        int count = 0; 
        int i = 1;
        while (count < n) {
            if (isDiserium(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        sc.close();
    }
    public static boolean isDiserium(int n) {
        int sum = 0;
        int temp = n;
        int length = String.valueOf(n).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, length);
            temp = temp / 10;
            length--;
        }
        if (sum == n) {
            return true;
        }
        else {
            return false;
        }
    }
}