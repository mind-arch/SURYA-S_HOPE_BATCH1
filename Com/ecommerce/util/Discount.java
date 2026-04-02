package ecommerce.util;

public class Discount {

    public static int applyDiscountAmount(int price) {
        // Example: 10% discount, minimum 20 off
        int discount = (int) (price * 0.10);
        discount = Math.max(discount, 20);
        return price - discount;
    }
}