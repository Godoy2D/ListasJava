package lista05;

import java.util.Scanner;

// 3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se foremcompradas pelo menos 12.
//    Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

public class Exercicio03 {

	public static void main(String[]Args) {
		
		Scanner sc = new Scanner (System.in);	
			
			
		System.out.println("Digite o valor de numero de Maças Compradas: ");
		float quantidadeMaças = sc.nextFloat();
		
		float maçasMenos12 = 1.30f;
		float maçasMaior12 = 1;	
		
		if(quantidadeMaças >= 12) {
			float resultado = quantidadeMaças*maçasMaior12;
			System.out.println("O valor da compra Foi: R$ "+resultado);
		}else {
			float resultado02 = quantidadeMaças*maçasMenos12;
			System.out.println("O valor da Compra Foi: R$ "+resultado02);
		}
		System.out.println("O numero de maças Compradas foram "+quantidadeMaças);
		
		
		sc.close();	
		}	
	}