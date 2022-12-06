package lista07;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
		/*  Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor.
		 *  Caso não haja vencedor deverá ser impressa a palavra EMPATE.
		 */

		Scanner escopo = new Scanner(System.in);
		String time1,time2;
		int numerogol,numerogol1;
		
		
		System.out.println("digite o nome do primeiro time:");
		time1 = escopo.nextLine();
		
		System.out.println("digite o número de gols feito por esse time:");
		numerogol = escopo.nextInt();
		
		System.out.println("digite o nome do segundo time:");
		time2 = escopo.next();
		
		System.out.println("digite agora o número de gols feito por esse time:");
		numerogol1 = escopo.nextInt();
		
		if (numerogol > numerogol1) {
			
			System.out.println("o time vencedor é o "+time1+"!");
			
		} else {

			System.out.println("o time vencedor é o "+time2+"!");
			
		}
		
		
		escopo.close();
		
		
	}

}