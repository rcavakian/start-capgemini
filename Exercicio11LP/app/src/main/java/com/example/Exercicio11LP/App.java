/*
 * This source file was generated by the Gradle 'init' task
 */

/*
Faça um algoritmo que receba o preço de custo de um produto e mostre o valor 
de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um 
percentual informado pelo usuário;
*/
package com.example.Exercicio11LP;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double precoCusto, acrescimo, valorVenda;
        
        System.out.print("Informe o preço de custo do item: ");
        precoCusto = sc.nextDouble();
        System.out.print("Informe o percentual de acrescimo: ");
        acrescimo = sc.nextDouble();
        
        valorVenda = precoCusto * (acrescimo / 100) + precoCusto;
        
        System.out.print("Valor final venda: R$ " + String.format("%.2f", valorVenda));

    }
}
