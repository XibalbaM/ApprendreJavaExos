package fr.xibalba.apprendreJavaExos;

public abstract class Produit {

    protected double prixTTC;

    public Produit() {

        this.prixTTC = 0;
    }

    public Produit(double prixHorsTaxe) {

        this.prixTTC = prixHorsTaxe * 1.055;

        Epicerie.vendre(this.prixTTC);
    }
}
