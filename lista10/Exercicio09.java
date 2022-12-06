package lista10;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
		/*Elaborar um programa que apresente os valores de
		 *  conversão de graus Celsius em Fahrenheit, de 10 em 10 graus,
		 *   iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius.
		 *    O programa deve apresentar os valores das duas temperaturas. A fórmula de conversão 
		 *    é F = (9*C+160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
		 */
		
		
		

       	Scanner ler = new Scanner(System.in);
		
		float celsius;
		float fahrenheit;
		
		System.out.println("digite qual tempertura estamos em graus celsius: ");
		
		celsius = ler.nextFloat();
		
	    fahrenheit = (celsius* 9/5) + 32;
	    
	    System.out.println("essa temperatura em graus fahrenheit � de:  "+fahrenheit+"�");
	    
	    ler.close();
		
	}


}
