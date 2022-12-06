package lista09;

import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {
		/* Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório,
		 *  a média aritmética e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver 
		 *  fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo. Não se esqueça que 
		 *  o usuário pode entrar como primeiro número um número negativo, portanto, cuidado com a divisão por zero no cálculo da média.
		 */

		
		
		Scanner escopo = new Scanner(System.in);
		System.out.println("olá, digite um número:");
		int numero = escopo.nextInt();
		int contadora = 1;
		int aux = 0;
		while (numero >= 0) {
			
	        contadora++;
			System.out.println("digite um número:");
			int numero2 = escopo.nextInt();
			aux = numero+numero2;
			numero = aux;
							
			if (numero2 < 0) {
				
				int media = numero/contadora;
				 System.out.println("você digitou "+contadora+" numeros");
				  System.out.println("e o último foi negativo!");
				  System.out.println("a soma dos valores digitados é: "+numero);
				  System.out.println("e a media aritimetica é: "+media);
				  System.out.println("________________________________\n");
				  
				 
				}
			
		}
		
		 escopo.close();
	}


}
