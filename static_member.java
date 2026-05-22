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
