package lista06;

import java.util.Scanner;

public class Exercicio11 {


	/*
	 * 11. Elaborar um programa que efetue a leitura de um valor que esteja entre a
	 * faixa de 1 a 9. Após a leitura do valor fornecido pelo usuário, o programa
	 * deverá indicar uma de duas mensagens: "O valor está na faixa permitida", caso
	 * o usuário forneça o valor nesta faixa, ou a mensagem
	 * "O valor está fora da faixa permitida", caso o usuário forneça valores
	 * menores que 1 ou maiores que 9.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um Valor: ");
		int valor01 = sc.nextInt();

		if (valor01 >= 1 && valor01 <= 9) {
			System.out.println("O seu numero está dentro do permitido entre 1 e 9: " + valor01);
		} else {
			System.out.println("O seu numero não está dentro do permitido entre 1 e 9: " + valor01);
		}

		sc.close();
	}
}
