package org.example;

import java.util.Scanner;

public class Exercice70 {
/*
1. Créer 3 variables : nombre1, nombre2, nombre3
2. Affecter des valeurs aux variables
3. Créer des structures conditionnelles permettant d'afficher le
maximum parmis les 3 nombres créés précédemment
 */
    public static void main(String[] args) {
        int [] nb = new int[3];
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Saisir le nombre " +(i+1) + " :");
            nb[i] = scanner.nextInt();
            System.out.println("Vous avez saisi "+ nb[i]);
            while (nb[i] > max) {
                max = nb[i];
            }
        }
        System.out.println("Le plus grand nombre est " +max);

    }
}
