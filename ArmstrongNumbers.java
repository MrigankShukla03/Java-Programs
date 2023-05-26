// Write a java program to print n armstrong numbers in range.
import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        int i = 1;
        while (count < n) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        sc.close();
    }

    public static boolean isArmstrong(int n) {
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, 3);
            temp /= 10;
        }
        if (sum == n) {
            return true;
        }
        return false;
    }
}
