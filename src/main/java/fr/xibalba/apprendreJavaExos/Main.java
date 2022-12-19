package fr.xibalba.apprendreJavaExos;

public class Main {

    public static void main(String[] args) {

        Carte carte1 = new CarteBonneAnnee("Robert");
        Carte carte2 = new CarteAnniversaire("Robert");

        GrandParent grandParent = new GrandParent();
        grandParent.souhaiterEvenement(carte1);
        grandParent.souhaiterEvenement(carte2);
        grandParent.souhaiterEvenement(carte2);
    }
}