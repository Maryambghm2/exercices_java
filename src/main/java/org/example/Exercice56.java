package org.example;

import java.util.Scanner;

public class Exercice56 {
    /*
    1. Saisir une chaine et la stocker dans une variable
    2. Effectuer les traitements suivants :
    1. Afficher la chaîne en minuscule
    2. Afficher la chaîne en majuscule
    3. Bonus
    1. Convertir la chaîne en tableau puis afficher les caractères séparer d'une virgule
    2. Afficher la première lettre de chaque mot en majuscule
     */
    public static void main(String[] args) {
        String chaine;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une chaîne :");
        chaine = scanner.nextLine();
        System.out.println("En minuscule : " + chaine.toLowerCase());
        System.out.println("En majuscule : " + chaine.toUpperCase());

        // Décomposition lettre séparée par ","
        char[] tab = chaine.toCharArray();
        System.out.println("Décomposition par lettre : ");

        for (char c : tab) {
            System.out.print(c + ",");
        }
        System.out.println("");
        System.out.println("Affichage premiere lettre majuscule :" + capitalizeWorld(chaine));
    }

    // Fonction Première lettre majuscule
    public static String capitalizeWorld(String str) {
        // Initialiser tout en minuscule
        str = str.trim().toLowerCase();

        // Séparer chaque mot par un espace
        String[] mots = str.split(" ");
        String resultat = "";

        for (String mot : mots) {
            if (!mot.isEmpty()) {
                // Premiere lettre en majuscule
                String maj = mot.substring(0, 1).toUpperCase();
                // Affichage de la suite du mot à partir de l'index 1
                String reste = mot.substring(1);
                //   Concaténation majuscule + suite mot
                resultat += maj + reste + " ";
            } else {
                System.out.println("Vous n'avez rien écrit");
            }
        }
        return resultat;
    }

}
