package lista06;

import java.util.Scanner;

public class Exercicio10 {

	/*
	 * 10. Elaborar um programa que efetue a leitura de um número inteiro e
	 * apresentar uma mensagem informando se o número é par ou ímpar.
	 */


	public static void main(String[] Args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite um numero: ");
		float valorParOuImpar = sc.nextFloat();
		
		if(valorParOuImpar % 2 == 1){
			System.out.println("O seu numero é Impar");
		}else {
			System.out.println("O seu numero é Par");
		}
		
		sc.close();
	}
}
