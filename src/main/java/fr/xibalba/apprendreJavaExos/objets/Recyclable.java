package fr.xibalba.apprendreJavaExos.objets;

import fr.xibalba.apprendreJavaExos.MatiereRecyclee;
import fr.xibalba.apprendreJavaExos.ProduitNonRecyclableException;

public interface Recyclable {

    MatiereRecyclee recycle() throws ProduitNonRecyclableException;
    String getNom();
}
