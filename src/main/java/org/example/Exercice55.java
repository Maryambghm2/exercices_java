package org.example;

import java.util.Scanner;

public class Exercice55 {
    /*
    1. Créer un programme qui permet de calculer le volume d'un cône
2. La formule est la suivante : 1/3 × π × r² × h
     */
    public static void main(String[] args) {
        double rayon, hauteur;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un rayon : ");
        rayon = scanner.nextDouble();
        System.out.println("Saisir une hauteur : ");
        hauteur = scanner.nextDouble();

        double formule = (Math.PI * (Math.pow(rayon, 2)) * hauteur) / 3;
        System.out.printf("Le volume du cône est de %.2f cm3", formule);
    }
}
