package Lista02;

import java.util.Scanner;

// 11) Escreva um algoritmo para ler as dimensões de um trapézio (base amior, base menor e altura), calcular e escrever a área do trapézio. a=(B+b).h/2
public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a Base maior: ");
		Double BaseMaior =sc.nextDouble();
		System.out.println("Digite a Base menor: ");
		Double Basemenor =sc.nextDouble();
		System.out.println("Digite a Altura: ");
		Double Altura =sc.nextDouble();
		
		
		
		Double a = BaseMaior + Basemenor * Altura /2;
		System.out.println("O valor do losango é:" + a );
		sc.close();
		
	}

}
