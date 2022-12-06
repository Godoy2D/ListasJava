package lista07;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
		/* Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades dos 
		 * homens serao 
		 * sempre
		 *  diferentes entre si, bem como as das mulheres). Calcule e 
		 * escreva a soma das idades do homem mais velho com a mulher mais nova, 
		 * e o produto das idades do homem mais novo com a mulher mais velha.
		 */
		
		
			
			Scanner escopo =  new Scanner(System.in);
			System.out.println("ola, tudo bem?\ndigite a idade do primeiro homem:");
			
			int idadeH1 = escopo.nextInt();
			
			System.out.println("ok, digite a idade do segundo homem:");
			
			int idadeH2 = escopo.nextInt();
			
			System.out.println("show!\n agora vamos para as mulheres...\ndigite a idade da primeira mulher:");
			int idadeM1 = escopo.nextInt();
			
			System.out.println("digite a idade da segunda mulher:");
			int idadeM2 = escopo.nextInt();
			int possibilidade1 = idadeH1+idadeM2;
			int possibilidade2 = idadeH2+idadeM1;
			
			
			if (idadeH1>idadeH2 && idadeM1 > idadeM2) {

			System.out.println("\nshow!\na soma da idade do Homem mais mais velho com a da Mulher mais nova e de "+possibilidade1);
			System.out.println("e o produto da idade do homem mais novo com a mulher mais velha e de "+idadeH2*idadeM1);
				
	
			} else if (idadeH2>idadeH1 && idadeM2 > idadeM1) {
				
				
				System.out.println("\nshow!\na soma da idade do Homem mais mais velho com a da Mulher mais nova e de "+possibilidade2);
				System.out.println("e o produto da idade do homem mais novo com a mulher mais velha e de "+idadeH1*idadeM2);
				
				
			}else if (idadeH1>idadeH2 && idadeM2>idadeM1) {
				

				System.out.println("\nshow!\na soma da idade do Homem mais mais velho com a da Mulher mais nova e de "+possibilidade1);
				System.out.println("e o produto da idade do homem mais novo com a mulher mais velha e de "+idadeH1*idadeM1);
				
				
			}else if (idadeH2>idadeH1 && idadeM1>idadeM2) {
				
				System.out.println("\nshow!\na soma da idade do Homem mais mais velho com a da Mulher mais nova e de "+possibilidade2);
				System.out.println("e o produto da idade do homem mais novo com a mulher mais velha e de "+idadeH2*idadeM2);
				
				
			}{

	escopo.close();
			
	}
	}
}