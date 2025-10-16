package LLS.Breuvage.exception;

public class ProductCategoryNotFoundException extends RuntimeException {
    public ProductCategoryNotFoundException(String message) {
        super(message);
    }
}
