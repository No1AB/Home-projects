public class Ingredient  { //Each 'Ingredient' object will have a distinct name and quantity, not to be confused with recipe name
    private String name; 
    private String quantity;

    public Ingredient (String name, String quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Ingredient(Ingredient source) {
        this.name = source.name;
        this.quantity = source.quantity;
    }
    // Setters?
    public String getName() {
        return name;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

    public String getQuantity() {
        return quantity;
    }

    // public void setQuantity(String quantity) {
    //     this.quantity = quantity;  
    // }

     public String toString() {
        return name + " " + quantity;
    }
}
