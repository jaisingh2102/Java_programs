// This code demonstrates the use of a final variable in Java. The variable 'x' is declared as final, which means its value cannot be changed once it has been assigned. The 'display' method attempts to change the value of 'x', which would result in a compile-time error if uncommented. The program will print the value of 'x' when executed.
class Demo {
    final int x = 10;

    void display() {
        // x = 20; // Error: cannot change final variable
        System.out.println("Value of x: " + x);
    }
}

public class Main_3 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}
