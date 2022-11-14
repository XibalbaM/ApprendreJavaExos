package fr.xibalba.apprendreJavaExos;

import fr.xibalba.apprendreJavaExos.candidats.Candidat;
import fr.xibalba.apprendreJavaExos.candidats.Chocolatier;
import fr.xibalba.apprendreJavaExos.candidats.Glacier;
import fr.xibalba.apprendreJavaExos.candidats.Patissier;
import fr.xibalba.apprendreJavaExos.desserts.Dessert;
import fr.xibalba.apprendreJavaExos.desserts.Gateau;
import fr.xibalba.apprendreJavaExos.desserts.Glace;
import fr.xibalba.apprendreJavaExos.desserts.MontageChocolat;

public class Main {

    public static void main(String[] args) {

        Candidat candidat = new Candidat("Ferrau Gauthier", 1);
        Dessert paris_brest = candidat.realiserDessert("Paris Brest");

        Patissier patissier = new Patissier("Voleta Labossière", 2);
        Gateau foret_noire = patissier.realiserDessert("Forêt Noire");
        foret_noire.cuireAuFour();

        Chocolatier chocolatier = new Chocolatier("Annette Lessard", 3);
        MontageChocolat oeuf_chocolat = chocolatier.realiserDessert("Oeuf de Pâque en chocolat");
        oeuf_chocolat.assemblerPieceDeChocolat();

        Glacier glacier = new Glacier("Emmanuel Picard", 4);
        Glace glace = glacier.realiserDessert("Glace Vanille-Fraise revisitée");
        glace.mettreAuCongelateur();

        Concours concours = new Concours(paris_brest, glace, foret_noire, oeuf_chocolat);
        concours.designerGagnant();
    }
}
