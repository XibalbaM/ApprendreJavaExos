package fr.xibalba.apprendreJavaExos.candidats;

import fr.xibalba.apprendreJavaExos.desserts.Dessert;

public class Candidat {

    protected String nom;
    private int numeroCandidat;

    public Candidat() {}

    public Candidat(String nom, int numeroCandidat) {
        this.nom = nom;
        this.numeroCandidat = numeroCandidat;
    }

    public Dessert realiserDessert(String nom) {

        Dessert dessert = new Dessert(nom);
        System.out.printf("Le candidat %s à réalisé %s%n", this.nom, dessert.getNom());
        return dessert;
    }
}
