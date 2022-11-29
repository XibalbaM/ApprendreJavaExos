package fr.xibalba.apprendreJavaExos;

public class Main {

    public static void main(String[] args) {

        Epicerie epicerie = new Epicerie("Epicerie Xibalba");
        Produit produit = new ProduitAlimentaire(10);
        System.out.println("Le produit a été vendu au prix de " + produit.prixTTC + "€");
        Produit produit2 = new PlatPrepare(10);
        System.out.println("Le produit a été vendu au prix de " + produit2.prixTTC + "€");
        Produit produit4 = new ProduitAlimentaire(10, 10);
        System.out.println("Le produit a été vendu au prix de " + produit4.prixTTC + "€");
        Produit produit3 = new PlatPrepare(10, 10);
        System.out.println("Le produit a été vendu au prix de " + produit3.prixTTC + "€");
        System.out.println("Le chiffre d'affaire de l'épicerie " + epicerie.getNom() + " est de " + Epicerie.getChiffreAffaire() + "€.");
    }
}