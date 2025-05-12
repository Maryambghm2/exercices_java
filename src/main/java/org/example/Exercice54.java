package org.example;

import java.util.Scanner;

public class Exercice54 {
    /*
1. Créer une variable age et lui affecter une valeur
2. Vérifier si la personne est mineure ou majeure à l'aide des
    opérateurs logiques
3. Afficher le résultat
4. /!\ Ne pas utiliser de structure conditionnelle
     */

    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un age :");
        age = scanner.nextInt();

boolean statut = (age >= 18 );
        System.out.println(statut);
    }
}
