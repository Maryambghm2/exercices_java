package org.example;

import java.util.Scanner;

public class Exercice52 {
    public static void main(String[] args) {
        /*
    1. Écrire un programme qui permet de permuter les valeurs entre
deux variables
     */

        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre une valeur a: ");
        a = scanner.nextInt();
        System.out.println("Entre une valeur b: ");
        b = scanner.nextInt();
        System.out.println("a est égal à " + a);
        System.out.println("b est égal à " + b);
        System.out.println("Permutage des valeurs: ");

        c = a;
        a = b;
        b = c;
        System.out.println("a est égal à " + a);
        System.out.println("b est égal à " + b);
    }


}
