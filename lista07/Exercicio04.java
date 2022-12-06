package lista07;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
    //4) Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente.
    
		Scanner escopo = new Scanner(System.in);
		int numero1,numero2,numero3;
		
		System.out.println("digite três numeros: ");
		numero1 = escopo.nextInt();
		numero2 = escopo.nextInt();
		numero3 = escopo.nextInt();
		
		if (numero1 > numero2 && numero2 > numero3) {
			
			System.out.println("segue os números em ordem crescente:\n"+numero3+"\n"+numero2+"\n"+numero1);
			
		} else if (numero2 > numero1 && numero1 > numero3) {
			
			System.out.println("segue os números em oredem crescente:\n"+numero3+"\n"+numero1+"\n"+numero2);
		
			
		}else if (numero3 > numero2 && numero2 > numero1) {
			
			
			System.out.println("segue os números em oredem crescente:\n"+numero1+"\n"+numero2+"\n"+numero3);
			
		}else if (numero2 > numero3 && numero3 > numero1) {
			
			System.out.println("segue os números em oredem crescente:\n"+numero1+"\n"+numero3+"\n"+numero2);
			
		} else if (numero3 > numero2 && numero1 > numero2) {
			
			System.out.println("segue os números em oredem crescente:\n"+numero2+"\n"+numero1+"\n"+numero3);
		} {
			escopo.close();
		}{

		}
	
	}

}