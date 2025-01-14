package com.loiane.cursojava.exerciciosAula14_a_15.Exercicio06;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe no nº N1: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe no nº N2: "));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe no nº N3: "));
		
		Classe classe = new Classe(n1, n2, n3);

	}

}
