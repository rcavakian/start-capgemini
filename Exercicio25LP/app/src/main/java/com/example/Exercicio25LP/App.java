/*
 * This source file was generated by the Gradle 'init' task
 */
 /*
25. Faça um algoritmo que leia dois números e identifique se são iguais ou 
diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que eles são 
iguais. Caso sejam diferentes, informe qual número é o maior, e uma mensagem 
que são diferentes;
 */
package com.example.Exercicio25LP;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Informe dois números inteiros: ");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os dois números são IGUAIS");
        } else if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é o MAIOR");
            System.out.println("Os números informdos são diferentes");

        } else {
            System.out.println("O número " + numero2 + " é o MAIOR");
            System.out.println("Os números informdos são diferentes");
        }

    }
}