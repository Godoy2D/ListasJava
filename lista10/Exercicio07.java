package lista10;

import java.nio.file.WatchEvent;

public class Exercicio07 {
    
    public static void main(String[] args) {
        /*Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15.
         * 7 Deve ser considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio.
         *  
         */
           
               double potencia = 0;
               for (int i = 0; i < 15; i++) {
                   
                 potencia = Math.pow(3, i);
                 System.out.println((int)potencia);
             
                   
               }
               
           }

}
