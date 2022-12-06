package lista07;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
		/* Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média 
		 * dos exercícios que fazem parte da avaliação. Calcular a média de aproveitamento,
		 *  usando a fórmula abaixo e escrever o conceito do aluno de acordo com a tabela de
		 *   conceitos mais abaixo:
		 *   
		 *   MEDIA DE APROVEITAMENTO = N1+N2*2+N3*3+MEDIA DOS EXERCICIOS / 7
		 *   
		 *   A atribuição de conceitos obedece a tabela abaixo:
		 *   
		 *   MEDIA APROVEITAMENTO	
               >= 9,0	|A|
               >= 7,5 e < 9,0 	|B|
               >= 6,0 e < 7,5	|C|
               < 6,0	|D|
		 *   
		 */

        Scanner escopo = new Scanner(System.in);
        
        System.out.println("olá, digite a primeira nota do aluno:");
		float nota1 = escopo.nextFloat();
		int exerciciosNota1 = 12;
		
		System.out.println("digite a segunda nota do aluno:");
		float nota2 = escopo.nextFloat();
		int exerciciosNota2 = 12;
		
		System.out.println("digite a terceira nota do aluno:");
		float nota3 = escopo.nextFloat();
		int exerciciosNota3 = 15;
		
		int somaExercicios = exerciciosNota1+exerciciosNota2+exerciciosNota3;
		
		float media = somaExercicios/3;
		
		float mediaAproveitamento = (nota1+nota2)*2+(nota3*3)+(media)/7;
		
		if (mediaAproveitamento >= 9 ) {
			
			System.out.println("conceito: A");
			
		}if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
			
			System.out.println("conceito: B");
			
		}if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
			
			System.out.println("conceito: C");
			
		}else if (mediaAproveitamento < 6.0) {
			
			System.out.println("conceito: D");
		}
		escopo.close();
    }
}
