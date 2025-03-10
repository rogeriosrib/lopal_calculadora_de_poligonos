package br.senai.sp.jandira.calculadorapoligonos.model;

public class Retangulo {

	private double altura;
	private double largura;
	
	public void setLargura(double largura) {
		this.largura = largura;
	
	}		
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		double area = largura * altura;
		return area;
		
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * largura + 2 * altura;
		return perimetro;
	}
	
	public void exibirDados() {
		System.out.println("-----------------");
		System.out.println("Dados do retângulo");
		System.out.println("-----------------");
		System.out.println("Tamanho da altura: " + altura);
		System.out.println("Tamanho da largura: " + largura);
		System.out.println("Área total: " + calcularArea());
		System.out.println("Perímetro: " + calcularPerimetro());
		System.out.println("-----------------");
	}
	
}
