package lista07;

import java.util.Scanner;

public class Exercicio11{

    public static void main(String[] args) {
		/*  Uma fruteira está vendendo frutas com a seguinte tabela de preços:
		 * morango até 5kg = 2,50 por kg; maçã até 5kg = 1,80
		 * morango acima de 5kg = 2,20 por kg; maçã acima de 5kg = 1,50 por kg
		 * 
		 * 
		 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
		 * receberá ainda um desconto 
		 * de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) 
		 * de maças adquiridas e escreva o 
		 * valor a ser pago pelo cliente.
		 * 
		 */

		Scanner escopo = new Scanner(System.in);
		
		
		double valorMorango1 = 2.50, valorMaca1 = 1.80;
		double valorMorango2 = 2.20, valorMaca2 = 1.50;
		
		
		System.out.println("segue nossa regra de compras aqui na loja HORTI-FRUIT!");
		System.out.println("\nmorango até 5kg = 2,50 por kg; maçã até 5kg = 1,80\nmorango acima de 5kg = 2,20 por kg; maçã acima de 5kg = 1,50 por kg");
		System.out.println("Se você comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00 reais, receberá ainda um desconto de 10%\nsobre o valor total! ");
		
		
		System.out.println("\n\ndigite quantos kg de morango você comprou:");
		double morango = escopo.nextDouble();
		
		System.out.println("show, agora digite quantos kg de maçã você comprou:");
		double maca = escopo.nextDouble();
		
		
		double resultado1 = morango*valorMorango1;
		double resultado2 = maca*valorMaca1;
		double resultado3 = maca*valorMorango2;
		double resultado4 = maca*valorMaca2;
		
		double kgTotal = maca+morango;
		double porcentagem = 0.1*(resultado3+resultado4);
		double valorComPorcentagem = (resultado3+resultado4)-porcentagem;
		
	    if (morango <= 5 && maca <=5 ) {
            
		System.out.println("como você comprou "+morango+" Kg de morango,ele saiu por "+resultado1+" reais");
          
		System.out.println("como você comprou "+maca+" Kg de maçã, saiu por "+resultado2+" reais");
			
		System.out.println("e soma da sua compra é de: "+resultado1+resultado2);		

		}
		else if (morango <= 5 && maca > 5) {
			
		       System.out.println("como você comprou "+morango+" Kg de morango,ele saiu por "+resultado1+" reais");
		          
					System.out.println("como você comprou "+maca+" Kg de maçã, saiu por "+resultado4+" reais");
					
					System.out.println("e soma da sua compra é de: "+(resultado1+resultado4));
		
		}else if (morango > 5 && maca <= 5) {
			
		       System.out.println("como você comprou "+morango+" Kg de morango,ele saiu por "+resultado3+" reais");
		          
					System.out.println("como você comprou "+maca+" Kg de maçã, saiu por "+resultado2+" reais");
					
					System.out.println("e soma da sua compra é de: "+(resultado3+resultado2));
			
		}if (kgTotal > 8 || kgTotal*(resultado3+resultado4) > 25 ) {
			
			System.out.println("opa, mas como você comprou "+kgTotal+" Kg de frutas,ganhou 10% de desconto e sua compra saiu por "+valorComPorcentagem+" reais");
		
		}
		escopo.close();
	}
}