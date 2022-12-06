package lista07;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
		/* Ler dois valores e imprimir uma das três mensagens a seguir: ‘Números iguais’, caso os números sejam iguais 
		 * ‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
		 * ‘Segundo maior’, caso o segundo seja maior que o primeiro.
		 */

		Scanner escopo = new Scanner(System.in);
		int numero1,numero2;
		
		System.out.println("digite um número:");
		numero1 = escopo.nextInt();
		
		System.out.println("digite o segundo número:");
		numero2 = escopo.nextInt();
		
		if (numero1 > numero2) {
			
			System.out.println("o primeiro número digitado é maior!");
			
		} else if (numero2 > numero1) {
			
			System.out.println("o segundo número digitado é maior!");
			
		}else if (numero1== numero2) {
			
			System.out.println("os números digitados são iguais!");
		} {

		}
		
        escopo.close();

	}

}