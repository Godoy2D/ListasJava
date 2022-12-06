package lista07;

import java.util.Scanner;

public class Exercicio05 {

public static void main(String[] args) {
    /* Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo.
     *  OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.
     */
    
  Scanner escopo = new Scanner(System.in);
  int ladoA,ladoB,ladoC;
  
  System.out.println("Olá, vamos verificar se conseguimos formar um triângulo com as medidas que você digita?");
  System.out.println("\ndgite a medida do primeiro lado(provavel base do triângulo):");
  ladoA = escopo.nextInt();
 
  System.out.println("diite a medida do segundo lado:");
  ladoB = escopo.nextInt();
  
  System.out.println("digite a medida do terceiro lado:");
  ladoC = escopo.nextInt();
  
  if (ladoA < ladoB+ladoC) {
      
      System.out.println("\nque legal!\ncom essa medida, é possivel sim criar um triângulo!");
    
} else {
    
    System.out.println("bom... que pena! com os dados que você informou, não é possivel formar um triângulo!\ntente colocar um valor que seja menor que a medida dos outros dois lados ");
    
    
}while (ladoA > ladoB+ladoC) {
    
     System.out.println("\ndgite novamente a medida do primeiro lado(provavel base do triângulo):");
      ladoA = escopo.nextInt();
     
      System.out.println("diite a medida do segundo lado:");
      ladoB = escopo.nextInt();
      
      System.out.println("digite a medida do terceiro lado:");
      ladoC = escopo.nextInt();
      
      if (ladoA < ladoB+ladoC) {
          
          System.out.println("\nque legal!\ncom essa medida, é possivel sim criar um triângulo!");
        
    } else {
        
        System.out.println("bom... que pena! com os dados que você informou, não é possivel formar um triângulo!\ntente colocar um valor que seja menor que a medida dos outros dois lados ");		
        
}

 escopo.close();	
    
}

}

}