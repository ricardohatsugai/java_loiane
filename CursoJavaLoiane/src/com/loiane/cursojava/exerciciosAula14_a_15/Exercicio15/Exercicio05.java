/* Projeto..: Exercicio05.java;
 * Autor....: Ricardo Hatsugai
 * Data.....: 07/01/2025
 * Versão...: 1.2
 * Descrição: Uma classe entre as demais que poderão usar as regras de negócios 
 * instanciadas como objeto. */

package com.loiane.cursojava.exerciciosAula14_a_15.Exercicio15;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota N1: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota N2: "));
		String message;
		
		// Instancia classe com método construtor.
		Calculo calculo1 = new Calculo(n1, n2); 
		
		message = String.format("A média das notas n1 = %.2f e n2 = %.2f é %.2f\n", 
				calculo1.getN1(), calculo1.getN2(), calculo1.getMedia());
		JOptionPane.showMessageDialog(null, message);
		
		calculo1.aprovacao(); // Calcula se aprovado, Reprovado ou Aprovado com Distinção.
		
	}

}
