public class RecipeMain {
    public static void main(String args[]) {

       Recipe bread = new Recipe("Bread", args, args);
       bread.ingredients = new String[] {"Flour", "Sugar", "Butter", "Yeast", "Eggs", "Milk", };
       bread.equipment = new String[] {"Scales", "Bread Maker"};

       Recipe plaintainDumplings = new Recipe("Plantain Dumplings", args, args);
       plaintainDumplings.ingredients = new String[] {"Plantain", "Flour", "Oil", "Bicarbonate",  };
       plaintainDumplings.ingredients = new String[] {"Mixing bowl", "Scales", };

       System.out.println(bread);
    }
}
