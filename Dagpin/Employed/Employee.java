package Employed;

class Employee {

    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return  baseSalary;
    }

    void displayInfo() {
        System.out.println("Employee's Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}
