// Write a java program to take two double values and perform all arithmetic operations on them.
import java.util.Scanner;
public class AllAirthematicOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.println("The sum of the two numbers is: " + (a + b));
        System.out.println("The difference of the two numbers is: " + (a - b));
        System.out.println("The product of the two numbers is: " + (a * b));
        System.out.println("The quotient of the two numbers is: " + (a / b));
        System.out.println("The remainder of the two numbers is: " + (a % b));
        sc.close();
    }
}
