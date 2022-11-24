package fr.xibalba.apprendreJavaExos.objets;

import fr.xibalba.apprendreJavaExos.MatiereRecyclee;

public class VieuxJournal implements Recyclable {

    @Override
    public MatiereRecyclee recycle() {

        return MatiereRecyclee.PATE_A_PAPIER;
    }

    @Override
    public String getNom() {

        return "Vieux journal";
    }
}