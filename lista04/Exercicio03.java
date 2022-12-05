package lista04;

import java.util.Scanner;

// 3) Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo segundo.

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a variavel A: ");
		Double A =sc.nextDouble();
		System.out.printf("Digite a variavel B: ");
		Double B =sc.nextDouble();
		
		Double Quadrado = A - B;
		System.out.println("O valor da area é:" + Quadrado );
		
		sc.close();
	}
}
