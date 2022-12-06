package lista09;

public class Exercicio02 {
    
    public static void main(String[] args) {
		
        // Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.
        
                
                int aux = 2;
                int soma = 0;
                
                for (int i = 1; i < 500; i++) {
                    
                    int numero = aux;
                    int pares = numero+2; 
                    aux = pares;
                    soma = aux+numero;
                    
                    
                }
                
                System.out.println("a soma dos pares de 1 até 500 é "+soma);
                
                
            }

}
