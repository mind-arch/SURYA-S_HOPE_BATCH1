package Utility;

public class ValidationUtil {

    public static void validateQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive!");
        }
    }

    public static void validateCookingTime(int time) {
        if (time <= 0) {
            throw new IllegalArgumentException("Cooking time must be valid!");
        }
    }
}