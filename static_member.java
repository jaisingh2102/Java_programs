// A static member is a member of a class that belongs to the class itself rather than to any specific instance of the class.
class demo {
    static int count = 0;
    static void increment()
    {
        count++;
        System.out.println(count);
    }
    
}
public class static_member {
    public static void main(String[] args) {
        demo.increment();
        demo.increment();
        demo.increment();
    }
}
