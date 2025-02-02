/*
 * This source file was generated by the Gradle 'init' task
 */
/*
23. Faça um algoritmo que receba um número e mostre uma mensagem caso este 
número sege maior que 80, menor que 25 ou igual a 40;
*/
package com.example.Exercicio23LP;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int numero;
               
        System.out.print("Informe um número inteiro: ");
        numero = sc.nextInt();
        
        if (numero == 40) {
            System.out.println("Número = 40");
        } else if (numero > 80) {
            System.out.println("Número maior que 80");
        } else if (numero < 25) {
            System.out.println("Número menor que 25");
        } else {
            System.out.println("Número não atende a nenhuma das 3 condições: "
                    + "\n1 - Igual a 40 "
                    + "\n2 - Maior que 80 "
                    + "\n3 - Menor que 25");
        }
    }
}
