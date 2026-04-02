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
