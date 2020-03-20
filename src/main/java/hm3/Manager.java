package hm3;

public class Manager extends Employee {

    void work(Human human) {
        if (isSleep()) {
            return;
        }
        System.out.println(human.toString() + " менеджит (составляет отчет)...");
    }

}


