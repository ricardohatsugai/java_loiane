package com.loiane.cursojava.exerciciosAula14_a_15.Exercicio07;

import javax.swing.JOptionPane;

public class Classe {
	private double n1;
	private double n2;
	private double n3;
	private String message;
	
	// Método construtor
	public Classe(double n1, double n2, double n3) {
		setN1(n1); setN2(n2); setN3(n3);
		
		// Se N1 > N2
		if (getN1() > getN2()) {
			
			if (getN2() > getN3()) { // Se N1 > N2 > N3
				
				setMessage((String.format("N1 = %.2f é maior que N2 = %.2f"+
				" que é maior que N3 = %.2f.\n", getN1(), getN2(), getN3())));
				
				JOptionPane.showMessageDialog(null, getMessage());
				
			// fim Se N1 > N2 > N3	
			} else if (getN3() > getN2()) { // se N3 > N2 
				
				setMessage((message = String.format("N1 = %.2f é maior que N3 = %.2f,"+
				" que é maior que N2 = %.2f.\n", getN1(), getN3(), getN2())));
				
				JOptionPane.showMessageDialog(null, getMessage());
				
			} // fim se N3 > N2
			
		} // fim Se N1 > N2
		
		// Se N2 > N1
		if (getN2() > getN1()) {
			
			if (getN1() > getN3()) { // Se N1 > N3
				
				setMessage((String.format("N2 = %.3f é maior que N1 = %.2f,"+
				" que é maior que N3 = %.2f.\n", getN2(), getN1(), getN3())));
				
				JOptionPane.showMessageDialog(null, getMessage());
				
			} // Fim Se N1 > N3
			
			if (getN3() > getN1()) { // Se N3 > N1
				
				setMessage((String.format("N2 é maior que N3 = %.2f, que é"+
				" maior que N1 = %.2f.\n", getN2(), getN3(), getN1())));
				
				JOptionPane.showMessageDialog(null, getMessage());
				
			} // Fim Se N3 > N1
			
		} // Fim Se N2 > N1
		
		// Se N3 > N1
		if (getN3() > getN1()) {
			
			if (getN1() > getN2()) { // Se N1 > N2
				
				setMessage((String.format("N3 = %.3f é maior que N1 = %.2f,"+
				" que é maior que N2 = %.2f.\n", getN3(), getN1(), getN2())));
				
				JOptionPane.showMessageDialog(null, getMessage());
	
			} // Fim Se N1 > N2
			
			if (getN2() > getN1()) { // Se N2 > N1
	
				setMessage((String.format("N3 é maior que N2 = %.2f, que é"+
				" maior que N1 = %.2f.\n", getN3(), getN2(), getN1())));
				
				JOptionPane.showMessageDialog(null, getMessage());
				
			} // Fim Se N2 > N1
			
		} // Fim Se N3 > N1
		
		
	} // fim do método construtor
	
	
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
