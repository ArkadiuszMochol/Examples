package fridge;

import java.util.ArrayList;
import java.util.List;

public class MainFridgeTest {
    public static void main(String[] args) {

        Fridge fridge = new Fridge();
        fridge.putProduct(new Product("cheees"), 6);
        fridge.putProduct(new Product("bread"), 8);
        fridge.putProduct(new Product("salad"), 2);
        fridge.putProduct(new Product("tomato"), 4);

        Recipe sandwich = new Recipe("sandwich");
        sandwich.addIngredient(new Product("bread"),2);
        sandwich.addIngredient(new Product("chees"),2);

        boolean hasProductsForSandwich = fridge.hasProductFor(sandwich);
        System.out.println("Have I got product for sandwich? " + hasProductsForSandwich);

        Recipe salad = new Recipe("salad");
        salad.addIngredient(new Product("salad"),1);
        salad.addIngredient(new Product("chees"),2);
        salad.addIngredient(new Product("tomato"),3);

        boolean hasProductsForSalad = fridge.hasProductFor(salad);
        System.out.println("Have I got product for salad? " + hasProductsForSalad);

        Recipe friedEggs = new Recipe("friedEggs");
        friedEggs.addIngredient(new Product("egg"),5);
        friedEggs.addIngredient(new Product("butte r"),1);

    boolean hasIngredientsForFriedEggs = fridge.hasProductFor(friedEggs);
        System.out.println("Have I got product for fried eggs? "+hasIngredientsForFriedEggs);


    }
}
