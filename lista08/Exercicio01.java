package lista08;

import java.util.Scanner;

/*1) Apresentar os resultados de uma tabuada
 *  de multiplicar (de 1 até 10) de um número qualquer.
 */
public class Exercicio01 {

	public static void main(String[] args) {

		Scanner escopo = new Scanner(System.in);
		
		System.out.println("olá, digite um número para que possamos realizar a tabuada do 1 ao 10:");
		int numero = escopo.nextInt();
		
		System.out.println("\nsegue a tabuada do "+numero+":\n\n");
		System.out.println(numero+"*1"+"= "+numero*1);
		System.out.println(numero+"*2"+"= "+numero*2);
		System.out.println(numero+"*3"+"= "+numero*3);
		System.out.println(numero+"*4"+"= "+numero*4);
		System.out.println(numero+"*5"+"= "+numero*5);
		System.out.println(numero+"*6"+"= "+numero*6);
		System.out.println(numero+"*7"+"= "+numero*7);
		System.out.println(numero+"*8"+"= "+numero*8);
		System.out.println(numero+"*9"+"= "+numero*9);
		System.out.println(numero+"*10"+"= "+numero*10);
		
		escopo.close();
	}
}