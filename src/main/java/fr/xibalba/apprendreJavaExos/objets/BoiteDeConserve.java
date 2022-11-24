package fr.xibalba.apprendreJavaExos.objets;

import fr.xibalba.apprendreJavaExos.MatiereRecyclee;

public class BoiteDeConserve implements Recyclable {

    @Override
    public MatiereRecyclee recycle() {

        return MatiereRecyclee.METAL;
    }

    @Override
    public String getNom() {

        return "Boite de conserve";
    }
}
