package LLS.Breuvage.exception;

public class StockMovementNotFoundException extends RuntimeException {
    public StockMovementNotFoundException(String message) {
        super(message);
    }
}
