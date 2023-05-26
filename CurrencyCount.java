// Write a java program to print how many notes are present in the amount.
import java.util.Scanner;
public class CurrencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        int notes2000 = amount / 2000;
        amount%=2000;
        int notes500 = amount / 500;
        amount%=500;
        int notes100 = amount / 100;
        amount%=100;
        int notes50 = amount / 50;
        amount%=50;
        int notes20 = amount / 20;
        amount%=20;
        int notes10 = amount / 10;
        amount%=10;
        int notes5 = amount / 5;
        amount%=5;
        int notes2 = amount / 2;
        amount%=2;
        int notes1 = amount / 1;
        amount%=1;
        System.out.println("The number of notes of 2000 is: " + notes2000);
        System.out.println("The number of notes of 500 is: " + notes500);
        System.out.println("The number of notes of 100 is: " + notes100);
        System.out.println("The number of notes of 50 is: " + notes50);
        System.out.println("The number of notes of 20 is: " + notes20);
        System.out.println("The number of notes of 10 is: " + notes10);
        System.out.println("The number of notes of 5 is: " + notes5);
        System.out.println("The number of notes of 2 is: " + notes2);
        System.out.println("The number of notes of 1 is: " + notes1);
        sc.close();
    }
}


