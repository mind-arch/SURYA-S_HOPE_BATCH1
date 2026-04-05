package Service;

import Model.Recipe;
import java.util.*;

public class RecipeManager {

    private List<Recipe> recipes = new ArrayList<>();

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public void showAllRecipes() {
        for (Recipe r : recipes) {
            r.displayRecipe(); // Polymorphism
            System.out.println("-------------------");
        }
    }

    public void searchRecipe(String name) {
        for (Recipe r : recipes) {
            if (r.getName().equalsIgnoreCase(name)) {
                r.displayRecipe();
                return;
            }
        }
        System.out.println("Recipe not found!");
    }
}