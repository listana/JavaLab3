package hm3;

public class Employee extends Human implements Worker {

    public Employee(String name, String sirname, int age){
        super(name, sirname, age);
    }
    public Employee(){}

    // TODO: 20.03.2020
    public void work(){
        if (isSleep()){
            return;
        }
        System.out.println(toString() + " работает...");
    }


}
