package lista06;

import java.util.Scanner;

public class Exercicio01 {
 public static void main(String[] args) {

		/*
		 * 1) Ler dois valores numéricos inteiros e apresentar o resultado da diferença
		 * do maior pelo menor valor.
		 */

		/**
		 * @param Args
		 */
		public static void main(final String[]Args) {
			
			Scanner sc = new Scanner (System.in);
			
			
			System.out.println("Digite o primeiro valor: ");
			int valor01 = sc.nextInt();
			
			System.out.println("Digite o segundo Valor: ");
			int valor02 = sc.nextInt();
			
			if(valor01 > valor02) {
				System.out.println("A diferencia entre os dois valores digitados é: "+(valor01-valor02));
			}else {
				System.out.println("A diferencia entre os dois valores digitados é: "+(valor02-valor01));
			}
		}
		

			
			
	