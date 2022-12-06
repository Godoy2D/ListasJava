package lista10;

public class Exercicio04 {
    
    public static void main(String[] args) {
        //  Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.
                
                
                int numero = 0;
                int numero2 = 0;
                int restodiv = numero%numero2;
                int soma = 0;
                
                for (int i = 0; i < 500; i++) {
                    
                    if (restodiv == 0) {
                        
                        numero = numero++;
                        numero2 = numero2++;
                        soma = numero+numero2;
                        
                    }
                    
                    System.out.println(soma);
                }
                
            
        
            }

}
