package lista09;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
		/*  Elaborar um programa que efetue a leitura de 15 valores numéricos inteiros e no final 
		 * apresente o total do somatório da fatorial de cada valor lido.
		 */

	     Scanner escopo = new Scanner(System.in);
	     int total = 0;
	     int numero = 0;
	     int numero1 = 0;
	     int numero2 = 0;
	     System.out.println("digite um numero");
			numero = escopo.nextInt();
			int aux = numero-1;
			numero = numero*aux;
	     
		for (int i = 0; i < 14; i++) {
			
			System.out.println("digite um numero");
			numero1 = escopo.nextInt();
			int aux2 = numero1-1;
		    numero1 = +aux2*numero1+numero2;
		    numero2 = numero1;
		    
		 
		}
		
		total = numero2+numero;
		System.out.println(total);
		
		escopo.close();
	}

}
