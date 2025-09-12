package Challenges.inheritanceChallenge;

class Student extends Person {

    int StudentID;

    Student(String name, int age, int StudentID) {
        super(name, age);
        this.StudentID = StudentID;
    }
}
