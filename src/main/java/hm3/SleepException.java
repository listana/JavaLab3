package hm3;

/**
 * содать класс SleepException который наследуется от RunTimeException
 * (конструктор должен принимать параметр типа Human, и в этом конструкторе должно генерироваться сообщение о том
 * что человек спит и не может ничего делть в это момент)
 */
public class SleepException extends RuntimeException {

    /**
     * непроверяемое исключение. Не должно срабатывать, должны исключатьсяч такие ситуации в коде
     * @param human
     */
    public SleepException(Human human) {
        System.out.println(human.toString() + " сейчас спит. Не может ничего делать, пока спит. Нужно сначала разбудить");
    }

}
