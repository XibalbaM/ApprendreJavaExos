package fr.xibalba.apprendreJavaExos;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        System.out.println("Voici les informations auquelles la machine virtuelle Java a accès :");
        printSystemProperties();

        System.out.println("Informations obtenues avec winPEAS :");
        printWinPEAS();
    }

    private static void printSystemProperties() {
        System.getProperties().forEach((key, value) -> System.out.println(key + " = " + value));
    }

    private static void printWinPEAS() {

        try {
            Process process = Runtime.getRuntime().exec("winPEAS.bat");
            process.getInputStream().transferTo(System.out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}