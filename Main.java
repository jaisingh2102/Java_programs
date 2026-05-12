// Java program to illustrate the concept of constructor
class student{
    int id;
    student(int id)
    {
        this.id = id;
    }
    void display()
    {
        System.out.println("id" +this.id);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        student s = new student(101);
        s.display();
    }
}
