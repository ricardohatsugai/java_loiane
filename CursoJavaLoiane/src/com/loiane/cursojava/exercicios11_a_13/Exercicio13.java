/* Exercício 13 - Tendo  como  dados  de  entrada  a  altura  e  o  sexo  de  uma  pessoa, 
 * construa  um  algoritmo  que  calcule  seu  peso  ideal,  utilizando  as 
 * seguintes fórmulas: 
 *  .  Para homens: (72.7*h) - 58 
 *  a.  Para mulheres: (62.1*h) - 44.7 (h = altura) 
 *  b.  Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso. 
 *  - Acima de 40,0 = Obesidade grau III
 *  - Entre 35,0 e 39,9 = Obesidade grau II
 *  - Entre 30,0 e 34,9 = Obesidade grau I
 *  - Entre 25,0 e 29,9 = Sobrepeso
 *  - Entre 18,6 e 24,9 = Normal
 *  - 18,5 ou menos = Abaixo do normal*/

package com.loiane.cursojava.exercicios11_a_13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 1 - Masculino e 2 - Femenino: ");
		int sexo = scan.nextInt();
		
		System.out.println("informe seu peso atual: ");
		double peso = scan.nextDouble();
		
		System.out.println("Informe sua altura: ");
		double altura = scan.nextDouble();
		
		if(sexo == 1 || sexo == 2) {
			double imc = peso / (altura * altura); // IMC Homem
			if(imc > 40.0) {
				System.out.println("Seu peso é " + peso + " kg, e seu IMC é " + imc + 
						", você está com Obesidade grau III.");
			};
			
			if(imc >= 30.0 && imc <= 39.9){
				System.out.println("Seu peso é " + peso + " kg, e seu IMC é " + imc + 
						", você está com Obesidade grau II.");
			}
			
			if(imc >= 25.0 && imc <= 29.9){
				System.out.println("Seu peso é " + peso + " kg, e seu IMC é " + imc + 
						", você está com Sobrepeso I.");
			}
			
			if(imc >= 18.6 && imc <= 24.9){
				System.out.println("Seu peso é " + peso + " kg, e seu IMC é " + imc + 
						", você está com Normal.");
			}
			
			if(imc < 18.5) {
				System.out.println("Seu peso é " + peso + " kg, e seu IMC é " + imc + 
						", você está Abaixo do Normal.");
			}
		} 
		
		
	}

}
