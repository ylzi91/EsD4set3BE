package yurilenzi.exception;

public class NullException extends RuntimeException {
    public NullException(long id) {
        super("Non trovo il numero id: " + id);
    }
}
