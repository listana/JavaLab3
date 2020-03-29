package hm3;

public class Developer extends Employee {

    public Developer(String name, String sirname, int age) {
        super(name, sirname, age);
    }

    void work(Human human) {
        if (isSleep()) {
            return;
        }
        System.out.println(human.toString() + " девелопит...");
    }
}
