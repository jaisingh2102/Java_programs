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
