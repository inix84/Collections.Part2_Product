package product;
public class RecipeException extends RuntimeException{
    public RecipeException() {
    }
    public RecipeException(String message) {
        super(message);
    }
}