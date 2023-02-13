package fr.xibalba.apprendreJavaExos;

public enum Categories {
    Art("Art & Literature", "art_and_literature"),
    Film("Film & TV", "film_and_tv"),
    Food("Food & Drink", "food_and_drink"),
    General("General Knowledge", "general_knowledge"),
    Geography("Geography", "geography"),
    History("History", "history"),
    Music("Music", "music"),
    Science("Science", "science"),
    Society("Society & Culture", "society_and_culture"),
    Sport("Sport & Leisure", "sport_and_leisure");

    private final String name;
    private final String code;

    Categories(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public static Categories getByName(String name) {
        for (Categories category : Categories.values()) {
            if (category.getName().equalsIgnoreCase(name)) {
                return category;
            }
        }
        throw new IllegalArgumentException("No category found with the name: " + name);
    }

    public static Categories getByOrdinal(int ordinal) {
        for (Categories category : Categories.values()) {
            if (category.ordinal() == ordinal) {
                return category;
            }
        }
        throw new IllegalArgumentException("No category found with the ordinal: " + ordinal);
    }
}