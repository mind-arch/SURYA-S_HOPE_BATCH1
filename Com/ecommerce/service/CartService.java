package ecommerce.service;

import java.util.*;
import ecommerce.model.Product;

public class CartService {
    private ArrayList<Product> cartItems = new ArrayList<>();

    public void addToCart(Product product) {
        cartItems.add(product);
        System.out.println("Added to cart: " + product.getName());
    }



    public double calculateTotal() {
        double total = 0.0;
        for (Product product : cartItems) {
            total += product.getPrice();
        }
        return total;
    }
}