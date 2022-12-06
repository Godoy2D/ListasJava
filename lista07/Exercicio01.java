package lista07;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
		// 1) Ler um valor e escrever se é positivo, negativo ou zero.
		
		Scanner escopo = new Scanner(System.in);
		int numero;
		
		System.out.println("olá!\ndigite um número");
		numero = escopo.nextInt();
		
		
		if (numero < 0 ) {
			
		  System.out.println("o número digitado é negativo!");
			
		} if (numero == 0 ){
			
			System.out.println("o número digitado é igual a zero");

		} else if (numero > 0 ) {
			
			System.out.println("o número digitado é positivo");
			
		} 
			
			escopo.close();
        
    }

}