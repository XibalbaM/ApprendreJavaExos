package fr.xibalba.apprendreJavaExos.objets;

import fr.xibalba.apprendreJavaExos.MatiereRecyclee;

public class TasDeFeuille implements Recyclable {

    @Override
    public MatiereRecyclee recycle() {

        return MatiereRecyclee.COMPOSTE;
    }

    @Override
    public String getNom() {

        return "Tas de feuille";
    }
}
