package org.example;

import java.util.Scanner;

public class Exercice53 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir a :");
        a = scanner.nextInt();
        System.out.println("Saisir a :");
        b = scanner.nextInt();
        System.out.println("a est égale à : "+ a);
        System.out.println("b est égale à : "+ b);
        double puissA = Math.pow(a, 2);
        double puissB = Math.pow(b, 2);
        System.out.println("La somme des carrées de a et b est : " + (puissA+puissB));
    }
}
