package fr.xibalba.apprendreJavaExos.objets;

import fr.xibalba.apprendreJavaExos.MatiereRecyclee;

public class BouteilleEnPET implements Recyclable {

    @Override
    public MatiereRecyclee recycle() {

        return MatiereRecyclee.PET;
    }

    @Override
    public String getNom() {

        return "Bouteille en PET";
    }
}
