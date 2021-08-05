package ExerciciosAula17;

import java.util.Scanner;

/*Faça um programa que calcule o número médio de alunos por turma.
Para isto, peça a quantidade de turmas e a quantidade de alunos para
cada turma. As turmas não podem ter mais de 40 alunos.*/

public class Ex27 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o Quantidade de turmas:");
		int qtdTurmas = scan.nextInt();

		int alunos = 0;
		int totalAlunos = 0;

		for (int i = 1; i <= qtdTurmas; i++) {

			boolean alunosValido = false;

			while (alunosValido == false) {

				System.out.println("Turma número " + i);
				alunos = scan.nextInt();

				if (alunos <= 40) {
					totalAlunos = alunos + totalAlunos;
					alunosValido = true;
				} else {
					System.out.println("Números de alunos inválido");
				}
			}

		}
		double mediaAlunos = totalAlunos / qtdTurmas;
		System.out.println("A Méida por turma é: " +  mediaAlunos + " Alunos");

	}

}
