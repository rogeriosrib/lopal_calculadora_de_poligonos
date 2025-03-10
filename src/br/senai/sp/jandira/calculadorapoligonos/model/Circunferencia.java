package br.senai.sp.jandira.calculadorapoligonos.model;

public class Circunferencia {

	private double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	
	}
	public double calcularArea() {
		double area = Math.PI * Math.pow(raio,2) ;
		return area;
		
	}
	

	public void exibirDados() {
		System.out.println("-----------------");
		System.out.println("Dados da circunferência");
		System.out.println("-----------------");
		System.out.println("Tamanho do raio: " + raio);
		System.out.println("-----------------");
		System.out.println("Área total: " + calcularArea());
		System.out.println("-----------------");
		System.out.println("-----------------");
	}
	
}