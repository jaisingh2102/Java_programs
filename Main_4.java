// This code demonstrates the concept of boxing and unboxing in Java. Boxing is the process of converting a primitive type (like int) into its corresponding wrapper class (like Integer), while unboxing is the reverse process. In this example, we convert an int variable 'a' to an Integer object 'obj' using boxing, and then convert it back to an int variable 'b' using unboxing. The program prints both the object value and the primitive value to the console.
public class Main_4 {
    public static void main(String[] args) {
        int a = 10;

        // Converting primitive to object (Boxing)
        Integer obj = Integer.valueOf(a);

        // Converting object to primitive (Unboxing)
        int b = obj.intValue();

        System.out.println("Object value: " + obj);
        System.out.println("Primitive value: " + b);
    }
}
