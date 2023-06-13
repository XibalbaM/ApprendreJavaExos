package fr.xibalba.apprendreJavaExos;

import java.util.Map;

public class Hydravion extends Avion implements Amarrable {

    private final Port port;
    private boolean amarre;

    public Hydravion(int capaciteReservoir, Port port) {

        super(capaciteReservoir);
        this.port = port;
        this.port.ajouterAmarres(this, 1);
        this.amarre = true;
    }

    @Override
    public void voler() {

        if (this.amarre) {
            System.out.println("Je ne peux pas voler, je suis amarré !");
        } else {
            super.voler();
        }
    }

    public void setAmarre(boolean amarre) {

        this.port.retirerAmarres(this);
        this.amarre = amarre;
        if (this.amarre) {
            this.port.ajouterAmarres(this, 1);
        }
    }

    @Override
    public Map<Amarrable, Integer> getAmarres() {

        return amarre ? Map.of(this.port, 1) : Map.of();
    }
}