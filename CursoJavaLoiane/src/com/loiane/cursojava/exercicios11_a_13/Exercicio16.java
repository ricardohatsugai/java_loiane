/* Exercício 16 - Faça um programa para uma loja de tintas. O programa deverá pedir o 
 * tamanho em metros quadrados da área a ser pintada. Considere que a cobertura  da  
 * tinta  é  de  1  litro  para  cada  3  metros  quadrados  e  que  a tinta é vendida 
 * em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas 
 * de tinta a serem compradas e o preço total.  */

package com.loiane.cursojava.exercicios11_a_13;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos metros de largura tem o cômodo? ");
		double largura = input.nextDouble();
		
		System.out.println("Quantos metros de comprimento tem o cômodo?");
		double comprimento = input.nextDouble();
		
		double area = largura * comprimento;
		double litrosNescessarios = area / 3; // 1 litro de tinta para cada 3 mt² 
		
		if((litrosNescessarios / 18) % 18 != 0) {
			litrosNescessarios = ++litrosNescessarios;
		}
		
		double quant_Latas = litrosNescessarios / 18; // Cada caixa de tinta tem 18 litros.
		double totalPagar = 80.00 * litrosNescessarios;
		
		System.out.println("Seu cômodo tem "+area+" mt² de área. A cobertura de cada lata de tinta "+
				" de 18 litro é de "+litrosNescessarios+" latas.");
		System.out.println("O valor total de tintas será R$ "+totalPagar+" Reais.");
		

	}

}
