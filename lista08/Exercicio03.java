package lista08;

public class Exercicio03 {
    
    public static void main(String[] args) {
		//Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.
		
		 int numero = 1;
		  int numero2 = 2;
		  
		  int soma = numero+numero2;
		  
		  while (numero < 501) {
			
			  
			  numero = numero+1;
			  numero2 = numero2+1;
			  soma = soma+numero2;
			  
		}
		  
		  System.out.println("a soma dos números inteiros de 1 a 500 é: "+soma); 
		}
    }
