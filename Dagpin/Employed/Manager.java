package Employed;

class Manager extends Employee{
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;

    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + bonus;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }

}
