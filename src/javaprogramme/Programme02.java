package javaprogramme;

/**
 * 1 Declare two static variables.
 * 2 Declare one static method.
 * 3 Call both static variables into the static method inside the print statement.
 * 4 Declare the Main method.
 * 5 Call the static method into the Main method and Run the programme.
 */
public class Programme02 {
    static int a = 10;
    static int b = 20;
    public static void addition(){
        System.out.println(a + b);
    }
    public static void main(String[]args){
        addition();
    }

}