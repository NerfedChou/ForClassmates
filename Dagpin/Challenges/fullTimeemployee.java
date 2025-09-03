package Challenges;

class fullTimeemployee extends Employee {
    int workrate;
    int hourlyWork;
    fullTimeemployee(String name, int id, int workrate, int hourlyWork) {
        this.name = name;
        this.id = id;
        this.workrate = workrate;
        this.hourlyWork = hourlyWork;
    }
}
