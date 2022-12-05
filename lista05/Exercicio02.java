package lista05;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2) Ler um valor e escrever se é positivo ou negativo (considere o valor zero
		 * como positivo).
		 */
			
		Scanner sc = new Scanner (System.in);	
			
		System.out.println("Digite um valor: ");
		int valorPositivoOuNegativo = sc.nextInt();
		
		if(valorPositivoOuNegativo >= 0){
			System.out.println("O seu numero e Positivo");
		}else {
			System.out.println("O seu numero e Negativo");
		}
		
		sc.close();
		}
	}