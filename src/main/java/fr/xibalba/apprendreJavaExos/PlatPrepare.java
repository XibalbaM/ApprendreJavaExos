package fr.xibalba.apprendreJavaExos;

public class PlatPrepare extends Produit {

    public PlatPrepare() {
        super();
    }

    public PlatPrepare(double prixHorsTaxe) {

        this.prixTTC = prixHorsTaxe * 1.1;

        Epicerie.vendre(this.prixTTC);
    }

    public PlatPrepare(double prixHorsTaxe, double pourcentageReduction) {

        this(prixHorsTaxe);
        prixTTC -= (prixTTC * pourcentageReduction / 100);
    }
}
