package fr.xibalba.apprendreJavaExos;

public class Main {

    public static void main(String[] args) {

        PizzaDirector pizzaDirector = new PizzaDirector();
        System.out.println(pizzaDirector.getPizza("Leonardo"));
        System.out.println(pizzaDirector.getPizza("Michelangelo"));
        System.out.println(pizzaDirector.getPizza("Raphaelo"));
        System.out.println(pizzaDirector.getPizza("Donatello"));
        System.out.println(Pizza.builder().setName("Test").setSize(Pizza.Size.LARGE).addIngredients(Pizza.Ingredient.CHEESE, Pizza.Ingredient.MUSHROOM, Pizza.Ingredient.PEPPERONI).build());
    }
}