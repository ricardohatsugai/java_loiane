/* Exercício 03 - Faça  um  Programa  que  verifique  se  uma  letra  digitada  
 * é  "F"  ou  "M". Conforme a letra escrever: F - Feminino, M - Masculino, 
 * Sexo Inválido.  */

package com.loiane.cursojava.exerciciosAula14_a_15;

import java.util.Scanner;

public class Exerecicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite 'm' para masculino e 'f' para femenino: ");
		String sexo = input.next();
		
		switch (sexo) {
		case "f": System.out.println("F - Femenino."); break;
		case "m": System.out.println("M - Masculino."); break;
		default: System.out.println("Sexo inválido.\n"); break;
		}

	}

}
