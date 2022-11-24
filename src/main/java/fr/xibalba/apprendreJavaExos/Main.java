package fr.xibalba.apprendreJavaExos;

import fr.xibalba.apprendreJavaExos.objets.*;

public class Main {

    public static void main(String[] args) {

        StationDeRecyclage stationDeRecyclage = new StationDeRecyclage();
        stationDeRecyclage.arrivage(new BoiteDeConserve());
        stationDeRecyclage.arrivage(new BoiteDeSardines());
        stationDeRecyclage.arrivage(new BoiteEnVerre());
        stationDeRecyclage.arrivage(new BouteilleEnPET());
        stationDeRecyclage.arrivage(new PneuDeVelo());
        stationDeRecyclage.arrivage(new TasDeFeuille());
        stationDeRecyclage.arrivage(new VieuxJournal());

        stationDeRecyclage.recycler();
    }
}