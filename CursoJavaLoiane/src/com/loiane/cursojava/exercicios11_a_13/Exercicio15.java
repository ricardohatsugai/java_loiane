/* Exercício 15 - Faça  um  Programa  que  pergunte  quanto  você  ganha  por  hora  e  o 
 * número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, 
 * sabendo-se que são descontados 11% para o Imposto  de  Renda,  8%  para  o  INSS  e  5%  
 * para  o  sindicato,  faça  um programa que nos dê:
 * -	salário bruto.
 * a.	quanto pagou ao INSS.
 * b.	quanto pagou ao sindicato.
 * c.	o salário líquido.
 * d.	calcule  os  descontos  e  o  salário  líquido,  conforme  a  tabela abaixo:
 * + 	Salário  Bruto  :  R$  -  IR  (11%)  :  R$  -  INSS (8%)  :  
 * 		R$  -  Sindicato  (  5%)  :  R$  =  Salário Liquido : R$ 
 * Obs.: Salário Bruto - Descontos = Salário Líquido.  */

package com.loiane.cursojava.exercicios11_a_13;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double horaTrabalhada = 0.0;
		double numeroHoras = 0.0;
		double salarioBruto = 0.0;
		double salarioLiquido = 0.0;
		double inss = 0.0;
		double sindicato = 0.0;
		double impostoDeRenda = 0.0;
		
		
		System.out.println("Informe quanto você ganha por hora trabalhada: ");
		horaTrabalhada = input.nextDouble();
		
		System.out.println("Informe o número de horas trabalhadas no mês: ");
		numeroHoras = input.nextDouble();
		
		salarioBruto = horaTrabalhada * numeroHoras; 
		inss = (salarioBruto * 8)/100;
		impostoDeRenda = (salarioBruto * 11)/100;
		sindicato = (salarioBruto * 5)/100;
		salarioLiquido = salarioBruto - (inss + impostoDeRenda + sindicato);
		
		System.out.println("Seu salário Bruto é R$ "+salarioBruto);
		System.out.println("Você pagou ao INSS R$ "+inss);
		System.out.println("Você pagou ao Sindicato R$ "+sindicato);
		System.out.println("Seu salário líquido é R$ "+salarioLiquido);

	}

}
