// Write a java program to input the Month number and print the Month name.

import java.util.Scanner;
public class MonthName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("The month name is January.");
                break;
            case 2:
                System.out.println("The month name is February.");
                break;
            case 3:
                System.out.println("The month name is March.");
                break;
            case 4:
                System.out.println("The month name is April.");
                break;
            case 5:
                System.out.println("The month name is May.");
                break;
            case 6:
                System.out.println("The month name is June.");
                break;
            case 7:
                System.out.println("The month name is July.");
                break;
            case 8:
                System.out.println("The month name is August.");
                break;
            case 9:
                System.out.println("The month name is September.");
                break;
            case 10:
                System.out.println("The month name is October.");
                break;
            case 11:
                System.out.println("The month name is November.");
                break;
            case 12:
                System.out.println("The month name is December.");
                break;
            default:
                System.out.println("Invalid month number.");
                break;
        }
        sc.close();
    }
}