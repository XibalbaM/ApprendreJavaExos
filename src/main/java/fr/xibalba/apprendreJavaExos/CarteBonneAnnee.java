package fr.xibalba.apprendreJavaExos;

public class CarteBonneAnnee extends Carte {

    public CarteBonneAnnee(String destinataire) {
        super(destinataire);
    }

    @Override
    public void souhaiter() {
        System.out.println("Bonne année " + destinataire + " !");
    }

    @Override
    public boolean equals(Object obj) {

        return obj instanceof CarteBonneAnnee && ((CarteBonneAnnee) obj).destinataire.equals(destinataire);
    }
}
