package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Programme13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = s.nextInt();
        System.out.println("Enter second number");
        int y = s.nextInt();
        System.out.println("Enter third number");
        int z = s.nextInt();
        int avg;
        avg = ((x + y + z) / 3);
        System.out.println("The average of above 3 number is: " + avg);
        s.close();
    }
}