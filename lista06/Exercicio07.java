package lista06;

import java.util.Scanner;

public class Exercicio07 {

	public class Exercicio07_DispostosEmOrdemCrescente {

		/*
		 * 7. Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los
		 * dispostos em ordem crescente.
		 */

		public static void main(String[] Args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Digite o Valor A: ");
			float valorA = sc.nextFloat();
			System.out.println("Digite o Valor B: ");
			float valorB = sc.nextFloat();
			System.out.println("Digite o Valor C: ");
			float valorC = sc.nextFloat();

			if (valorA <= valorB && valorB <= valorC) {
				System.out.println("A ordem crescente: " + valorA + (" , ") + valorB + (" , ") + valorC);
			} else if (valorA <= valorC && valorC <= valorB) {
				System.out.println("A ordem crescente: " + valorA + (" , ") + valorC + (" , ") + valorB);
			} else if (valorB <= valorA && valorA <= valorC) {
				System.out.println("A ordem crescente: " + valorB + (" , ") + valorA + (" , ") + valorC);
			} else if (valorB <= valorC && valorC <= valorA) {
				System.out.println("A ordem crescente: " + valorB + (" , ") + valorC + (" , ") + valorA);
			} else if (valorC <= valorA && valorA <= valorB) {
				System.out.println("A ordem crescente: " + valorC + (" , ") + valorA + (" , ") + valorB);
			} else {
				System.out.println("A ordem crescente: " + valorC + (" , ") + valorB + (" , ") + valorA);
			}

			sc.close();
		}
	}