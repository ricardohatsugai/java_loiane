/* Exercício 01 - Faça um Programa que peça dois números e imprima o maior deles. */

package com.loiane.cursojava.exerciciosAula14_a_15;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		int n1 = input.nextInt();
		System.out.println("Digite o segundo número inteiro: ");
		int n2 = input.nextInt();
		
		if(n1 > n2) {
			System.out.printf("O número %d é maior que %d.\n",n1,n2);
		}else if(n1 < n2) {
			System.out.printf("O número %d é maior que %d.\n",n2,n1);
		}else {
			System.out.println("Os valores são iguais.\n");
		}

	}

}
