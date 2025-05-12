package org.example;

import java.util.Scanner;

public class Exercice51 {
    public static void main(String[] args) {
       /* 1. Créer une variable nom et une variable prenom
        2. Afficher la phrase suivante "Bonjour {prenom} {NOM}."
        3. Remplacer les valeurs entre chevrons par les variables créées
                précédemment
    */

        String nom, prenom;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un prenom :");
               prenom = scanner.nextLine();
        System.out.println("Saisir un nom :");
        nom = scanner.nextLine();

        System.out.println("Bonjour "+ prenom+ " "+nom +".");
    }
}
