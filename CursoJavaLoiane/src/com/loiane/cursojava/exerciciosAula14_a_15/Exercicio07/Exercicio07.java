package com.loiane.cursojava.exerciciosAula14_a_15.Exercicio07;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble((JOptionPane.showInputDialog("Informe o nº N1: ")));
		double n2 = Double.parseDouble((JOptionPane.showInputDialog("Informe o nº N2: ")));
		double n3 = Double.parseDouble((JOptionPane.showInputDialog("Informe o nº N3: ")));
		
		Classe classe = new Classe(n1, n2, n3);
		
		

	}

}
