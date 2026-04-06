package Model;

public class NonVegRecipe extends Recipe {

    public NonVegRecipe(String name, int cookingTime) {
        super(name, cookingTime);
    }

    
    public void displayRecipe() {
        System.out.println("Non-Veg Recipe: " +getName());
        System.out.println("Cooking Time: "+getCookingTime()+ " mins");
    }
}