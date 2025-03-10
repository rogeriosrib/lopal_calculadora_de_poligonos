package br.senai.sp.jandira.calculadorapoligonos.model;

public class Trapezio {

	private double base1;
	private double base2;
	private double altura;
	
	public void setBase1(double base1) {
		this.base1 = base1;
	
	}		
	public void setBase2(double base2) {
		this.base2 = base2;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		double area = base1+base2 * altura/2;
		return area;
		
	}
	

	public void exibirDados() {
		System.out.println("-----------------");
		System.out.println("Dados do Trapézio");
		System.out.println("-----------------");
		System.out.println("Tamanho da base maior: " + base1);
		System.out.println("Tamanho da base menor: " + base2);
		System.out.println("Área total: " + calcularArea());
		System.out.println("-----------------");
		System.out.println("-----------------");
	}
	
}

