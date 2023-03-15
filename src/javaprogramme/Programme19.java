package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Programme19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write something in UPPERCASE: ");
        String a = s.nextLine();
        System.out.println(a.toLowerCase());
        s.close();
    }
}