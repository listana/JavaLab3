package hm3;

public class Developer extends Employee {

    void work(Human human) {
        if (isSleep()) {
            return;
        }
        System.out.println(human.toString() + " девелопит...");
    }
}
