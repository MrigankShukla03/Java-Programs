// Write a java program to convert decimal number to binary number

import java.util.Scanner;
public class ConversionDecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        int[] binary = new int[100];
        int i = 0;
        while (n > 0) {
            binary[i] = n % 2;
            n = n / 2;
            i++;
        }
        System.out.print("The binary number is: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]+" ");
        }
        sc.close();
    }
}