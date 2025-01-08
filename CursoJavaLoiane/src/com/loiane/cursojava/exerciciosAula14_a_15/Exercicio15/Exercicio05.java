package com.loiane.cursojava.exerciciosAula14_a_15.Exercicio15;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota N1: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota N2: "));
		
		Calculo calculo1 = new Calculo(5.8, 7.3);
		
		String message = String.format("A média das notas n1 = %.2f e n2 = %.2f é %.2f\n", 
				calculo1.getN1(), calculo1.getN2(), calculo1.getMedia());
		JOptionPane.showMessageDialog(null, message);
		
	}

}
