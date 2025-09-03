package Challenges;

import java.util.Scanner;

public class work {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fullTimeemployee employee = new fullTimeemployee("John", 123456789, 10, 100);
        System.out.println("Name: " + employee.name);
        System.out.println("ID: " + employee.id);
        System.out.println("Work Rate: " + employee.workrate);
        System.out.println("Hourly Work: " + employee.hourlyWork);
        System.out.print("\n\n");
        parTimeemployee parEmployee = new parTimeemployee("Jane", 987654321, 15, 150);
        System.out.println("Name: " + parEmployee.name);
        System.out.println("ID: " + parEmployee.id);
        System.out.println("Work Rate: " + parEmployee.workrate);
        System.out.println("Hourly Work: " + parEmployee.hourlyWork);
    }

}
