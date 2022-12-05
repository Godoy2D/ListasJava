package lista03;

import java.util.Scanner;

// 10) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B,
// e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável
// B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int A ,B ,C ,D;
		
		System.out.println("Digite o valor de A:");
		A = entrada.nextInt();
		
		System.out.println("Digite o valor de B:");
		B = entrada.nextInt();
		
		C = A;
		D = B;
		
		A = D;
		B = C;
		
		System.out.print("Os valore de A: " + A + " e B:" + B );
		
		
	}
}
