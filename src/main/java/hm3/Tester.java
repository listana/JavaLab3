package hm3;

/**
 * класс "Тестировщик"
 * Работник, который тестирует ПО
 */
public class Tester extends Employee {

    public Tester(){}
    /**
     * Конструктор со всеми параметрами
     * @param name
     * @param sirname
     * @param age
     */
    public Tester(String name, String sirname, int age) {
        super(name, sirname, age);
    }

    /**
     * Конструктор копирования из объекта Employee
     * @param other
     */
    public Tester(Employee other) {
        super(other);
    }

    /**
     * Тестировщик работает
     */
    @Override
    public void work() {
        if (isSleep()) {
            return;
        }
        System.out.println(toString() + " тестит...");
    }
}
