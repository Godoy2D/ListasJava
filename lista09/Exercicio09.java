package lista09;

import java.util.Scanner;

public class Exercicio09 {
    
    public static void main(String[] args) {
		/* Elaborar um programa que efetue a leitura de valores positivos inteiros
		 *  até que um valor negativo seja informado. Ao final devem ser apresentados o maior e 
	 *  o menor valores informados pelo usuário.
		 */

		
		// ainda não consegui, vou tentar depois 
		Scanner escopo = new Scanner(System.in);
		
		
	   System.out.println("olá, digite um número positivo:");
	   int numero = escopo.nextInt();
	   int aux = 0;
	   int maior = 0;
	   int menor = 0;
	   int numero2 = 0;
	   
	    while (aux >= 0) {
	    	
	    	
	    	System.out.println("digite mais um número:");
	    	numero2 = escopo.nextInt();
	    	if (numero > numero2) {
	    		
	    		maior = numero;
				aux = maior;
			}else if (numero2 > numero) {
				
				maior = numero2;
				aux = maior;
				
			}if (numero2 > aux) {
				
				aux = numero2;
				
			}
	    	
	    	
	    	
	    	   	
			}if (aux < 0) {
				
				System.out.println(" o número digitado é negativo");
				System.out.println("e o maior e menor número digitado são:");
				System.out.println(aux);
				System.out.println(numero2);
				
	
			}
	        
	        
	    
	    
	    		
	  
		}
}
