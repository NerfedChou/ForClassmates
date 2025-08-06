class Constructor {
    String name;
    int age;
    String work;
    String build;
    String quality;

    void Constructor(){
        System.out.println("Constructor is called" + name);
        System.out.println("Age: " + age);
        System.out.println("Work: " + work);
        System.out.println("Build: " + build);
        System.out.println("Quality: " + quality);
    }

}
public class defaultConstruct{
     public static void main(String[] args) {
        Constructor c = new Constructor();

        c.name = "Garon";
        c.age = 20;
        c.work = "Software Engineer";
        c.build = "2020";
        c.quality = "Good";
        c.Constructor();

        Umamusume u = new Umamusume();
        u.Uma("Garon", "Fast", "Good", 1.5f, "Jump", 10, 10, 10);
        u.chance();

        copyUmamusume cU = new copyUmamusume(u);
        cU.printCopy();
        cU.chance();
     }
}