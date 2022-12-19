package fr.xibalba.apprendreJavaExos;

public abstract class Carte {

    protected String destinataire;

    public Carte(String destinataire) {
        this.destinataire = destinataire;
    }

    public abstract void souhaiter();
}
