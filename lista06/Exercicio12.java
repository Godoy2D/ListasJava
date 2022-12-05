package lista06;

import java.util.Scanner;

public class Exercicio12 {

	/*
	 * 12. Elaborar um programa que efetue a leitura de um determinado valor
	 * inteiro, e efetue a sua apresentação, caso o valor não seja maior que três.
	 */

	public static void main(String[]Args) {
		
	Scanner sc = new Scanner (System.in);	
		
	System.out.println("Digite um Valor: ");
	int valor01 = sc.nextInt();
	
	if(valor01 <= 3) {
		System.out.println("Valor digitado: "+valor01);
	}

	sc.close();	
	}
}