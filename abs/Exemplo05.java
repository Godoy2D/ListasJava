package abs;

import java.util.Scanner;

// 4) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a subtração dos valores.

public class Exemplo05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite os números que deseja:");
		
		int numero = sc.nextInt();
		int numero1 = sc.nextInt();
		int soma= numero + numero1;
		
		System.out.println( soma );
		sc.close();
	}

}
