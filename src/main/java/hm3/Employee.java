package hm3;

import org.jetbrains.annotations.NotNull;

/**
 * класс "Работник"
 * Описывает человека, который может работать
 * Не может работать, когда спит
 */
public class Employee extends Human implements Worker {

    /**
     * Конструктор со всеми полями
     *
     * @param name
     * @param sirname
     * @param age
     */
    public Employee(String name, String sirname, int age) {
        super(name, sirname, age);
    }

    /**
     * Конструктор по умолчанию создает работника - человека по умолчанию
     */
    public Employee() {
        super();
    }

    /**
     * Конструктор копирования
     *
     * @param other
     */
    public Employee(Employee other) {
        super((Human)other);
    }

    /**
     * Конструктор копирования из объекта Human
     *
     * @param other
     */
    public Employee(Human other) {
        super(other.Name(), other.Sirname(), other.Age());
    }

    /**
     * Работник выполняет каку-то работу
     */
    public void work() {
        if (isSleep()) {
            return;
        }
        System.out.println(toString() + " работает...");
    }
}
