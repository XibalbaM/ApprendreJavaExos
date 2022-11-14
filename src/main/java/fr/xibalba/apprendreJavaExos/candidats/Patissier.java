package fr.xibalba.apprendreJavaExos.candidats;

import fr.xibalba.apprendreJavaExos.desserts.Gateau;

public class Patissier extends Candidat {

    public Patissier(String nom, int numeroCandidat) {
        super(nom, numeroCandidat);
    }

    public Patissier() {}

    @Override
    public Gateau realiserDessert(String nom) {

        Gateau gateau = new Gateau(nom);
        System.out.printf("Le pâtissier %s à réalisé %s%n", this.nom, gateau.getNom());
        return gateau;
    }
}