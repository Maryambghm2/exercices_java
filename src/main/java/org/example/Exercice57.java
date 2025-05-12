package org.example;

import java.util.Scanner;

public class Exercice57 {
    public static void main(String[] args) {
        /*
        1. Saisir la longueur du côté du carré et la stocker dans une variable
2. Calculer l'aire et le périmètre du carré
         */
        int l;
        double p, a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir la longueur d'un coté du carré: ");
        l = scanner.nextInt();
        p = l * 4;
        System.out.println("Le périmètre du carré est de : " + p + " cm");
        a = Math.pow(l, 2);
        System.out.println("L'aire du carré est de : " + a + " cm");

    }
}
