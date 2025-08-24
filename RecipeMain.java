public class RecipeMain {
    static RecipeBook recipeBook = new RecipeBook();
        public static void main(String args[]) {
        
        Recipe[] recipe = new Recipe[] {
            
            
            
        };
        Recipe bread = new Recipe("Bread", new Ingredient[] {new Ingredient("Flour", "400g"), new Ingredient("Sugar", "18g"), new Ingredient("Milk", "130ml")}, new String[] {"Scales", "Bread maker"});
        
        
        // recipe[0] = new Recipe {"Flour", "Sugar", "Butter", "Yeast", "Eggs", "Milk"};
        // bread.equipment = new String[] {"Scales", "Bread maker"};

        // Recipe plaintainDumplings = new Recipe("Plantain dumplings", args, args);
        // plaintainDumplings.ingredients =
        //         new String[] {"Plantain", "Flour", "Olive oil", "Bicarbonate",};
        // plaintainDumplings.ingredients = new String[] {"Mixing bowl", "Scales", "Grater",};

        // Recipe batteredCod = new Recipe("Battered Cod", args, args);
        // batteredCod.ingredients = new String[] {"Cod fillets", "All purpose flour", "B.pepper",
        //         "Salt", "Eggs", "Paprika",};
        // batteredCod.equipment = new String[] {"Frying pan", "Draining rack"};

        // Recipe sweetPotatoBrownies = new Recipe("Sweet Potato Brownies", args, args);
        // sweetPotatoBrownies.ingredients = new String[] {"Cooked sweet potato mash",
        //         "All purpose flour", "Cocoa powder", "Sugar", "Butter", "Eggs", "Bicarbonate",};
        // sweetPotatoBrownies.equipment =
        //         new String[] {"Tray for brownies", "Mixing bowl", "Scales",};

        System.out.println("Here is a list of all the recipes in the Recipebook. Enter the number that corresponds to the recipe you wish to see and hit enter");
        // Print out list of recipe names + corresponding index
        System.out.println(bread);
    }
}
