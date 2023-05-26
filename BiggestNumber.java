// Write a java program to find the biggest number among two numbers using if else.
import java.util.Scanner;
public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("The biggest number is: " + a);
        } 
        else 
        {
            System.out.println("The biggest number is: " + b);
        }
        sc.close();
    }
}

