package org.example;

import java.util.Scanner;

public class Exercice69 {
    public static void main(String[] args) {
        /*
        1. Créer une variable nombre de type entier
2. Affecter une valeur à la variable nombre
3. Créer une condition qui permet d'afficher si le nombre est pair ou impair
Utiliser l'opérateur mathématique permettant de retourner le reste d'une
division euclidienne

         */
        int nombre;
Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre :");
        nombre = scanner.nextInt();
        if (nombre % 2 == 0) {
            System.out.println("Le nombre saisi est pair");
        } else {
            System.out.println("Le nombre saisi est impair");
        }
    }
}
