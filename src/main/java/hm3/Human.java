package hm3;

public abstract class Human {

    private String name;
    private String sirname;
    private int age;

    //  создать логическое поле sleep и метод isSleep, который будет бросать исключение SleepException
    boolean sleep;

    public String Name(){
        return name;
    }

    public String Sirname(){
        return sirname;
    }

    public int Age(){
        return age;
    }


    public Human() {
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
        if (sleep) {
            throw new SleepException(this);
        }
        return sleep;
    }

    void sleep() {
        sleep = true;
    }

    void wakeUp() {
        sleep = false;
    }

    void intoduce() {
        System.out.println("Здравствуйте! Я " + name);
    }

    // переопределить метод toString так чтобы он возвращал имя и фамилию через пробел
    // @Override
    public String toString() {
        return name + " " + sirname;
    }

}
