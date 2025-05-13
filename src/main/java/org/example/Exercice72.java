package org.example;

import java.util.Scanner;

public class Exercice72 {
    public static void main(String[] args) {
        /*
        . Créer une variable jour de type entier
2. Affecter une valeur à la variable jour
3. Afficher le jour de la semaine en lettre en fonction du nombre
passé
4. Si le nombre est inférieur à 1 et supérieur à 7, afficher un message
d'erreur
         */
        int j;
        String jour;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un jour de la semaine :");
        j = scanner.nextInt();
        switch (j) {
            case 1:
                jour = "Lundi";
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4 :
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
                break;
            case 7:
                jour = "Dimanche";
                break;
            default:
                System.out.println("Le nombre choisi doit être compris entre 1 et 7.");
        }


    }
}
