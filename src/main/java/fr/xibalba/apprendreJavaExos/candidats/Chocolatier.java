package fr.xibalba.apprendreJavaExos.candidats;

import fr.xibalba.apprendreJavaExos.desserts.MontageChocolat;

public class Chocolatier extends Candidat {

    public Chocolatier(String nom, int numeroCandidat) {
        super(nom, numeroCandidat);
    }

    public Chocolatier() {}

    @Override
    public MontageChocolat realiserDessert(String nom) {

        MontageChocolat montageChocolat = new MontageChocolat(nom);
        System.out.printf("Le chocolatier %s à réalisé %s%n", this.nom, montageChocolat.getNom());
        return montageChocolat;
    }
}
