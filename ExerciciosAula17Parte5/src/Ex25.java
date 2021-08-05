package ExerciciosAula17;

import java.util.Scanner;

/*Faça um programa que peça para n pessoas a sua idade, ao final o
programa devera verificar se a média de idade da turma varia entre 0 e
25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
ou idosa, conforme a média calculada.*/

public class Ex25 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Quantas pessoas há na turma?");
		int qtdPessoas = scan.nextInt();
		
		double totalIdade = 0;
		//double mediaIdade = 0;
		
		for (int i = 0; i < qtdPessoas; i++) {
			
			System.out.println("Digite a idade da pessoa:");
			int idade = scan.nextInt();
			totalIdade = idade + totalIdade;	
		}
		
		double mediaIdade = totalIdade / qtdPessoas;
		System.out.println("Média de idade é: " + mediaIdade);
		
		if (mediaIdade >= 0 && mediaIdade <=25 ) {
			System.out.println("Turma Jovem");
		}else if(mediaIdade > 25 && mediaIdade <= 60) {
			System.out.println("Turma Adulta");
		}else {
			System.out.println("Turma Idosa");
		}
		
		
	}

}
