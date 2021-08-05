package ExerciciosAula17;

import java.util.Scanner;

/*Faça um programa que calcule o mostre a média aritmética de N
notas*/

public class Ex24 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantas notas irá registrar:");
		int qtdNotas = scan.nextInt();
		
		double notasTotal = 0;
		
		for (int i = 0; i < qtdNotas; i++) {
			System.out.println("Digite a nota:");
			double notas = scan.nextDouble();
			notasTotal = notas + notasTotal;
		}
		double mediaNotas = notasTotal / qtdNotas;
		System.out.println("Total das notas: " + notasTotal);
		System.out.println("Média das notas: " + mediaNotas);
		
		
		
	}

}
