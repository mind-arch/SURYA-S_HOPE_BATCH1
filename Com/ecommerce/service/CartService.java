package com.ecommerce.service;

import java.util.*;
import com.ecommerce.model.Product;

public class CartService {
    private List<Product> cartItems;

    public CartService() {
        cartItems = new ArrayList<>();
    }

    public void addToCart(Product product) {
        cartItems.add(product);
        System.out.println("Added to cart: " + product.getName());
    }

    public void removeFromCart(Product product) {
        if (cartItems.remove(product)) {
            System.out.println("Removed from cart: " + product.getName());
        } else {
            System.out.println("Product not found in cart: " + product.getName());
        }
    }

    public void viewCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Cart Items:");
            for (Product product : cartItems) {
                product.display();
                System.out.println();
            }
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Product product : cartItems) {
            total += product.getPrice();
        }
        return total;
    }
}