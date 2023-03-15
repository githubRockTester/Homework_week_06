package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Programme18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = s.nextInt();
        System.out.println("Enter second number: ");
        int b = s.nextInt();
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " x " + b + " = " + mul);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " mod " + b + " = " + mod);
        s.close();
    }
}
