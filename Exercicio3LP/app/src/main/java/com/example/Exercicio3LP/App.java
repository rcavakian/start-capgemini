/*
 * This source file was generated by the Gradle 'init' task
 */

/*
Escreva um algoritmo para determinar o consumo médio de um automóvel sendo 
fornecida a distância total percorrida pelo automóvel e o total de combustível 
gasto;
*/
package com.example.Exercicio3LP;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double distanciaPercorrida, combustivelGasto, consumoMedio;
             
        System.out.print("Informe a distancia percorrida em km: ");
        distanciaPercorrida = sc.nextDouble();
        System.out.print("Informe o total de combustivel gasto em litros: ");
        combustivelGasto = sc.nextDouble();
        
        consumoMedio = combustivelGasto / distanciaPercorrida;
        
        System.out.println("\nConsumo médio por cada km rodado é: " + consumoMedio);
        
        consumoMedio = distanciaPercorrida / combustivelGasto;
        
        System.out.println("\nQuantidade média de kms rodados por litro de combustivel: " + consumoMedio);

    }
}
