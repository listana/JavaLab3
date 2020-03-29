package hm3;

/**
 * Класс "Менеджер"
 * Работник, который занимается составлением отчетов
 */
public class Manager extends Employee {

    public Manager(){}
    /**
     * Конструктор со всеми параметрами
     * @param name
     * @param sirname
     * @param age
     */
    public Manager(String name, String sirname, int age) {
        super(name, sirname, age);
    }

    /**
     * Конструктор копирования из объекта Employee
     * @param other
     */
    public Manager(Employee other) {
        super(other);
    }

    /**
     * Менеджер работает: составляет отчет
     */
    @Override
    public void work() {
        if (isSleep()) {
            return;
        }
        System.out.println(toString() + " составляет отчет...");
    }

}


