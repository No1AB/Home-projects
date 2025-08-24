public class RecipeBook {

    private Recipe[] recipes;

    public RecipeBook() {
        this.recipes = new Recipe[15];
    }

    public Recipe getRecipe(int index) {
        return new Recipe(this.recipes[index]);
    }
    public void setRecipe(Recipe recipe, int index) {
        this.recipes[index] = new Recipe(recipe);
    }



}
