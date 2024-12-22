/* Faça um Programa que converta metros para centímetros.  */

package com.loiane.cursojava.exercicios11_a_13;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a metragem que deseja converter para centímetros: ");
		double metro = scan.nextDouble();
		double centimetro = metro * 100;
		
		System.out.println("Convertido em centímetro fica " + centimetro + " cm.");

	}

}
