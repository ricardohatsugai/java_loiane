
/* Exercício 11 - Faça  um  Programa  que  peça  2  números  inteiros  e  um  número  real. 
 * Calcule e mostre:
 * a.  o produto do dobro do primeiro com metade do segundo .
 * b.  a soma do triplo do primeiro com o terceiro.
 * c.  o terceiro elevado ao cubo. */

package com.loiane.cursojava.exercicios11_a_13;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do primeiro número inteiro: ");
		int n1_inteiro = scan.nextInt();
		
		System.out.println("Informe o valor do segundo número inteiro: ");
		int n2_inteiro = scan.nextInt();
		
		System.out.println("Informe o valor de um número real: ");
		double real = scan.nextDouble();
		
		System.out.println("O produto do dobro do primeiro número " + 
				n1_inteiro + " com a metado do segundo " + n2_inteiro + " é " + 
				((n1_inteiro * 2)*(n2_inteiro / 2)));
		
		System.out.println("A soma do triplo do primeiro número " + n1_inteiro + 
				" com o terceiro real " + real + " é " + ((n1_inteiro * 3)+ (real)));
		
		System.out.println("O terceiro " + real + " elevado ao cubo é " + Math.pow(real, 2));

	}

}
