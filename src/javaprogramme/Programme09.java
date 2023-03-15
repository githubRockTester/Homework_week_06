package javaprogramme;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme09 {
    String txt = "Hello World";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your data in UPPERCASE= ");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
        in.close();
    }
}