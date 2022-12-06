package lista08;

public class Exercicio08 {

    public static void main(String[] args) {
		/* Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, 
		 * de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius.
		 *  O programa deve apresentar os valores das duas temperaturas. A fórmula de conversão é 
		 *  F = (9*C +160) /5,
		 *   sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
		 */

		
		double celsius = 10;
		
		double farenheit =(9*celsius+160)/5;
		
		for (int i = 0; i < 10 ; i++) {
			
			
			System.out.println(celsius+" graus celsius, se convertido em farenheit é: "+farenheit);
			celsius = celsius+10;
			farenheit =(9*celsius+160)/5;
		}
	}
}
