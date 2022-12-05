package lista05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota da primeira avaliação: ");
		float nota01 = sc.nextFloat();

		System.out.println("Digite a nota da segunda avaliação: ");
		float nota02 = sc.nextFloat();

		float resultadoMedia = (nota01 + nota02) / 2;

		if (resultadoMedia >= 6) {
			System.out.println("O aluno Foi aprovado, pós a media foi: " + resultadoMedia);
		} else {
			System.out.println("O aluno Foi reprovado, pós a media dele foi " + resultadoMedia);
		}

		sc.close();
	}
}