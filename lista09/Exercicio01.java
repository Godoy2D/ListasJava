package lista09;

public class Exercicio01 {
    
    public static void main(String[] args) {
		// Apresentar os quadrados dos números inteiros de 15 a 200.
		
	
		int numero1 = 15;
	
      for (int i = 0; i < 200; i++) {
    	  
    	  
    	  System.out.println("o número "+numero1+" ao quadrado é "+numero1*numero1);
    	  numero1 = numero1+1;
    	  
    	 double  quadrado = Math.pow(numero1,2);
    	 
    	 System.out.println("o número "+numero1+" ao quadrado é "+quadrado);
		
	}
	 

}

}
