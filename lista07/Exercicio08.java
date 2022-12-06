package lista07;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
		// teste de mesa
		
		Scanner escopo = new Scanner(System.in);
		int x,y,z;

		System.out.println("digite o valor de x:");
		x = escopo.nextInt();
		
		System.out.println("digite o valor de y:");
		y = escopo.nextInt();
		
		z = -(x*y) + 5;
		
		if (z <= 0) {
			
			System.out.println("A");
			
		} else if(z <= 100) {
			
			System.out.println("B");

		}else {
			System.out.println("C");
		}
		
		System.out.println(z);
		
		escopo.close();

	}

}