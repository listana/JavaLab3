package hm3;

/**
 *  класс Человек
 *  Может спать, просыпаться, представляться.
 *  Не может ничего делать, если спит
 */
public abstract class Human {

    private String name;
    private String sirname;
    private int age;

    private boolean sleep;

    /**
     * Имя
     * @return
     */
    public String Name(){
        return name;
    }

    /**
     * Фамилия
     * @return
     */
    public String Sirname(){
        return sirname;
    }

    /**
     * Возраст
     * @return
     */
    public int Age(){
        return age;
    }

    /**
     * Конструктор по умолчанию создает человека с фиксированными данными
     */
    public Human() {
        name = "default_name";
        sirname = "default_sirname";
        age = 30;
    }

    public Human(Human other){
        if(other == null) {
            throw new IllegalArgumentException("Parameters can't be null");
        }
        name = other.Name();
        sirname = other.Sirname();
        age = other.Age();
    }
    /**
     * Конструктор со всеми полями
     * @param name
     * @param sirname
     * @param age
     */
    public Human(String name, String sirname, int age) {
        this.name = name;
        this.sirname = sirname;
        this.age = age;
    }

    /**
     * проверяет, спит ли человек. Если спит, бросает исключение
     * @return
     */
    protected boolean isSleep() {
        if (sleep) {
            throw new SleepException(this);
        }
        return sleep;
    }

    /**
     * Человек засыпает
     */
    public void sleep() {
        sleep = true;
    }

    /**
     * Человек просыпается
     */
    public void wakeUp() {
        sleep = false;
    }

    /**
     * Человек представляется
     */
    public void intoduce() {
        if(isSleep()){
            return;
        }
        System.out.println("Здравствуйте! Я " + name);
    }

    /**
     * переопределяет метод toString так чтобы он возвращал имя и фамилию через пробел
     * @return
    */
    @Override
    public String toString() {
        return name + " " + sirname;
    }

}
