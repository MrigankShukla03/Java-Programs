// Write a java program to take a number from keyboard, create an array of

// that size, insert element in existing array and display it.

import java.util.Scanner;

public class DisplayArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];

    System.out.println("Enter elements in the array: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Elements in the array: ");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
