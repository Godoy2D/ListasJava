package lista05;

import java.util.Scanner;

// 5) Ler o ano atual e o ano de nascimento de uma pessoa.
//    Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

public class Exercicio05 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Ano atual: ");
		int anoAtual = sc.nextInt();

		System.out.println("Digite o Ano do seu Nascimento: ");
		int anoDoNascimento = sc.nextInt();

		int idade = anoAtual - anoDoNascimento;

		if (idade >= 18) {
			System.out.println("Você pode votar");
		} else {
			System.out.println("Você não pode votar");
		}
		System.out.println("Você tem " + idade + " Anos");
		sc.close();
	}
}