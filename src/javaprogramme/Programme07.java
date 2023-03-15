package javaprogramme;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme07 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        float feh = a.nextFloat();
        float tem;
        tem = (float) ((feh - 32) * 5 / 9);
        System.out.println("The Temperature in Celsius is: " + tem);
        a.close();
    }
}