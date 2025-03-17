package br.senai.sp.jandira.calculadorapoligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculadorapoligonos.model.Retangulo;

public class RetanguloDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando um retângulo...");
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a medida da altura do retângulo: ");
		System.out.println("Digite a medida da largura do retângulo: ");
		
		retangulo.setAltura(leitor.nextDouble());
		retangulo.setLargura(leitor.nextDouble());
		retangulo.exibirDados();
		
	}

}
