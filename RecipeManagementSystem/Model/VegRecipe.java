package Model;

public class VegRecipe extends Recipe {

    public VegRecipe(String name, int cookingTime) {
        super(name, cookingTime);
    }

    public void displayRecipe() {
        System.out.println("Veg Recipe: " +getName());
        System.out.println("Cooking Time: "+ getCookingTime()+ " mins");
    }
}
