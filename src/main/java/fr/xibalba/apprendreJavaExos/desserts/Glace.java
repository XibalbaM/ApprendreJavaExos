package fr.xibalba.apprendreJavaExos.desserts;

public class Glace extends Dessert {

    public Glace(String nom) {
        super(nom);
    }

    public void mettreAuCongelateur() {
        System.out.println("La glace est stockée au congélateur");
    }
}