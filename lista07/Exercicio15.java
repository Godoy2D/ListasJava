package lista07;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        /* Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para estar 
         * em condições, 
         * um dos seguintes requisitos 
         * deve ser satisfeito:
       - Ter no mínimo 65 anos de idade.
        - Ter trabalhado no mínimo 30 anos.
       - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
    
         Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), 
        o ano de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e 
        o tempo de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.
   */
           
           // requisitos necessários para aposentadoria
           
           int idadeMinima = 65;
           int trabalhoMinimo = 30;
           int idadeMinima2 = 60;
           int trabalhoMinimo2 = 25;
           
           Scanner escopo = new Scanner(System.in);
           
           System.out.println("digite seu código de empresa:");
           int codigoEmpresa = escopo.nextInt();
            
           System.out.println("digite o seu ano de nascimento sem dia e mês:");
           int nascimento = escopo.nextInt();
           
           System.out.println("digite o ano que você entrou na empresa sem dia e mês:");
           int anoEntrada = escopo.nextInt();
           
           int idadeAtual = 2022-nascimento;
           int tempoTrabalho = anoEntrada-2022;
           
           if (idadeAtual >= idadeMinima ) {
               
               System.out.println("código colaborador: "+codigoEmpresa);
               System.out.println("bom, você tem aproximadamente "+idadeAtual+" anos de idade e está trabalhando na empresa a "+tempoTrabalho+" anos");
               
               System.out.println("\nrequerer aposentadoria");
           
           }else if (tempoTrabalho >= trabalhoMinimo) {
               
               System.out.println("código colaborador: "+codigoEmpresa);
               
              System.out.println("bom, você tem aproximadamente "+idadeAtual+" anos de idade e está trabalhando na empresa a "+tempoTrabalho+" anos");
               
               System.out.println("\nrequerer aposentadoria");
           
           }else if (tempoTrabalho >= trabalhoMinimo2 && idadeAtual >= idadeMinima2) {
               
               System.out.println("código colaborador: "+codigoEmpresa);
               
                 System.out.println("bom, você tem aproximadamente "+idadeAtual+" anos de idade e está trabalhando na empresa a "+tempoTrabalho+" anos");
                   
                   System.out.println("\nrequerer aposentadoria");
               
           }else {
               
               System.out.println("código colaborador: "+codigoEmpresa);
               
                 System.out.println("bom, você tem aproximadamente "+idadeAtual+" anos de idade e está trabalhando na empresa a "+tempoTrabalho+" anos");
                   
                   System.out.println("\nnão requerer aposentadoria");
               
           }
           
   escopo.close();
                   
       }
}