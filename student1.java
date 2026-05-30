// This code defines a class named 'Student' with an integer field 'id' and a constructor to initialize it. The class also has a method 'display' that prints the value of 'id'. In the 'student1' class, an instance of 'Student' is created with an id of 101, and the 'display' method is called to show the id on the console.
class Student {
    int id;

    Student(int id) {
        this.id = id;  // refers to current object variable
    }

    void display() {
        System.out.println("ID: " + this.id);
    }
}

public class student1 {
    public static void main(String[] args) {
        Student s = new Student(101);
        s.display();
    }
}
