package lista03;

import java.util.Scanner;

public class Exercicio09 {

	// 9) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Valor: ");
		Double Valor =sc.nextDouble();
		System.out.println("Digite a Taxa: ");
		Double Taxa =sc.nextDouble();
		System.out.println("Digite a Tempo: ");
		Double Tempo =sc.nextDouble();
		
		Double PRESTACAO= Valor + (Valor*Taxa/100)* Tempo ;
		System.out.println("O valor da area é:" + PRESTACAO );
		sc.close();
		
	}
}
