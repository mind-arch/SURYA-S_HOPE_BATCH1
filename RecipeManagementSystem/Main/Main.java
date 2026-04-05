package Main;

import Model.*;
import Service.RecipeManager;

public class Main {

    public static void main(String[] args) {

        RecipeManager manager = new RecipeManager();

        try {
            Recipe r1 = new VegRecipe("Paneer Butter Masala", 30);
            Recipe r2 = new NonVegRecipe("Chicken Biryani", 60);

            manager.addRecipe(r1);
            manager.addRecipe(r2);

            manager.showAllRecipes();

            System.out.println("Searching...");
            manager.searchRecipe("Chicken Biryani");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}