package javaprogramme;

/**
 * A program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Programme05 {
    static int a = 20;
    static int b = 15;
    static float c = 10.5F;
    static float d = 20.5F;
    int yourNum = 40;
    int myNum = 50;

    public static void main(String[] args) {
        addition();//35 output
        subtraction(); //-10.0 output
        Programme05 obj = new Programme05(); //object
        obj.multiplication(); //2000 output
        Programme05 obj1 = new Programme05(); //object
        obj1.division(); //1 output
    }

    public static void addition() {
        int ans = a + b;
        System.out.println("My two number addition is : " + ans);
    }

    public static void subtraction() {
        float ans = c - d;
        System.out.println("My two number subtraction is : " + ans);
    }

    public void multiplication() {
        int result = yourNum * myNum;
        System.out.println("My two number multiplication is : " + result);
    }

    public void division() {
        int result = myNum / yourNum;
        System.out.println("my two number division is = " + result);
    }

}