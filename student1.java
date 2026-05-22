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
