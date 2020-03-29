package hm3;

/**
 * класс "Интерн"
 * Студент, который может работать
 */
public class Intern extends Student implements Worker {

    /**
     * Конструктор по умолчанию
     */
    public Intern(){
        super();
    }

    /**
     * Конструктор копирования
     * @param other
     */
    public Intern(Intern other) {
        super(other.Name(), other.Sirname(), other.Age());
    }

    /**
     * Конструктор копирования объекта Student
     * @param other
     */
    public Intern(Student other){
        super(other.Name(), other.Sirname(), other.Age());
    }

    /**
     * Интерн работает
     */
    public void work(){
        if(isSleep()) {
            return;
        }
        System.out.println("Интерн " + toString() + " работает...");
    }
}
