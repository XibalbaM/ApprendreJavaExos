package fr.xibalba.apprendreJavaExos.objets;

import fr.xibalba.apprendreJavaExos.MatiereRecyclee;

public class BoiteEnVerre implements Recyclable {

    @Override
    public MatiereRecyclee recycle() {
        return MatiereRecyclee.VERRE;
    }

    @Override
    public String getNom() {
        return "Boite en verre";
    }
}
