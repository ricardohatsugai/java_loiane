/* Projeto..: Exercício 18
 * Autor....: Ricardo Hatsugai
 * Data.....: 17/12/2024
 * Versão...: 1.0
 * Descrição: Faça um programa que peça o tamanho de um arquivo para download (em  MB)  
 * e  a  velocidade  de  um  link  de  Internet  (em  Mbps),  calcule  e informe o tempo 
 * aproximado de download do arquivo usando este link (em minutos).  */

package com.loiane.cursojava.exercicios11_a_13;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo a ser baixado em MB: ");
		double mb = input.nextDouble();
		System.out.println("Informe a velocidade de download em Mbps: ");
		double veloc = input.nextDouble();
		
		// converte a velocidade do link de Mbps para MBps (1 Mbps = 0.125 MBps)
		double velocidadeLinkMbps = veloc * 0.125;
		
		// calcula o tempo de download em segundos
		double tempoSegundos = mb / velocidadeLinkMbps;
		
		// converte o tempo de download de segundos para minutos
		double tempoMinutos = tempoSegundos / 60;
		
		// Exibe o tempo aproximado de download
		System.out.printf("O tempo aproximado de download é %.2f minutos.%n", tempoMinutos);
		
		input.close();

	}

}
