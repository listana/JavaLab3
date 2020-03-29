package hm3;

public class Manager extends Employee {

    public Manager(String name, String sirname, int age) {
        super(name, sirname, age);
    }

    void work(Human human) {
        if (isSleep()) {
            return;
        }
        System.out.println(human.toString() + " менеджит (составляет отчет)...");
    }

}


