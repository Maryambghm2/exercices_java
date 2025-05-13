package org.example;

import java.util.Scanner;

public class Exercice75 {
    public static void main(String[] args) {
        /*
        1. Créer une variable caractere
2. Affecter une valeur à la variable caractere
3. Afficher un message en fonction du type du caractère (lettre,
nombre, ou caractère spécial)

         */
        char c;
        String regexAplha = "[a-zA-Z]";
        String regexNum = "[0-9]";
        String regexSpeciaux = ".*[^a-zA-Z0-9 ].*";
        System.out.println("Saisir un caractère :");
        Scanner scanner = new Scanner(System.in);
        c = scanner.next().charAt(0);
        String cString = String.valueOf(c);
        if (cString.matches(regexNum)) {
            System.out.println(c + " est un chiffre.");
        } else if (cString.matches(regexAplha)) {
            System.out.println(c + " est une lettre de l'alphabet.");
        } else if (cString.matches(regexSpeciaux)) {
            System.out.println(c + " est un caractère spéciaux.");
        } else {
            System.out.println("Type non compris dans la méthode.");
        }

    }

}
