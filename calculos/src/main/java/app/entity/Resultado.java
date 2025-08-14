package app.entity;

public class Resultado {

	private int soma;
	private double media;
	private int maiorNumero;
	private int menorNumero;
	private int totalNumeros;

	public void setSoma(int soma) {
		this.soma = soma;
	}

	public int getSoma() {
		return this.soma;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double getMedia() {
		return this.media;
	}

	public void setMaiorNumero(int maior) {
		this.maiorNumero = maior;
	}

	public int getMaiorNumero() {
		return this.maiorNumero;
	}
	
	public void setMenorNumero(int menor) {
		this.menorNumero = menor;
	}
	
	public int getMenorNumero() {
		return this.menorNumero;
	}


	public void setTotalNumeros(int total) {
		this.totalNumeros = total;
	}
	
	public int getTotalNumeros() {
		return totalNumeros;
	}
	
	
}
