// This code defines a class named 'student' with an integer field 'id' and a constructor to initialize it. The class also has a method 'display' that prints the value of 'id'. In the 'Main' class, an instance of 'student' is created with an id of 101, and the 'display' method is called to show the id on the console.
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
