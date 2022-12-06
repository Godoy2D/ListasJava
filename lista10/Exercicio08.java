package lista10;

public class Exercicio08 {
    
    public static void main(String[] args) {
		/* Elaborar um programa que apresente como resultado o valor de uma potência de uma base
         qualquer elevada a um expoente qualquer, ou seja, de BE, em
          que B é o valor da base e E o valor do expoente. Observe que neste
           exercício não pode ser utilizado o operador de exponenciação do portuguol (^).
          */

			      double random = Math.random();
			      
			      double potencia = Math.pow(random, random);
			      
			      System.out.println("segue a potencia de "+random+" elevado a "+random+"\n"+(int)potencia);
			      
		
		
	}

}
