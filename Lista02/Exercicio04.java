package lista02;

import java.util.Scanner;

// 4) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do custo de fabricação:");
		float CustoAutomovel=sc.nextFloat();
		float ValorTotalCarro=(28/100*CustoAutomovel+CustoAutomovel*45/100) + CustoAutomovel;
		
		System.out.println("Digite o valor total do carro + do distribuidor é:"+ValorTotalCarro);
	}
	
}
