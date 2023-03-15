package javaprogramme;

/**
 * 1 Declare two instance variables.
 * 2 Declare one instance method.
 * 3 Call both instance variables into the instance method inside the print statement.
 * 4 Declare the Main method.
 * 5 Call the above instance method into the Main method and Run the programme.
 */
public class Programme01 {

    int a = 10;
    int b = 30;

    public void Programme01() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Programme01 get = new Programme01();
        System.out.println(get.a + get.b);
    }
}
