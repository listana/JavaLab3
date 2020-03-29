package hm3;

/**
 * класс "Разработчик"
 *  Работник, который занимается разработкой ПО
 */
public class Developer extends Employee {

    public Developer(){}
    /**
     * Конструктор со всеми полями
     * @param name
     * @param sirname
     * @param age
     */
    public Developer(String name, String sirname, int age) {
        super(name, sirname, age);
    }

    /**
     * Конструктор копирования из объекта Employee
     * @param other
     */
    public Developer(Employee other) {
        super(other);
    }

    /**
     * Разработчик работает
     */
    @Override
    public void work() {
        if (isSleep()) {
            return;
        }
        System.out.println(toString() + " разрабатывает ПО...");
    }
}
