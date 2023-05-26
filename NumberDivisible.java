// Write a java program to input an integer and if number is divisible by 3 then print "Sanju" and if number is divisible by 5 print"Geeta" and if number is divisible by both 3 and 5 then print "Sanju Weds Geeta" and if number is not divisible by both 3 and 5 then print "Breakup".

import java.util.Scanner;
public class NumberDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Mansi Weds Deepak");
        }
        else if (n % 3 == 0) {
            System.out.println("Deepak");
        }
        else if (n % 5 == 0) {
            System.out.println("Mansi");
        }
        else
        {
            System.out.println("Breakup");
        }
        sc.close();
    }
}