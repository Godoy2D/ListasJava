package lista04;

import java.util.Scanner;

// 5) Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor
//    lido em real. O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível
//    com o usuário, para que seja apresentado o valor em moeda americana. 

public class Exercicio05 {
	
		public static void main(String[] Args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Digite o Valor que você tem em Reais: ");
			float valorReal = sc.nextFloat();
			float conversaoDolar = valorReal / 5;

			System.out.println("O valor que você tem, convertido em Dolar é: $ " + conversaoDolar);

			sc.close();

		}
}
