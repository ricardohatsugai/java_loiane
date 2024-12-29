/* Exercício 02 - Faça  um  Programa  que  peça  um  valor  e  mostre  na  tela  se  o  
 * valor  é positivo ou negativo. */

package com.loiane.cursojava.exerciciosAula14_a_15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro positivo ou negativo: ");
		int valor = input.nextInt();
		
		if(valor >= 0) {
			System.out.printf("O valor %d informado é positivo.\n",valor);
		}else if(valor < 0) {
			System.out.printf("O valor %d informado é negativo.\n",valor);
		}

	}

}
