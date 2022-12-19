package fr.xibalba.apprendreJavaExos;

public class CarteAnniversaire extends Carte {

    public CarteAnniversaire(String destinataire) {
        super(destinataire);
    }

    @Override
    public void souhaiter() {
        System.out.println("Joyeux anniversaire " + destinataire + " !");
    }

    @Override
    public boolean equals(Object obj) {

        return obj instanceof CarteAnniversaire && ((CarteAnniversaire) obj).destinataire.equals(destinataire);
    }
}