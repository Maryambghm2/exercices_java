package org.example;

import java.util.Scanner;

public class Exercice68 {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir votre âge :");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Vous êtes majeur, vous pouvez rentrer dans le club.");
        } else {
            System.out.println("Désolé vous ne pouvez pas entrer, vous êtes mineur.");
        }


    }
}
