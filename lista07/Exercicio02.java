package lista07;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
		// 2) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
		
		Scanner escopo = new Scanner(System.in);
		int numero1, numero2, numero3;

		System.out.println("digite um número:");
		numero1 = escopo.nextInt();

		System.out.println("digite um número:");
		numero2 = escopo.nextInt();
		System.out.println("digite um número:");
		numero3 = escopo.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			
			System.out.println("o maior número digitado é o "+numero1);
			
		} else if (numero2 > numero1 && numero2 > numero3) {
			
			System.out.println("o maior número digitado é o "+numero2);

			
		}else if (numero3 > numero1 && numero3 > numero2) {
			
			System.out.println("o maior número digitado é "+numero3);
			
			
		}
		escopo.close();
	}

}