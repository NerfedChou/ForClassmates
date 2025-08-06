class Umamusume {
    String name;
    String speed;
    String power;
    float jump;
    String skill;
    int wit;
    int agility;
    int endurance;

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

        System.out.println(name + " is a horse with a speed of" + speed + "\n Power: " + power + "\n Jump height " + jump + "\n Skill: " + skill + "\n Wit: " + wit + "\n Agility: " + agility + "\n Endurance: " + endurance + "\n Agility: " + agility + "\n Endurance: " + endurance );
        System.out.println("Chances are " + chance() + "%\n");
    }

    int chance() {
        return (int) (jump * (agility / (float) endurance));
    }
}
