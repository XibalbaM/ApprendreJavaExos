package fr.xibalba.apprendreJavaExos;

import java.util.Map;

public class Bateau implements Amarrable {

    private final float poids;
    private final Port port;
    private boolean amarre;

    public Bateau(float poids, Port port) {
        this.poids = poids;
        this.port = port;
        this.port.ajouterAmarres(this, calculerAmarres());
        this.amarre = true;
    }

    public void setAmarre(boolean amarre) {

        this.port.retirerAmarres(this);
        this.amarre = amarre;
        if (amarre) {
            this.port.ajouterAmarres(this, calculerAmarres());
        }
    }

    @Override
    public Map<Amarrable, Integer> getAmarres() {
        return amarre ? Map.of(this.port, calculerAmarres()) : Map.of();
    }

    private int calculerAmarres() {
        return (int) Math.ceil(this.poids / 10f);
    }
}