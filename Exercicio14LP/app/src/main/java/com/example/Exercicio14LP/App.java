/*
 * This source file was generated by the Gradle 'init' task
 */
/*
14. Escreva um algoritmo que leia dois valores inteiro distintos e informe 
qual é o maior;
*/
package com.example.Exercicio14LP;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.println("Informe dois numeros inteiros distintos:");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        
        if (numero1 > numero2) {
            System.out.println("Numero: " + numero1 + " é o maior.");
        } else {
            System.out.println("Numero: " + numero2 + " é o maior.");
        }
        
    }
}
