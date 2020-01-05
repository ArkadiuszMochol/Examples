package fridge;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
    List<Product> ingredients = new ArrayList<>();

    public void putProduct(Product product) {
        ingredients.add(product);
    }

    public List<Product> getIngredients() {
        return ingredients;
    }

    public boolean hasProductFor(Recipe recipe) {
        for (Product product : recipe.ingredients) {
            if(!ingredients.contains(product)){
                return false;
            }
        }return true;
    }

}
