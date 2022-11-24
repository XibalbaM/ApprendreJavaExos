package fr.xibalba.apprendreJavaExos.objets;

import fr.xibalba.apprendreJavaExos.MatiereRecyclee;

public class BoiteDeSardines implements Recyclable {

    @Override
    public MatiereRecyclee recycle() {
        return MatiereRecyclee.METAL;
    }

    @Override
    public String getNom() {
        return "Boite de sardines";
    }
}
