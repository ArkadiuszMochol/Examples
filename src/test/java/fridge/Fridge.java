package fridge;
import java.util.HashMap;
import java.util.Map;

public class Fridge {
    Map<Product, Integer> ingredients = new HashMap<>();

    public void putProduct(Product product, Integer quantity) {
        ingredients.put(product, quantity);
    }


    public boolean hasProductFor(Recipe recipe) {
        for (Product product : recipe.ingredients) {
            if(!ingredients.containsKey(product)){
                return false;
            }
        }return true;
    }



}
