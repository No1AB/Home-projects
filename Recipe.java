import java.util.Arrays;

public class Recipe {
    String name;
    String[] ingredients;
    String[] equipment;

    public Recipe(String name, String[] ingredients, String[] equipment) { // Recipe constructor
        this.name = name;
        this.ingredients = ingredients;
        this.equipment = equipment;
    }

    public Recipe(Recipe source) { // Copy Constructor
        this.name = source.name;
        this.ingredients = source.ingredients;
        this.equipment = source.equipment;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return this.ingredients;
    }

    public void setIngredients(String[] ingredients) { // Setter for ingredients array...work in
                                                       // progress
        this.ingredients = new String[10];
    }

    public String[] getEquipment() {
        return this.equipment;
    }

    public void setEquipment(String[] equipment) {
        this.equipment = equipment;
    }


    public String toString() {
        return
            "\t- Recipe: " + getName() + "\n" +
            "\t- Ingredients: " + Arrays.toString(ingredients) + "\n" +
            "\t- Equipment: " + Arrays.toString(equipment);
            
    }




}
