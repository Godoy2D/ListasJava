package lista06;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * 2. Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o
	 * número lido como sendo um valor positivo, ou seja, o programa deverá
	 * apresentar o módulo de um número fornecido. Lembre-se de verificar se o
	 * número fornecido é menor que zero; sendo, multiplique-o por -1.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um Valor Positivo ou Negativo: ");
		int valor01 = sc.nextInt();

		if (valor01 < 0) {
			int valor02 = valor01 * (-1);
			System.out.println("O modulo do Numero informado é : " + valor02);
		}

		sc.close();
	}
}