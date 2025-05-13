package org.example;

import java.util.Scanner;

public class Exercice73 {
    public static void main(String[] args) {
        /*
        1. Créer une variable mois de type entier
2. Affecter une valeur à la variable mois
3. Afficher le nombre de jours du mois
4. Si le nombre est inférieur à 1 et supérieur à 12, afficher un
message d'erreur

         */
        int mois;
        int jour = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un numéro de mois :");
        mois = scanner.nextInt();
        switch (mois) {
            case 1 -> jour = 31;
            case 2 -> jour = 28;
            case 3 -> jour = 31;
            case 4 -> jour = 30;
            case 5 -> jour = 31;
            case 6 -> jour = 30;
            case 7 -> jour = 31;
            case 8 -> jour = 31;
            case 9 -> jour = 30;
            case 10 -> jour = 31;
            case 11 -> jour = 30;
            case 12 -> jour = 31;
            default -> System.out.println("Le nombre doit être compris entre 1 et 12.");
        }
        if (jour != 0) {
            System.out.println(jour + " jours");
        }
    }
}
