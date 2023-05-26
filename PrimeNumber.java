// Write a java program to print the prime numbers from 0 to the value user has entered.

import java.util.Scanner;
public class PrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    for(int i=2; i<=num; i++)
      {
         int count = 0;
         for(int j=2; j<i; j++)
         {
            if(i%j==0)
            {
               count++;
               break;
            }
         }
         if(count==0)
            System.out.print(i+" ");
      }
      sc.close();
   }
}