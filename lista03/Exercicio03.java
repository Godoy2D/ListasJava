package lista03;

import java.util.Scanner;

// 3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário.

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 Scanner sc = new Scanner(System.in);
		 
			 System.out.printf("Digite o salario mensal atual: ");
			 float salario=sc.nextFloat();
			 System.out.printf("digite o perecentual do reajuste:");
			 float percentualReajuste=sc.nextFloat();
			 float novoSalario=salario/100*percentualReajuste+salario;
			 System.out.printf("O novo salario corresponde a: "+salario);
		
	}

}
