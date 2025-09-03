package Inheritance;

class Car extends Vehicle{

    int wheels = 4;

    public void honk() {
        System.out.print("BEEP BEEP");
    }

    @Override public void start() {
        System.out.println("Car starting");
    }

}
