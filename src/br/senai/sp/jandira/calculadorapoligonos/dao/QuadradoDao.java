package br.senai.sp.jandira.calculadorapoligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculadorapoligonos.model.Quadrado;

public class QuadradoDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando um quadrado...");
		
		Quadrado quadrado = new Quadrado();
		
		System.out.print("Digite a medida do lado do quadrado: ");
		
		quadrado.setLado(leitor.nextDouble());
		quadrado.exibirDados();
		
	}

}
