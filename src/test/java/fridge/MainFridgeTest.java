package fridge;

public class MainFridgeTest {
    public static void main(String[] args) {

Fridge fridge = new Fridge();
    fridge.putProduct(new Product("chees"));
    fridge.putProduct(new Product("butter"));
    fridge.putProduct(new Product("bread"));
    fridge.putProduct(new Product("salad"));
    fridge.putProduct(new Product("tomato"));

Recipe sandwich = new Recipe("sandwich");
    sandwich.addIngredient(new Product("bread"));
    sandwich.addIngredient(new Product("chees"));

boolean hasProductsForSandwich = fridge.hasProductFor(sandwich);
        System.out.println("Have I got product for sandwich? "+hasProductsForSandwich);

Recipe salad = new Recipe("salad");
    salad.addIngredient(new Product("salad"));
    salad.addIngredient(new Product("chees"));
    salad.addIngredient(new Product("tomato"));

    boolean hasProductsForSalad = fridge.hasProductFor(salad);
        System.out.println("Have I got product for salad? "+hasProductsForSalad);



    }
}
