package lista08;

import java.util.Random;

public class Exercicio05 {

	int i = 0;
	
	// para chamar  no Ex06
	
	Random sc = new Random();
	Random sc2 = new Random();
	
	double numero1 = sc.nextDouble();
	
	double numero2 = sc2.nextDouble();
	
	double potencia = Math.pow(numero1,numero2);

	public static void main(String[] args) {
		/* Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. 
		 * Deve ser considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. 
		 * Observe que neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).
		 */
		for (int i = 0; i < 16 ; i++) {
	    	  
	    	 double potencia = Math.pow(3, i);
	    	 
	    	 System.out.println((int)potencia);
	    }
    }
}