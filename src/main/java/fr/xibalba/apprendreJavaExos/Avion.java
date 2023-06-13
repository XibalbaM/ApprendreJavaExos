package fr.xibalba.apprendreJavaExos;

public class Avion {

    protected final int capaciteReservoir;

    public Avion(int capaciteReservoir) {

        this.capaciteReservoir = capaciteReservoir;
    }

    public int getCapaciteReservoir() {

        return capaciteReservoir;
    }

    public void voler() {

        System.out.println("Je vole !");
    }
}