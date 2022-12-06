package lista08;

import java.util.Scanner;

public class Exercicio09 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
		/*Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final
		 *  o total do somatório e a média aritmética dos valores lidos.
		 */

		Scanner escopo = new Scanner(System.in);
	  System.out.println("olá, digite 10 números:");
	  int numero1 = escopo.nextInt();
	  int numero2 = escopo.nextInt();
	  int numero3 = escopo.nextInt();
	  int numero4 = escopo.nextInt();
	  int numero5 = escopo.nextInt();
	  int numero6 = escopo.nextInt();
	  int numero7 = escopo.nextInt();
	  int numero8 = escopo.nextInt();
	  int numero9 = escopo.nextInt();
	  int numero10 = escopo.nextInt();
	 
	  int numeros [] = {numero1,numero2,numero3,numero4,numero5,numero6,numero7,numero8,numero9,numero10};
	  
	  int aux = 0;
	  
	 for (int i = 0; i < numeros.length; i++) {
		
		aux+=numeros[i];
		
		
	}
		
	 System.out.println(" a soma dos valores é "+aux);
	 System.out.println("e a media aritimética é aproximadamente "+(aux/10));
		
	 escopo.close();
	 
	}

}
