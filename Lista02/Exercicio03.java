package Lista02;

// 3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário.

import java.util.Scanner;

public class Exercicio03 {

	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	 
		 System.out.printf("Digite o salario mensal atual: ");
		 float salario=sc.nextFloat();
		 System.out.printf("digite o perecentual do reajuste:");
		 float percentualReajuste=sc.nextFloat();
		 float novoSalario=salario/100*percentualReajuste+salario;
		 System.out.printf("O novo salario corresponde a: "+salario);
	 }
}
