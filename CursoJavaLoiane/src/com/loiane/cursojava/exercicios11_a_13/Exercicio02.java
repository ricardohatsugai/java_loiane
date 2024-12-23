/* Exercício 02 - Faça  um  Programa  que  peça  um  número  e  então  mostre  a 
mensagem O número informado foi [número]. */

package com.loiane.cursojava.exercicios11_a_13;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		System.out.println("Digite um número inteiro: ");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		System.out.println("O número digitado é " + numero);

	}

}
