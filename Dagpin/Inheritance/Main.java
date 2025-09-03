package Inheritance;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Motor myMotor = new Motor();
        myCar.start();
        myCar.honk();
        System.out.println("\nBrand: " + myCar.brand);
        System.out.println("Wheels: " + myCar.wheels);

        myMotor.start();
        myMotor.honk();
        System.out.println("\nBrand: " + myMotor.brand);
        System.out.println("Wheels: " + myMotor.wheels);
    }
}
