package hm3;

public abstract class Human {

    String name;
    String sirname;
    int age;

    //  создать логическое поле sleep и метод isSleep, который будет бросать исключение SleepException
    boolean sleep;

    public Human(){
        name = "default_name";
        sirname = "default_sirname";
        age = 30;
    }
    public Human(String name, String sirname, int age) {
        this.name = name;
        this.sirname = sirname;
        this.age = age;
    }

    boolean isSleep() {
        if(sleep) {
            throw new SleepException(this);
        }
        return sleep;
    }

    void sleep(){
        sleep = true;
    }
    void wakeUp(){
        sleep = false;
    }
    void intoduce(){
        System.out.println("Здаров! Я " + name);
    }

    // переопределить метод toString так чтобы он возвращал имя и фамилию через пробел
   // @Override
    public String toString()
    {
        return name + " " + sirname;
    }

}
