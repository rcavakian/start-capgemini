/*
 * This source file was generated by the Gradle 'init' task
 */

/*
Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o 
total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este 
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome,
o salário fixo e salário no final do mês;
*/
package com.example.Exericio4LP;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String nome;
        double salarioFixo, totalVendas, salarioTotal;
        
        System.out.print("Digite o nome do(a) vendedor(a): ");
        nome = sc.nextLine();
        System.out.print("Digite o valor do salario fixo: ");
        salarioFixo = sc.nextDouble();
        System.out.print("Digite o valor total de vendas realizadas no mês: ");
        totalVendas = sc.nextDouble();
        
        salarioTotal = salarioFixo + (totalVendas * 0.15);
        
        System.out.println(
                "\nVendodor(a): " + nome + 
                "\nSalario fixo: R$ " + String.format("%.2f", salarioFixo) +
                "\nSalario total com comissão: R$ " + String.format("%.2f", salarioTotal));
        
    }
}