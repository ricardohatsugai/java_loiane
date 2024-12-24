/* João  Papo-de-Pescador,  homem  de  bem,  comprou  um microcomputador  para  
 * controlar  o  rendimento  diário  de  seu  trabalho. Toda  vez  que  ele  
 * traz  um  peso  de  peixes  maior  que  o  estabelecido pelo  regulamento  
 * de  pesca  do  estado  de  São  Paulo  (50  quilos)  deve pagar  uma  multa
 * de  R$  4,00  por  quilo  excedente.  João  precisa  que você  faça  um  
 * programa  que  leia  a  variável  peso  (peso  de  peixes)  e verifique  
 * se  há  excesso.  Se  houver,  gravar  na  variável  excesso  e  na variável 
 * multa o valor da multa que João deverá pagar. Caso contrário mostrar tais 
 * variáveis com o conteúdo ZERO.  */

package com.loiane.cursojava.exercicios11_a_13;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double limite 	= 50;
		double multa 	= 4.00;
		
		System.out.println("Informe o peso total de peixes: ");
		double peso = input.nextDouble();
		
		if(peso > limite) {
			double pesoExcesso = peso - limite;
			double multaValor = multa * pesoExcesso;
			System.out.println("O peso de " + peso + " quilos que você pescou, gerou uma multa " +
					" no valor de R$ " + multaValor + ", pelo peso em excesso de " + pesoExcesso +
					" quilos.");
		}

	}

}
