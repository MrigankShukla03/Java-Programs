// Write a java program to check whether a number is even or odd using if else.
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number is even.");
        }
        else 
        {
            System.out.println("The number is odd.");
        }
        sc.close();
    }
}

