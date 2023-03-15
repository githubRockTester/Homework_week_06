package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Programme17 {

    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n = m.nextInt();
        String b = Integer.toBinaryString(n);
        System.out.println(b);
        m.close();
    }
}