package lista02;

import java.util.Scanner;

// 9) Escreva um algoritmo para ler as dimensões de um quadrado (lado), calcular e escrever a área do quadrado. Dica a=l²

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o lado: ");
		Double lado =sc.nextDouble();
		
		Double a = lado * 2;
		System.out.println("O valor da area é:" + a );
		
		sc.close();
	}

}
