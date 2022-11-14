package fr.xibalba.apprendreJavaExos.candidats;

import fr.xibalba.apprendreJavaExos.desserts.Glace;

public class Glacier extends Candidat {

    public Glacier(String nom, int numeroCandidat) {
        super(nom, numeroCandidat);
    }

    public Glacier() {}

    @Override
    public Glace realiserDessert(String nom) {

        Glace glace = new Glace(nom);
        System.out.printf("Le glacier %s à réalisé %s%n", this.nom, glace.getNom());
        return glace;
    }
}
