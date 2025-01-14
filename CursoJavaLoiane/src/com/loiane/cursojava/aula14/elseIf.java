package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class elseIf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o preço do item: ");
		double valor = input.nextDouble();
		
		if(valor <= 10) {
			System.out.println("Está barato, pode comprar.\n");
		}else if(valor > 10 && valor < 15) {
			System.out.println("Você pode pedir um desconto.\n");
		}else if(valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais.\n");
		}else {
			System.out.println("Muito caro.\n");
		}
		
	}

}
