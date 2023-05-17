package fr.xibalba.apprendreJavaExos;

import java.util.HashMap;
import java.util.Map;

public class PizzaDirector {

    private final Map<String, Pizza> pizzaPresets = new HashMap<>();

    public PizzaDirector() {
        pizzaPresets.put("Leonardo", Pizza.builder().setName("Leonardo").setSize(Pizza.Size.LARGE).addIngredients(Pizza.Ingredient.CHEESE, Pizza.Ingredient.PEPPERONI).build());
        pizzaPresets.put("Michelangelo", Pizza.builder().setName("Michelangelo").setSize(Pizza.Size.SMALL).addIngredients(Pizza.Ingredient.MUSHROOM, Pizza.Ingredient.PEPPERONI).build());
        pizzaPresets.put("Raphaelo", Pizza.builder().setName("Raphaelo").setSize(Pizza.Size.SMALL).build());
        pizzaPresets.put("Donatello", Pizza.builder().setName("Donatello").addIngredients(Pizza.Ingredient.CHEESE, Pizza.Ingredient.MUSHROOM, Pizza.Ingredient.PEPPERONI).build());
    }

    public Pizza getPizza(String name) {
        return pizzaPresets.get(name);
    }
}
