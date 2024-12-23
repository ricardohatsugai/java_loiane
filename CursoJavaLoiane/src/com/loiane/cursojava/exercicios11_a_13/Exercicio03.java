/* Exercício 03 - Faça um Programa que peça dois números e imprima a soma. */

package com.loiane.cursojava.exercicios11_a_13;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número 1: ");
		double n1 = scan.nextDouble();
		System.out.println("Digite o número 2: ");
		double n2 = scan.nextDouble();
		System.out.println("A soma dos dois números é " + (n1+n2));

	}

}
