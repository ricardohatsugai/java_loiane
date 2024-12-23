/* Exercício 10 -  Faça  um  Programa  que  peça  a  temperatura  em  graus  Celsius, 
 * transforme e mostre em graus Farenheit. */

package com.loiane.cursojava.exercicios11_a_13;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		double celsius = scan.nextDouble();
		
		double farenheit = (celsius * 1.8 + 32);
		
		System.out.println("A temperatura " + celsius + " Celsius em Fahrenheit é " + farenheit + ".");

	}

}
