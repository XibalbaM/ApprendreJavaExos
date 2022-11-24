package fr.xibalba.apprendreJavaExos;

import fr.xibalba.apprendreJavaExos.objets.Recyclable;

import java.util.ArrayList;
import java.util.List;

public class StationDeRecyclage {

    private List<Recyclable> recyclables = new ArrayList<>();

    public void arrivage(Recyclable recyclable) {
        recyclables.add(recyclable);
    }

    public void recycler() {

        System.out.println("Recyclage en cours...");

        for (Recyclable recyclable : recyclables) {
            try {
                System.out.println("Recyclage de " + recyclable.getNom() + " en " + recyclable.recycle().name().toLowerCase());
            } catch (ProduitNonRecyclableException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Recyclage terminé !");
    }
}
