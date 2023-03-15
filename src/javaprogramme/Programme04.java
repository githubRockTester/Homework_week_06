package javaprogramme;

/**
 * 1 Declare two instance and two static variables.
 * 2 Declare one instance method.
 * 3 Declare one static method.
 * 4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 5 Declare the Main method.
 * 6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme04 {
    static int a = 10;
    static int b = 20;
    String name = "India";
    String name1 = "Gujarat";

    public static void main(String[] args) {
        myMethod();
        Programme04 obj = new Programme04();
        obj.yourMethod();
    }

    public static void myMethod() {
        System.out.println(a);
        System.out.println(b);
    }

    public void yourMethod() {
        System.out.println(name);
        System.out.println(name1);
    }

}