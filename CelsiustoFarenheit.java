// Write a java program to convert temperature from celsius to fahrenheit.
import java.util.Scanner;
public class CelsiustoFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in celsius: ");
        double temp = sc.nextDouble();
        double f = (temp * 9 / 5) + 32;
        System.out.println("The temperature in fahrenheit is: " + f+"°F");
        sc.close();
    }
}