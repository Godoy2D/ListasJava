package lista06;

import java.util.Scanner;

public class Exercicio04 {

	/*
	 * 4. Ler quatro valores referentes a quatro notas escolares de um aluno e
	 * imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média
	 * escolar for maior ou igual a 5. Se o valor da média for menor que 7,
	 * solicitar a nota de exame, somar com o valor da média e obter nova média. Se
	 * a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o
	 * aluno foi aprovado em exame. Se o aluno não foi aprovado, indicar uma
	 * mensagem informando esta condição. Apresentar com as mensagens o valor da
	 * média do aluno, para qualquer condição.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da Primeira Nota: ");
		float valorNota01 = sc.nextFloat();
		System.out.println("Digite o Valor da segunda Nota: ");
		float valorNota02 = sc.nextFloat();
		System.out.println("Digite o Valor da Terceira Nota: ");
		float valorNota03 = sc.nextFloat();
		System.out.println("Digite o Valor da Quarta Nota: ");
		float valorNota04 = sc.nextFloat();

		float valorNotaFinal = (valorNota01 + valorNota02 + valorNota03 + valorNota04) / 4;

		if (valorNotaFinal >= 7) {
			System.out.println("O aluno foi APROVADO sem Exame com a MEDIA : " + valorNotaFinal);
		} else if (valorNotaFinal < 7) {
			System.out.println("Digite o Valor da Nota do EXAME : ");
			float valorNotaExame = sc.nextFloat();
			float valorNotaFinalComExame = (valorNotaFinal + valorNotaExame) / 2;
			System.out.println("Media do aluno com o exame: " + valorNotaFinalComExame);
			if (valorNotaFinalComExame >= 5) {
				System.out.println("O aluno Foi APROVADO com a Media do Exame: " + valorNotaFinalComExame);
			} else {
				System.out.println("O assluno foi REPROVADO mesmo com a MEDIA do exame: " + valorNotaFinalComExame);
			}
		}

		sc.close();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
