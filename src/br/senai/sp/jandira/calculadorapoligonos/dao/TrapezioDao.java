package br.senai.sp.jandira.calculadorapoligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculadorapoligonos.model.Trapezio;

public class TrapezioDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando um trapézio...");
		
		Trapezio trapezio = new Trapezio();
		
		System.out.println("Digite a medida da altura do trapézio: ");
		System.out.println("Digite a medida da base menor do trapézio: ");
		System.out.println("Digite a medida da base maior do trapézio: ");
		
		trapezio.setAltura(leitor.nextDouble());
		trapezio.setBase1(leitor.nextDouble());
		trapezio.setBase2(leitor.nextDouble());
		trapezio.exibirDados();
		
	}

}