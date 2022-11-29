package fr.xibalba.apprendreJavaExos;

public class ProduitAlimentaire extends Produit {

    public ProduitAlimentaire() {
        super();
    }

    public ProduitAlimentaire(double prixHorsTaxe) {

        super(prixHorsTaxe);
    }

    public ProduitAlimentaire(double prixHorsTaxe, double pourcentageReduction) {

        this(prixHorsTaxe);
        prixTTC -= (prixTTC * pourcentageReduction / 100);
    }
}
