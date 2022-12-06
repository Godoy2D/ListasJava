package lista09;

public class Exercicio10 {
    
    public static void main(String[] args) {
		/*  Elaborar um programa que apresente o resultado inteiro da divisão de dois números quaisquer.
          Para a elaboração do programa, não
         utilizar em hipótese alguma o conceito do operador aritmético DIV. A solução deve ser alcançada com 
         a utilização de looping. Ou seja,
         o programa deve apresentar como resultado (quociente) quantas vezes o divisor cabe no dividendo.
*/
		
		
		int numero = 10;
		int numero2 = 2;
		int restodiv = numero%numero2;
		int aux = 0;
	   while (restodiv == 0) {
		   
		   
		  aux = aux++;
		  
		  

		   if (restodiv != 0) {
			   
			   
			   System.out.println(aux);
			
		}
		
	}
		
		
		
		
		
	}

}
