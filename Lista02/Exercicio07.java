package lista02;

import java.util.Scanner;


// 7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura

public class Exercicio07{

public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
	

	    System.out.println("Informe o raio da circunferência");
	    Double r =sc.nextDouble();
	    System.out.println("Informe a altura");
	    Double altura =sc.nextDouble();
	    
	    Double pi=Math.PI;
	    Double volume = pi * (r*r)*altura;
	
	    System.out.println("O valor do volume de uma lata de óleo é" +volume);
	    sc.close();
	}   
}
