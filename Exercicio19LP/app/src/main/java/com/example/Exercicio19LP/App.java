/*
 * This source file was generated by the Gradle 'init' task
 */
/*
19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o 
nome e se ela é homem ou mulher. No final informe total de homens e de mulheres;
*/
package com.example.Exercicio19LP;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int mulheres = 0;
        int homens = 0;
        int outros = 0;
        char genero;
        String nome;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o nome da pessoa: ");
            nome = sc.nextLine();
            System.out.print("Informe o genero da pessoa (M/F):");
            genero = sc.next().charAt(0);
            
            switch (genero) {
                case 'M':
                case 'm':
                    homens++;
                    break;
                case 'F':
                case 'f':
                    mulheres++;
                    break;
                default:
                    outros++;
                    break;
            }
            sc.nextLine();

        }
        
        System.out.println(
                "\nTotal mulheres: " + mulheres +
                "\nTotal homens: " + homens + 
                "\nOutros: " + outros
        );
    }
}