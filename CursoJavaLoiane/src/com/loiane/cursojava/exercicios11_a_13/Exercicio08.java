/* Faça  um  Programa  que  pergunte  quanto  você  ganha  por  hora  e  o 
número de horas trabalhadas no mês. Calcule e mostre o total do seu 
salário no referido mês. */

package com.loiane.cursojava.exercicios11_a_13;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe quanto que você ganha por hora trabalhada: ");
		double hora = scan.nextDouble();
		
		System.out.println("Informe quantos horas você trabalhou no mês: ");
		int horas_trabalhado = scan.nextInt();
		
		double total_salario = (hora * horas_trabalhado);
		
		System.out.println("Seu salário total do mês é " + total_salario);
	}

}
