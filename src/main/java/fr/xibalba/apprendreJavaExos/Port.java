package fr.xibalba.apprendreJavaExos;

import java.util.HashMap;
import java.util.Map;

public class Port implements Amarrable {

    private final Map<Amarrable, Integer> amarres = new HashMap<>();

    public void ajouterAmarres(Amarrable cible, int quantite) {
        if (this.amarres.containsKey(cible)) {
            this.amarres.put(cible, this.amarres.get(cible) + quantite);
        } else {
            this.amarres.put(cible, quantite);
        }
    }

    public void retirerAmarres(Amarrable cible) {

        this.amarres.remove(cible);
    }

    @Override
    public Map<Amarrable, Integer> getAmarres() {

        return this.amarres;
    }
}
