package lista03;

import java.util.Scanner;

// 2) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner ler = new Scanner(System.in);

	      int eleitores, brancos, nulos, validos;
	      double percBrancos, percNulos, percValidos;

	      System.out.printf("Informe o nro de eleitores:\n");
	      eleitores = ler.nextInt();
	      System.out.printf("\nInforme o nro de votos validos:\n");
	      validos = ler.nextInt();
	      System.out.printf("\nInforme o nro de votos em branco:\n");
	      brancos = ler.nextInt();
	      System.out.printf("\nInforme o nro de votos nulos:\n");
	      nulos = ler.nextInt();

	      percValidos = ((double)validos / eleitores) * 100;
	      percBrancos = ((double)brancos / eleitores) * 100;
	      percNulos = ((double)nulos / eleitores) * 100;

	      System.out.printf("\n\n%6.2f%% de votos validos.", percValidos);
	      System.out.printf("\n%6.2f%% de votos em branco.", percBrancos);
	      System.out.printf("\n%6.2f%% de votos nulos.\n", percNulos);
		
	}
}
