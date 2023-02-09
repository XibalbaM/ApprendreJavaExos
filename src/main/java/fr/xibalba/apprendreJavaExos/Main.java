package fr.xibalba.apprendreJavaExos;

public class Main {

    public static void main(String[] args) {

        System.out.println(PierrePapierCiseau.CISEAU.bat(PierrePapierCiseau.CISEAU));
        System.out.println(PierrePapierCiseau.PIERRE.bat(PierrePapierCiseau.PAPIER));
        System.out.println(PierrePapierCiseau.PAPIER.bat(PierrePapierCiseau.PIERRE));
        System.out.println(PierrePapierCiseau.PIERRE.bat(PierrePapierCiseau.CISEAU));
    }
}