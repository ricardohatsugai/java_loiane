package com.loiane.cursojava.exerciciosAula14_a_15.Exercicio15;

public class Calculo {
	private double n1;
	private double n2;
	private double media;
	
	// Construtor de Calculo
	public Calculo(double n1, double n2) {
		setN1(n1);
		setN2(n2);
		setMedia((n1+n2)/2);
	}
	
	
	public double getN1() { // método getN1
		return n1;
	}
	
	public void setN1(double n1) { // método setN1
		this.n1 = n1;
	}
	
	public double getN2() { // método getN2
		return n2;
	}
	
	public void setN2(double n2) { // método setN2
		this.n2 = n2;
	}
	
	public double getMedia() { // método getMedia
		return media;
	}
	
	public void setMedia(double media) { // método setMedia
		this.media = media;
	}

}
