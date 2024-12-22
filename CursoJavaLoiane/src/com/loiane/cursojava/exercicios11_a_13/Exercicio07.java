/* Faça  um  Programa  que  calcule  a  área  de  um  quadrado,  em  seguida 
mostre o dobro desta área para o usuário. */

package com.loiane.cursojava.exercicios11_a_13;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tabamnho de um lado do quadrado em cm: ");
		double l = scan.nextDouble();
		
		double area = (l*l);
		
		System.out.println("A área do quadrado é " + area + "cm².");

	}

}
