/* Faça  um  Programa  que  peça  o  raio  de  um  círculo,  calcule  e  mostre 
sua área.  */

package com.loiane.cursojava.exercicios11_a_13;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double pi = 3.14159;
		
		System.out.println("Informe o raio de um círculo: ");
		double raio = scan.nextDouble();
		
		double area = pi*(Math.pow(raio, 2));
		
		System.out.printf("A área do círculo infrmado é %.4f.\n", area);

	}

}
