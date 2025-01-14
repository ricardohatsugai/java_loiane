package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com sua idade: ");
		int idade = input.nextInt();
		
		if(idade >= 18) {
			System.out.printf("A idade de %d, é maior de idade.", idade);
		}else {
			System.out.printf("A idade de %d, é menor de idade.", idade);
		}

	}

}
