package br.senai.sp.jandira.calculadorapoligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculadorapoligonos.model.Circunferencia;

public class CircunferenciaDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando uma circunferência...");
		
		Circunferencia circunferencia = new Circunferencia();
		
		System.out.print("Digite a medida o raio da circunferência: ");

		
		circunferencia.setRaio(leitor.nextDouble());
		circunferencia.exibirDados();
		
	}

}