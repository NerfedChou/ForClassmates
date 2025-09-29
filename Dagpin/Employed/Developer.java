package Employed;

class Developer extends  Employee {
    double overTimePay;

    Developer(String name, double baseSalary, double overTimePay) {
        super(name, baseSalary);
        this.overTimePay = overTimePay;
    }

    @Override
    double calculateSalary() {

        return super.calculateSalary() + overTimePay;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Overtime Pay: " + overTimePay);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
