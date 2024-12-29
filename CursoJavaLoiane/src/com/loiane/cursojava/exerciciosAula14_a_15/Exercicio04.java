/* Exercício 04 - Faça  um  Programa  que  verifique  se  uma  
 * letra  digitada  é  vogal  ou consoante.  */

package com.loiane.cursojava.exerciciosAula14_a_15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma letra minúscula: ");
		String letra = input.next();
		
		switch (letra) {
		case "a": System.out.println("A letra digitada é Vogal.\n"); break;
		case "e": System.out.println("A letra digitada é Vogal.\n"); break;
		case "i": System.out.println("A letra digitada é Vogal.\n"); break;
		case "o": System.out.println("A letra digitada é Vogal.\n"); break;
		case "u": System.out.println("A letra digitada é Vogal.\n"); break;
		default: System.out.println("A letra digitada é Consoante."); break;
		}

	}

}
