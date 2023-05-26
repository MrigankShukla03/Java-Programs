// Write a java program to check whether a number is positive if the number is negative then make it positive.
import java.util.Scanner;
public class PositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n < 0) {
            n = -n;
        }
        System.out.println("The Positive number is: " + n);
        sc.close();
    }
    
}
