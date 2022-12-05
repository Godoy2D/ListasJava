package Lista02;

import java.util.Scanner;

// 6) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula deconversão é C=(F-32)*(5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Fahrenheit, Celsios;

        System.out.print("Conversor de temperatura: Fahrenheit: graus Fahrenheit -> Celsius\n\n ");

        System.out.print("Digite a temperatura em Fahrenheit: ");
        Fahrenheit = sc.nextDouble();

        Celsios = (9 * Fahrenheit / 5);

        System.out.println("\n A medida convertida é" + Celsios + "ºF\n");
        sc.close();
    }
}
