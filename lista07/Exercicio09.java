package lista07;

import java.util.Scanner;

public class Exercicio09 {

public static void main(String[] args) {
    /* Um posto está vendendo combustíveis com a seguinte tabela de descontos: 
Álcool

até 20 litros,desconto de 3% por litro
acima de 20 itros, desconto de 4% POR litro
Gasolina
até 20 litros, desconto de 4% por litro
acima de 20 itros, desconto de 6% por litro 

Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), 
calcule e imprima 
o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
*/

    Scanner escopo = new Scanner(System.in);
    double valorgasolina = 3.30;
    double valoralcool = 2.90;
    
    System.out.println("qual combustivel você comprou?:");
    String tipo = escopo.nextLine();
    
    System.out.println("quantos litros você adquiriu?:");
    double litros = escopo.nextDouble();
    
    double gasolina = valorgasolina*litros;
    
    double alcool = valoralcool*litros;
    
    // se for gasolina
    
    if (tipo.equals("gasolina") && (double)litros > 20 ) {
        
        System.out.println("bom, como você comprou "+litros+"L de gasolina, você recebeu um desconto de 6% e pagará:"+(gasolina-(6/100*gasolina)+" REAIS "));
        
    } else if (tipo.equals("gasolina") && (double)litros <= 20 ) {
        
        
        System.out.println("bom, como você comprou "+litros+"L de gasolina, você recebeu um desconto de 4% e pagará:"+(gasolina-(4/100*gasolina)+" REAIS "));
        
        // se for alcool 
                
    }else if (tipo.equals("alcool") || tipo.equals("álcool") && litros > 20) {
        
        System.out.println("bom, como você comprou "+litros+"L de "+tipo+", você recebeu um desconto de 4% e pagará:"+(alcool-(4/100*alcool)+" REAIS "));
        
        
    }else if (tipo.equals("alcool") || tipo.equals("álcool") && litros > 20) {
        
        
        System.out.println("bom, como você comprou "+litros+"L de "+tipo+", você recebeu um desconto de 3% e pagará:"+(alcool-(4/100*alcool)+" REAIS "));
        
        
    }else {
        
        System.out.println("\nocorreu um erro na leitura dos dados informados!\npor favor, verifique oas dados digitados e tente novamente");
        System.out.println("\ninformações aceitaveis\ntipo combustivel: gasolina, alcool ou álcool\nquantidade litros: não aceitamos letras ou caracteres");

        escopo.close();
        
    }
    
}
}