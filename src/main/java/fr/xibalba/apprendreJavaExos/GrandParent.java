package fr.xibalba.apprendreJavaExos;

import java.util.ArrayList;
import java.util.List;

public class GrandParent {

    private final List<Carte> cartesSouhaitees = new ArrayList<>();

    public void souhaiterEvenement(Carte carte) {

        if (cartesSouhaitees.contains(carte)) {
            System.out.println("Je ne peux pas renvoyer la même carte!");
        } else {
            carte.souhaiter();
            cartesSouhaitees.add(carte);
        }
    }
}
