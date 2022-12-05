package lista05;

import java.util.Scanner;

public class Exercicio12 {

	/*
	 * 12) Faça um algoritmo para ler: quantidade atual em estoque, quantidade
	 * máxima em estoque e quantidade mínima em estoque de um produto. Calcular e
	 * escrever a quantidade média ((quantidademédia = quantidade máxima +
	 * quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a
	 * quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a
	 * mensagem 'Efetuar compra'.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a Quantidade Atual em Estoque do Produto: ");
		float quantidadeEstoque = sc.nextFloat();

		System.out.println("Digite a Quantidade Maxima do Estoque: ");
		float maximoEstoque = sc.nextFloat();

		System.out.println("Digite a Quantidade Minima do Estoque: ");
		float minimoEstoque = sc.nextFloat();

		float quantidadeMedia = (maximoEstoque + minimoEstoque) / 2;

		if (quantidadeEstoque >= quantidadeMedia) {
			System.out.println("Não Efetuar Compra");
		} else {
			System.out.println("Efetuar Compra");
		}

		sc.close();
	}
}