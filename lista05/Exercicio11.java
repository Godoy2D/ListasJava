package lista05;

import java.util.Scanner;

public class Exercicio11 {

	/*
	 * 11) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e
	 * crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo -
	 * débito + crédito). Também testar se saldo atual for maior ou igual a zero
	 * escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo
	 * Negativo'.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero da Conta: ");
		float contaCliente = sc.nextFloat();

		System.out.println("Digite o Saldo da Conta - " + contaCliente + " : ");
		float saldoEmConta = sc.nextFloat();

		System.out.println("Digite o Seu Debito: ");
		float debitoDaConta = sc.nextFloat();

		System.out.println("Digite o seu credito Disponivel: ");
		float creditoEmConta = sc.nextFloat();

		float saldoAtual = (saldoEmConta - debitoDaConta) + creditoEmConta;

		System.out.println("Cliente : " + contaCliente);
		System.out.println("Saldo da Conta : R$" + saldoEmConta);
		System.out.println("Debito da Conata: R$" + debitoDaConta);

		if (saldoAtual >= 0) {
			System.out.println("O saldo da Conta " + contaCliente + " e POSITIVA.");
		} else {
			System.out.println("O saldo da conta " + contaCliente + " e NEGATIVA");
		}

		sc.close();
	}
}