package homework3;

//содать класс SleepException который наследуется от RunTimeException
//        (конструктор должен принимать параметр типа Human, и в этом конструкторе должно генерироваться сообщение о том что человек спит и не может ничего делть в это момент)

public class SleepException extends RuntimeException {

    // непроверяемое исключение. Не должно срабатывать, должны исключатьсяч такие ситуации в коде
    public SleepException(Human human){
        System.out.println(human.toString()+" is sleeping! Can't do anything while sleeping. Wake him up first");
    }

}
