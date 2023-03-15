package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as an input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
public class Programme10 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your digit: ");
        int x = a.nextInt();
        System.out.println(x + " x" + " 1 = " + (x * 1));
        System.out.println(x + " x" + " 2 = " + (x * 2));
        System.out.println(x + " x" + " 3 = " + (x * 3));
        System.out.println(x + " x" + " 4 = " + (x * 4));
        System.out.println(x + " x" + " 5 = " + (x * 5));
        System.out.println(x + " x" + " 6 = " + (x * 6));
        System.out.println(x + " x" + " 7 = " + (x * 7));
        System.out.println(x + " x" + " 8 = " + (x * 8));
        System.out.println(x + " x" + " 9 = " + (x * 9));
        System.out.println(x + " x" + " 10 = " + (x * 10));
        a.close();
    }
}