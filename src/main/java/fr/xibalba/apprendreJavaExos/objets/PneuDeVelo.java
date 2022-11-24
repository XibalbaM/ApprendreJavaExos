package fr.xibalba.apprendreJavaExos.objets;

import fr.xibalba.apprendreJavaExos.MatiereRecyclee;
import fr.xibalba.apprendreJavaExos.ProduitNonRecyclableException;

public class PneuDeVelo implements Recyclable {

    @Override
    public MatiereRecyclee recycle() throws ProduitNonRecyclableException {

        throw new ProduitNonRecyclableException("Le pneu de vélo n'est pas recyclable");
    }

    @Override
    public String getNom() {

        return "Pneu de vélo";
    }
}
