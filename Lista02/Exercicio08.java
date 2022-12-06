package lista02;

import java.util.Scanner;

// 8) Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo. Dica a=b.h/2

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		Double base =sc.nextDouble();
		System.out.println("Digite a altura: ");
		Double altura =sc.nextDouble();
		
		Double a= base * altura /2;
		System.out.println("O valor da area é:" + a );
		sc.close();
		
	}

}
