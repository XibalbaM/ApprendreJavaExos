package fr.xibalba.apprendreJavaExos;

import fr.xibalba.apprendreJavaExos.desserts.Dessert;
import fr.xibalba.apprendreJavaExos.desserts.Gateau;
import fr.xibalba.apprendreJavaExos.desserts.Glace;
import fr.xibalba.apprendreJavaExos.desserts.MontageChocolat;

import java.util.ArrayList;
import java.util.List;

public class Concours {

    private Dessert dessert;
    private Glace glace;
    private Gateau gateau;
    private MontageChocolat montageChocolat;

    public Concours(Dessert dessert, Glace glace, Gateau gateau, MontageChocolat montageChocolat) {

        this.dessert = dessert;
        this.glace = glace;
        this.gateau = gateau;
        this.montageChocolat = montageChocolat;
    }

    void designerGagnant(){

        if(dessert != null && montageChocolat != null && glace != null && gateau!= null){
            List<Dessert> listeDessert = new ArrayList();
            listeDessert.add(dessert);
            listeDessert.add(montageChocolat);
            listeDessert.add(glace);
            listeDessert.add(gateau);

            int numeroGagnant = (int) (Math.random() * ((3) + 1));

            System.out.println("Le dessert gagnant est: " + listeDessert.get(numeroGagnant).getNom());
        } else {
            System.out.println("Tous les desserts ne sont pas terminés");
        }
    }

    public Dessert getDessert() {

        return dessert;
    }

    public void setDessert(Dessert dessert) {

        this.dessert = dessert;
    }

    public Glace getGlace() {

        return glace;
    }

    public void setGlace(Glace glace) {

        this.glace = glace;
    }

    public Gateau getGateau() {

        return gateau;
    }

    public void setGateau(Gateau gateau) {

        this.gateau = gateau;
    }

    public MontageChocolat getMontageChocolat() {

        return montageChocolat;
    }

    public void setMontageChocolat(MontageChocolat montageChocolat) {

        this.montageChocolat = montageChocolat;
    }
}