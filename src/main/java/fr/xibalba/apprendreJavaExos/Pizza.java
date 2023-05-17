package fr.xibalba.apprendreJavaExos;

import java.util.stream.Stream;

public class Pizza {

    private final String name;
    private final Size size;
    private final Ingredient[] ingredients;

    private Pizza(Builder builder) {
        this.name = builder.name;
        this.size = builder.size;
        this.ingredients = builder.ingredients;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(this.name).append(" : Une ").append(this.size.getName()).append(" Pizza");

        for (Ingredient ingredient : ingredients) {
            sb.append(" ").append(ingredient.getName());
        }

        if (ingredients.length == 0) {
            sb.append(" sans garniture");
        }

        return sb.toString();
    }

    public static class Builder {

        private String name;
        private Size size;
        private Ingredient[] ingredients;

        public Builder() {
            this.size = Size.MEDIUM;
            this.ingredients = new Ingredient[0];
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSize(Size size) {
            this.size = size;
            return this;
        }

        public Builder addIngredients(Ingredient... ingredients) {
            this.ingredients = Stream.concat(Stream.of(this.ingredients), Stream.of(ingredients)).toArray(Ingredient[]::new);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    public enum Size {
        SMALL("Petite"),
        MEDIUM("Moyenne"),
        LARGE("Grande");

        private final String name;

        Size(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum Ingredient {
        CHEESE("Fromage"),
        PEPPERONI("Pepperoni"),
        MUSHROOM("Champignon");

        private final String name;

        Ingredient(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }
}
