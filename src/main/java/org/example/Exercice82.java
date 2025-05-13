package org.example;

import java.util.Scanner;

public class Exercice82 {
    public static void main(String[] args) {
        /*
        1. Déclarer une variable nombre
2. À l'aide de boucles, afficher les suites de nombres qui permettent
d'arriver au nombre inscrit précédemment
         */
        int n, cpt;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre :");
        n = scanner.nextInt();

        int i;
        for (i = 1; i < 10; i++) {
//            System.out.printf("%d = %d +",n,i);
            System.out.print(n +" = " + i + "+ ");
        };
    }
}
