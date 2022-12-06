package lista07;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        //Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
    
    
            
            Scanner escopo = new Scanner(System.in);
            int numero1,numero2,numero3;
            
            
            System.out.println("olá, digite um número:");
            
            numero1 = escopo.nextInt();
            
            System.out.println("digite o segundo numero:");
            
            numero2 = escopo.nextInt();
            
            System.out.println("digite o terceiro número:");
            numero3 = escopo.nextInt();
            
            if (numero1 > numero2 && numero2 > numero3) {
                
                System.out.println("se somarmos os maiores número digitados, temos um total de "+ (numero1+numero2));
                
            } else if (numero2 > numero1 && numero3 > numero1) {
                
                System.out.println("se somarmos os maiores número digitados, temos um total de "+ (numero3+numero2));
                
            }else if (numero1 > numero2 && numero3 > numero1) {
                
                System.out.println("se somarmos os maiores número digitados, temos um total de "+ (numero1+numero3));
                
            }else if (numero1 > numero3 && numero2 > numero3) {
                
                System.out.println("se somarmos os maiores número digitados, temos um total de "+ (numero1+numero2));
                
            }else if (numero1 > numero2 && numero3 > numero2) {
                
                System.out.println("se somarmos os maiores número digitados, temos um total de "+ (numero1+numero3));
                
            }{
                
                escopo.close();
    
            }
            
                }
                
            }
            
    