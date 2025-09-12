package Challenges.work;

public class work {

    public static void main(String[] args) {
        fullTimeemployee f = new fullTimeemployee();
        f.name = "John";
        f.id = 101;
        f.workrate = 8;
        f.hourlyWork = 12;

        parTimeemployee p = new parTimeemployee();
        p.name = "Jane";
        p.id = 102;
        p.workrate = 10;
        p.hourlyWork = 15;

        System.out.println("Full time employee: " + f.name + " ID: " + f.id + " Work rate: " + f.workrate + " Hourly work: " + f.hourlyWork);
        System.out.println("Par time employee: " + p.name + " ID: " + p.id + " Work rate: " + p.workrate + " Hourly work: " + p.hourlyWork);

    }

}
