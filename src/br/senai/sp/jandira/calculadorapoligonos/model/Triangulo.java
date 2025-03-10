package br.senai.sp.jandira.calculadorapoligonos.model;

public class Triangulo {

	private double base;
	private double altura;
	
	public void setBase(double base) {
		this.base = base;
	
	}		
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		double area = base * altura/2;
		return area;
		
	}
	

	public void exibirDados() {
		System.out.println("-----------------");
		System.out.println("Dados do Triângulo");
		System.out.println("-----------------");
		System.out.println("Tamanho da altura: " + altura);
		System.out.println("Tamanho da base: " + base);
		System.out.println("Área total: " + calcularArea());
		System.out.println("-----------------");
		System.out.println("-----------------");
	}
	
}

