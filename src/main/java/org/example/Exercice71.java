package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Exercice71 {
    /*
    1. Créer une variable caractere
2. Affecter une valeur à la variable caractere
3. A l'aide des structures conditionnelles, déterminer si le caractère
est une consonne ou une voyelle
     */

    public static void main(String[] args) {
        char c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un caractère :");
        c = scanner.next().charAt(0);
        System.out.println("Vous avez saisi :" + c);
        if (c == 'a' || c == 'e' || c== 'i' || c == 'o' || c == 'u' || c == 'y') {
            System.out.println("Le caractère saisi est pair.");
        } else {
            System.out.println("Le caractère saisi est impair.");
        }
    }

}
