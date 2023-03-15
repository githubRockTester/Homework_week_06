package javaprogramme;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.5 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme14 {
    public static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter width: ");
        float w = a.nextFloat();
        System.out.println("Give me a height: ");
        float h = a.nextFloat();
        float area = w * h;
        float pera = 2 * (w + h);
        System.out.println("The area of rectangle is: " + df.format(area));
        System.out.println("The perimeter of a rectangle is: " + df.format(pera));
        a.close();
    }

}
