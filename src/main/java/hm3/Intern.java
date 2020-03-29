package hm3;

public class Intern extends Student implements Worker {

    public void work(){
        if(isSleep()) {
            return;
        }
        System.out.println("Интерн " + toString() + " работает...");
    }
}
