package fr.xibalba.apprendreJavaExos.desserts;

public class Gateau extends Dessert {

    public Gateau(String nom) {
        super(nom);
    }

    public void cuireAuFour() {
        System.out.println("Le gateau cuit au four");
    }
}