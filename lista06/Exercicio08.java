package lista06;

import java.util.Scanner;

public class Exercicio08 {

		/*
		 * 8. Efetuar a leitura de quatro números inteiros e apresentar os números que
		 * são divisíveis por 2 e 3.
		 */

		public static void main(String[] Args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Digite o Primeiro Valor: ");
			float valor01 = sc.nextFloat();

			System.out.println("Digite o segundo valor: ");
			float valor02 = sc.nextFloat();

			System.out.println("Digite o terceiro valor: ");
			float valor03 = sc.nextFloat();

			System.out.println("Digite o quarto valor: ");
			float valor04 = sc.nextFloat();

			if (((valor01 % 2) == 0) || ((valor01 % 3) == 0)) {
				System.out.println("E divisivel por 2 ou 3" + valor01);
				if (((valor02 % 2) == 0) || ((valor02 % 3) == 0)) {
					System.out.println("E divisivel por 2 ou 3" + valor02);
					if (((valor03 % 2) == 0) || ((valor03 % 3) == 0)) {
						System.out.println("E divisivel por 2 ou 3" + valor03);
						if (((valor04 % 2) == 0) || ((valor04 % 3) == 0)) {
							System.out.println("E divisivel por 2 ou 3" + valor04);
						}
					}
				}
			}

			sc.close();
		}
	}
