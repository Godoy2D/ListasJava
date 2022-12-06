package lista09;

public class Exercicio07 {
    
    public static void main(String[] args) {
		/* Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares
		 * situados na faixa numérica de 1 a 10.
         */

		
		 int aux2 =0;
		for (int i = 0; i < 10 ; i++) {
			
		 int restodiv = i%2;
			
			
		 if (restodiv != 0) {
			 
			 int soma = i-1;
			 int aux = soma*i+aux2;
			 aux2 = aux;
			 
			
		}
		 
	
		}
		System.out.println(aux2);
	  
	}

}
