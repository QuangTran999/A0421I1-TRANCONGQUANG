package exception;

public class InvalidDateException extends Exception {
    public InvalidDateException() {
    }

    public InvalidDateException(String msg) {
        super(msg);
    }
}
