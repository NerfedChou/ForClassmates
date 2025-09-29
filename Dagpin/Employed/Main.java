package Employed;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Angulo", 5000.00, 200.00);
        Manager mgr = new Manager("Antido", 8000.00, 1000.00);

        dev.displayInfo();
        mgr.displayInfo();

        System.out.println("Total Salary of Developer: " + dev.calculateSalary());
        System.out.println("Total Salary of Manager: " + mgr.calculateSalary());
    }
}
