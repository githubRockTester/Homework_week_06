package javaprogramme;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle
 */
public class Programme08 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Give me a base: ");
        int b = a.nextInt();
        System.out.println("Give me a height: ");
        int h = a.nextInt();
        int area = b * h / 2;
        System.out.println("The Area of Triangle is: " + area);
        a.close();
    }
}
