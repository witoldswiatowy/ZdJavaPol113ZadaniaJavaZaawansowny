package collections;

public class EmptyQueueException extends Throwable {
    public EmptyQueueException() {
        super("Kolejka jest pusta");
    }
}