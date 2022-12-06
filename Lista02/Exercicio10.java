package lista02;

// 10) Escreva um algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor), calcular e escrever a área do losango. Dica a=D.d/2

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a Diagonal maior: ");
		Double DiagonalMaior =sc.nextDouble();
		System.out.println("Digite a diagonal menor: ");
		Double DiagonalMenor =sc.nextDouble();
		
		Double a = DiagonalMaior * DiagonalMenor  /2;
		System.out.println("O valor do losango é:" + a );
		sc.close();
		
		
		
	}

}
