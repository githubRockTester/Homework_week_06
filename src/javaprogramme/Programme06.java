package javaprogramme;

import java.util.Scanner;

/**
     * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class Programme06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the redius");
        double radius = sc.nextDouble();

        double areaCircle = (Math.PI) * Math.pow(radius,2);
        double perimeter = 2 * Math.PI * radius;

        System.out.println("area of cirle is "+ areaCircle);
        System.out.println("perimeter of circle is "+ perimeter);
        sc.close();
    }

}