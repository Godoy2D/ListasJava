package lista04;

import java.util.Scanner;

/**
 * 
 * 1) Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, 
 * baseando-se na utilização do conceito da propriedade distributiva. 
 * Ou seja, se forem lidas as variáveis A, B, C, e D, devem ser somadas e multiplicadas A com B, A com C e A com D. 
 * Depois B com C, B com D e por fim C com D. Perceba que será necessário efetuar seis operações de adição e 
 * seis operações de multiplicação e apresentar doze resultados de saída.
 * 
 * @author Gabriel
 *
 */


public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int[] valores = new int[4] ;
		
		System.out.print("Exercício 4, leia o enunciado.\n\n"); //Desisto!
		
		for(int i=0; i<4; i++){
			System.out.print("Digite o valor "+(i+1)+": ");
			valores[i] = entrada.nextInt();
		}
		
		System.out.print("\nResultados:\n\n");
		
		System.out.print("Valor 1 e Valor 2:\n");
		System.out.print("	"+valores[0]+" + "+valores[1]+" = "+(valores[0]+valores[1])+"\n");
		System.out.print("	"+valores[0]+" * "+valores[1]+" = "+(valores[0]*valores[1])+"\n\n");

		System.out.print("Valor 1 e Valor 3:\n");
		System.out.print("	"+valores[0]+" + "+valores[2]+" = "+(valores[0]+valores[2])+"\n");
		System.out.print("	"+valores[0]+" * "+valores[2]+" = "+(valores[0]*valores[2])+"\n\n");

		System.out.print("Valor 1 e Valor 4:\n");
		System.out.print("	"+valores[0]+" + "+valores[3]+" = "+(valores[0]+valores[3])+"\n");
		System.out.print("	"+valores[0]+" * "+valores[3]+" = "+(valores[0]*valores[3])+"\n\n");
		
		System.out.print("Valor 2 e Valor 3:\n");
		System.out.print("	"+valores[1]+" + "+valores[2]+" = "+(valores[1]+valores[2])+"\n");
		System.out.print("	"+valores[1]+" * "+valores[2]+" = "+(valores[1]*valores[2])+"\n\n");

		System.out.print("Valor 2 e Valor 4:\n");
		System.out.print("	" + valores[1] + " + "+valores[3] + " = " + (valores[1] + valores[3]) + "\n");
		System.out.print("	" + valores[1] + " * "+valores[3] + " = " + (valores[1] * valores[3]) + "\n\n");

		System.out.print("Valor 3 e Valor 4:\n");
		System.out.print("	" + valores[2] + " + " + valores[3] + " = " + (valores[2] + valores[3]) + "\n");
		System.out.print("	" + valores[2] + " * " + valores[3] + " = " + (valores[2] * valores[3]) + "\n\n");
		
	}

}
