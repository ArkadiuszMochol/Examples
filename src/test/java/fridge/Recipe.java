package fridge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recipe {
    private String name;

    public Recipe(String recipe) {
        this.name = recipe;
    }

    List<Product> ingredients = new ArrayList<>();
    private Map<Product, Integer> productsMap = new HashMap<>();

    public void addIngredient(Product product){
        ingredients.add(product);
    }

}
