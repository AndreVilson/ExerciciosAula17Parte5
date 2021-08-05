package ExerciciosAula17;

import java.util.Scanner;

/*Numa eleição existem três candidatos. Faça um programa que peça o
número total de eleitores. Peça para cada eleitor votar e ao final
mostrar o número de votos de cada candidato.*/

public class Ex26 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Digite o número de eleitores:");
		int eleitores = scan.nextInt();
		System.out.println("Vote 1: Dener");
		System.out.println("Vote 2: Lauren");
		System.out.println("Vote 3: Ruti");
		int voto1 =0;
		int voto2 =0;
		int voto3 =0;
		
		for (int i = 0; i < eleitores; i++) {
			
			System.out.println("Voto:");
			int voto = scan.nextInt();
			if(voto == 1) {
				
				 voto1 = voto + voto1;
				 
			}else if (voto == 2){
				voto = 1;
				voto2 = voto + voto2;
				
			}else if(voto == 3) {
				voto = 1;
				voto3 = voto + voto3;
			}
				
		}
		System.out.println("Votos do candidato Dener: " + voto1);
		System.out.println("Votos do candidata Lauren: " + voto2);
		System.out.println("Votos do candidato Ruti: " + voto3);
		
		
		
	}

}
