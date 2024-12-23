/* Exercício 09 - Faça  um  Programa  que  peça  a  temperatura  em  graus  Farenheit, 
 * transforme e mostre a temperatura em graus Celsius.
 * o  C = (5 * (F-32) / 9).  */

package com.loiane.cursojava.exercicios11_a_13;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Farenheit: ");
		double tempFarenheit = scan.nextDouble();
		
		double tempCelsius = (5 * (tempFarenheit - 32) / 9);
		
		System.out.println("A temperatura " + tempFarenheit + " Farenheit convertida em Celsius é " + tempCelsius);

	}

}
