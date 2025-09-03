package Inheritance;

class Motor extends Vehicle {

    int wheels = 2;

    public void honk() {
        System.out.print("PEEP PEEP");
    }

    @Override public void start() {
        System.out.println("Motor starting");
    }
}
