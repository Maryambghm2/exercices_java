package org.example;

import java.util.Scanner;

public class Exercice54 {

    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un age :");
        age = scanner.nextInt();

boolean statut = (age >= 18 );
        System.out.println(statut);
    }
}
