package com.loiane.cursojava.exerciciosAula14_a_15.Exercicio06;

import javax.swing.JOptionPane;

public class Classe {
	
	private double n1;
	private double n2;
	private double n3;
	
	// método construtor para fazer a comparação do número maior
	public Classe(double n1, double n2, double n3) {
		String message;
		setN1(n1);
		setN2(n2);
		setN3(n3);
		
		
		if (getN1() > getN2() && getN2() > getN3()) {
			message = String.format("%.2f > %.2f > %.2f", getN1(), getN2(), 
					getN3());
			JOptionPane.showMessageDialog(null, message);			
		}
		
		if (getN2() > getN1() && getN1() > getN3()) {
			message = String.format("%.2f > %.2f > %.2f", getN2(), getN1(), 
					getN3());
			JOptionPane.showMessageDialog(null, message);			
		}
		
		if (getN3() > getN2() && getN2() > getN1()) {
			message = String.format("%.2f > %.2f > %.2f", getN3(), getN2(), 
					getN1());
			JOptionPane.showMessageDialog(null, message);			
		}
		
		if (getN1() > getN2() && getN2() > getN3()) {
			message = String.format("%.2f > %.2f > %.2f", getN1(), getN2(), 
					getN3());
			JOptionPane.showMessageDialog(null, message);			
		}
		
		
	}
	
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}

}
