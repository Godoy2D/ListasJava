package lista04;

import java.util.Scanner;

// 7) Elaborar um programa que efetue a leitura de três valores 
//    (A, B e C) e apresente como resultado final o quadrado da soma dos três valores lidos.

public class Exercicio07 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da Variavel A: ");
		int variavelA = sc.nextInt();
		int resultado = variavelA * variavelA;
		System.out.println("O resultado do Quadrado A é : " + resultado);

		System.out.println("");
		System.out.println("");

		System.out.println("Digite o valor da Variavel B: ");
		int variavelB = sc.nextInt();
		int resultadoB = variavelB * variavelB;
		System.out.println("O resultado do Quadrado B é : " + resultadoB);

		System.out.println("");
		System.out.println("");

		if (resultado > resultadoB) {
			System.out.println("O resultado A é Maior que o B: " + resultado);
		} else {
			System.out.println("O resultado B é Maior que o A: " + resultadoB);
		}

		System.out.println("");
		System.out.println("");

		int diferenciaA = resultado - resultadoB;
		int diferenciaB = resultadoB - resultado;

		if (resultado > resultadoB) {
			System.out.println("A diferencia entre A e B é: " + diferenciaA);
		} else {
			System.out.println("A diferencia entre B e A é: " + diferenciaB);
		}

		sc.close();
	}
}
