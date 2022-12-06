package lista02;

import java.util.Scanner;

// 12) Escreva um algoritmo para ler as dimensões de um circulo (raio), calcular e escrever a área do circulo. a=pi*r²

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		

	    System.out.println("Informe o raio da circunferência");
	    Double r =sc.nextDouble();

	    Double pi=Math.PI;
	    Double a = pi * (r*r);
	
	    System.out.println("A area do circulo é" + a );
	    sc.close();
		
	}

}
