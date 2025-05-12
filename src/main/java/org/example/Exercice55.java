package org.example;

import java.util.Scanner;

public class Exercice55 {
    public static void main(String[] args) {
        double rayon, hauteur;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un rayon : ");
        rayon = scanner.nextDouble();
        System.out.println("Saisir une hauteur : ");
        hauteur = scanner.nextDouble();

        double formule = (Math.PI * (Math.pow(rayon, 2))* hauteur) /3;
        System.out.printf("Le volume du cône est de %.2f cm3",formule);
    }
}
