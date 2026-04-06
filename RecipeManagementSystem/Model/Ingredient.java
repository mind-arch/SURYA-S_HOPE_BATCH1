package Model;

import Utility.ValidationUtil;

public class Ingredient {
    private String name;
    private int quantity;

    public Ingredient(String name, int quantity) {
        ValidationUtil.validateQuantity(quantity);
        this.name=name;
        this.quantity=quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}