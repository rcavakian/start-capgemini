/*
 * This source file was generated by the Gradle 'init' task
 */

/*
Faça um algoritmo que receba um valor que foi depositado e exiba o valor com 
rendimento após um mês. Considere fixo o juro da poupança em 0,07% a.m.;
*/
package com.example.Exercicio9LP;

import java.util.Locale;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double valorDepositado, valorAposRendimento;
       
        System.out.print("Informr o valor depositado na poupança: ");
        valorDepositado = sc.nextDouble();
        
        valorAposRendimento = valorDepositado * (0.07 / 100) + valorDepositado;
        
        System.out.println("Valor com rendimento apois um mês: " +
                String.format("%.2f", valorAposRendimento));
    }
}
