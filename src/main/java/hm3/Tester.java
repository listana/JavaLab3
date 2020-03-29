package hm3;

public class Tester extends Employee {

    public Tester(String name, String sirname, int age) {
        super(name, sirname, age);
    }

    void work(Human human) {
        if (isSleep()) {
            return;
        }
        System.out.println(human.toString() + " тестит...");
    }
}
