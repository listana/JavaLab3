package hm3;

public class Tester extends Employee {

    void work(Human human) {
        if (isSleep()) {
            return;
        }
        System.out.println(human.toString() + " тестит...");
    }
}
