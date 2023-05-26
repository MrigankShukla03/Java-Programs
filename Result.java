// Write a java program to print the result of 4 subjects in Distinction, First Class, Second Class, Third Class, Fail.

import java.util.Scanner;
public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of subject 1: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter the marks of subject 2: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter the marks of subject 3: ");
        int sub3 = sc.nextInt();
        System.out.print("Enter the marks of subject 4: ");
        int sub4 = sc.nextInt();
        int total = sub1 + sub2 + sub3 + sub4;
        if (total >= 400) {
            System.out.println("Distinction");
        }
        else if (total >= 300 && total < 400) {
            System.out.println("First Class");
        }
        else if (total >= 200 && total < 300) {
            System.out.println("Second Class");
        }
        else if (total >= 100 && total < 200) {
            System.out.println("Third Class");
        }
        else
        {
            System.out.println("Fail");
        }
        sc.close();
    }
}
