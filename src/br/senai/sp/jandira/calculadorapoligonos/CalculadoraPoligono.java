package br.senai.sp.jandira.calculadorapoligonos;

import br.senai.sp.jandira.calculadorapoligonos.model.Circunferencia;
import br.senai.sp.jandira.calculadorapoligonos.model.Quadrado;
import br.senai.sp.jandira.calculadorapoligonos.model.Retangulo;
import br.senai.sp.jandira.calculadorapoligonos.model.Trapezio;
import br.senai.sp.jandira.calculadorapoligonos.model.Triangulo;

public class CalculadoraPoligono {

	public static void main(String[] args) {
		
		Quadrado quadrado1 = new Quadrado();
		quadrado1.setLado(2);
		quadrado1.exibirDados();
		
		Retangulo retangulo1 = new Retangulo();
		retangulo1.setAltura(5);
		retangulo1.setLargura(10);
		retangulo1.exibirDados();
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAltura(20);
		triangulo1.setBase(12);
		triangulo1.exibirDados();
		
		Trapezio trapezio = new Trapezio();
		trapezio.setBase1(2);
		trapezio.setBase2(6);
		trapezio.setAltura(10);
		trapezio.exibirDados();
	
		Circunferencia circunferencia = new Circunferencia();
		circunferencia.setRaio(9);
		circunferencia.exibirDados();
	}
}
