package lista06;

import java.util.Scanner;

public class Exercicio03 {

	/*
	 * 3. Ler quatro valores referentes a quatro notas escolares de um aluno e
	 * imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média
	 * escolar for maior ou igual a 5. Se o aluno não foi aprovado, indicar uma
	 * mensagem informando esta condição. Apresentar junto das mensagens o valor da
	 * média do aluno para qualquer condição.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira Nota: ");
		float nota01 = sc.nextFloat();
		System.out.println("Digite a segunda Nota: ");
		float nota02 = sc.nextFloat();
		System.out.println("Digite a terceira Nota: ");
		float nota03 = sc.nextFloat();
		System.out.println("Digite a quarta Nota: ");
		float nota04 = sc.nextFloat();

		float mediaFinal = (nota01 + nota02 + nota03 + nota04) / 4;

		if (mediaFinal >= 5) {
			System.out.println("O aluno Foi Aprovado Com a Media : " + mediaFinal);
		} else {
			System.out.println("O aluno foi Reprovado Com a Media : " + mediaFinal);
		}

		sc.close();
	}
}