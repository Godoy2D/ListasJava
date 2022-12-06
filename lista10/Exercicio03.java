package lista10;

public class Exercicio03 {
    
    public static void main(String[] args) {
		//  Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).
		
		  int soma = 0;
		  int aux = 0;
		  for (int i = 1; i < 101; i++) {
			  
			soma = i;
			aux = soma+i;
				
		}
		  System.out.println(aux);

	}

}
