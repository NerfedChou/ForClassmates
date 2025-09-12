package Challenges.persons;
public class school {

    public static void main(String[] args) {

        student s = new student();
        s.name = "Alice";
        s.age = 20;
        s.stdId = 201;
        s.course = "Computer Science";
        System.out.println("Student: " + s.name + " Age: " + s.age + " Student ID: " + s.stdId + " Course: " + s.course);

        teacher t = new teacher();
        t.name = "Bob";
        t.age = 45;
        t.empId = 301;
        t.subject = "Mathematics";
        System.out.println("Teacher: " + t.name + " Age: " + t.age + " Employee ID: " + t.empId + " Subject: " + t.subject);
    }
}
