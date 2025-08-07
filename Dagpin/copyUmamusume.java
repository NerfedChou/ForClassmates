class copyUmamusume {
    String name;
    String speed;
    String power;
    float jump;
    String skill;
    int wit;
    int agility;
    int endurance;

    // Copy constructor
    public copyUmamusume(Umamusume u) {
        this.name = u.name;
        this.speed = u.speed;
        this.power = u.power;
        this.jump = u.jump;
        this.skill = u.skill;
        this.wit = u.wit;
        this.agility = u.agility;
        this.endurance = u.endurance;

    }
    void Uma(String name, String speed, String power, float jump, String skill, int wit, int agility, int endurance){
        this.name = name;
        this.speed = speed;
        this.power = power;
        this.jump = jump;
        this.skill = skill;
        this.wit = wit;
        this.agility = agility;
        this.endurance = endurance;
        chance();
        System.out.println(name + " is a horse with a speed of" + speed + "\n Power: " + power + "\n Jump height " + jump + "\n Skill: " + skill + "\n Wit: " + wit + "\n Agility: " + agility + "\n Endurance: " + endurance + "\n Agility: " + agility + "\n Endurance: " + endurance);
        System.out.println("Chances are " + chance() + "%\n");
    }
    void printCopy(){
        System.out.println("IMPOSTOR!!!! " + name + " is a horse with a speed of" + speed + "\n Power: " + power + "\n Jump height " + jump + "\n Skill: " + skill + "\n Wit: " + wit + "\n Agility: " + agility + "\n Endurance: " + endurance + "\n Agility: " + agility + "\n Endurance: " + endurance);
    }

    int chance() {
        return (int) (jump * (agility / (float) endurance));
    }
}