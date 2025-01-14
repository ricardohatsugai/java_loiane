/* Projeto....: Exercício 17;
 * Autor......: Ricardo Hatsugai;
 * Data.......: 26/12/2024;
 * Versão.....: 1.7;
 * Descrição..: - Faça um Programa para uma loja de tintas. O programa deverá pedir o 
 * tamanho em metros quadrados da área a ser pintada. Considere que a cobertura  da  tinta  
 * é  de  1  litro  para  cada  6  metros  quadrados  e  que  a tinta  é  vendida  em  latas  
 * de  18  litros,  que  custam  R$  80,00  ou  em galões de 3,6 litros, que custam R$ 25,00. 
 * Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços 
 * em 3 situações:
 *  		- comprar apenas latas de 18 litros;
 *  		- o  comprar apenas galões de 3,6 litros;
 *  		- misturar  latas  e  galões,  de  forma  que  o  preço  seja  o menor. Acrescente  
 *  		  10% de  folga  e  sempre  arredonde  os valores para cima, isto é, considere 
 *  		  latas cheias.  */

package com.loiane.cursojava.exercicios11_a_13;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a largura do ambiente: ");
		double largura = input.nextDouble();
		System.out.println("Informe o comprimento: ");
		double comprimento = input.nextDouble();
		
		double area = largura * comprimento;
		double areaComFolga = area * 1.1; // Área com folga de 10% a mais.
		double litrosNecessarios = Math.ceil(areaComFolga / 6);
		double precoLata = 80.0;
		double precoGalao = 25.0;
		int capacidadeLata = 18;
		int capacidadeGalao = 3;
		
		// Cálculo apenas com latas
		int latasNecessarias = (int) Math.ceil(litrosNecessarios / capacidadeLata);
		double custoLatas = latasNecessarias * precoLata;
		
		// Cálculo apenas com galões
		int galosNecessarios = (int) Math.ceil(litrosNecessarios / capacidadeGalao);
		double custoGaloes = galosNecessarios * precoGalao;
		
		// Cálculo com mistura de latas e galões
		int latasParaMistura = (int) (litrosNecessarios / capacidadeLata);
		double restanteMistura = litrosNecessarios % capacidadeLata;
		int galoesParaMistura = (int) Math.ceil(restanteMistura / capacidadeGalao);
		double custoMistura = (latasParaMistura * precoLata) + (galoesParaMistura * precoGalao);
		
		// Resultados
		System.out.println("\nResultados:");
		System.out.printf("1 - Apenas latas de 18 litros: %d lata(s), custo total: R$ %.2f\n",
				latasNecessarias,custoLatas);
		System.out.printf("2 - Apenas galões de 3,6 litros: %d galão(ões), custo total: "+ 
				"R$ %.2f\n", galosNecessarios, custoGaloes);
		System.out.printf("3 - Mistura de latas e galões: %d lata(s) e %d galão(ões), custo total: " +
				"R$ %.2f\n", latasParaMistura, galoesParaMistura, custoMistura);

	}

}
