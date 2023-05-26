// Write a java program to take 4 subject marks and check every subject wheather the student is pass or fail.
import java.util.Scanner;
public class PassorFail {
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
        if (sub1 >= 35 && sub2 >= 35 && sub3 >= 35 && sub4 >= 35){
            System.out.println("You are pass.");
        }
        else
        {
            System.out.println("You are fail.");
        }
        sc.close();
    }
}



