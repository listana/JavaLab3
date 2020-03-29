package hm3;

/**
 * Бросаем TakeBookException каждый раз при невозможности выдать/вернуть книгу
 */
public class TakeBookException extends RuntimeException {

    public TakeBookException(String message) {
        super(message);
    }
}
