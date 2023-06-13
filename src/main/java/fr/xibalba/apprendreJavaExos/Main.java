package fr.xibalba.apprendreJavaExos;

public class Main {

    public static void main(String[] args) {

        Port port = new Port();
        Bateau bateau1 = new Bateau(6, port);
        Bateau bateau2 = new Bateau(123, port);
        Hydravion hydravion1 = new Hydravion(150, port);
        System.out.println(port.getAmarres());
        System.out.println(hydravion1.getCapaciteReservoir());
        hydravion1.voler();
        hydravion1.setAmarre(false);
        hydravion1.voler();
        bateau2.setAmarre(false);
        System.out.println(port.getAmarres());
    }
}