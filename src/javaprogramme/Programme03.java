package javaprogramme;

/**
 * 1 Declare one instance and one static variable.
 * 2 Declare one instance method.
 * 3 Declare one static method.
 * 4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 5 Declare the Main method.
 * 6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme03 {
    static int a = 15;
    int b = 10;

    public void myMethod() {
        System.out.println(b);
    }

    public static void yourMethod() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        yourMethod();
        Programme03 obj = new Programme03();
        obj.myMethod();
    }
}