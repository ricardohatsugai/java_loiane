/* Faça um Programa que peça as 4 notas bimestrais e mostre a média.  */

package com.loiane.cursojava.exercicios11_a_13;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota N1: ");
		double n1 = scan.nextDouble();
		
		System.out.println("Digite a nota N2: ");
		double n2 = scan.nextDouble();
		
		System.out.println("Digite a nota N3: ");
		double n3 = scan.nextDouble();
		
		System.out.println("Digite a nota N4: ");
		double n4 = scan.nextDouble();
		
		double media = (n1+n2+n3+n4)/4;
		System.out.println("A média das notas é " + media);

	}

}
