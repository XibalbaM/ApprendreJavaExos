package fr.xibalba.apprendreJavaExos;

public class Epicerie {

    private static double chiffreAffaire;
    private String nom;

    public Epicerie() {}

    public Epicerie(String nom) {
        this.nom = nom;
    }

    public static double getChiffreAffaire() {

        return chiffreAffaire;
    }

    public static void setChiffreAffaire(double chiffreAffaire) {

        Epicerie.chiffreAffaire = chiffreAffaire;
    }

    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public static void vendre(double prix) {

        chiffreAffaire += prix;
    }
}
