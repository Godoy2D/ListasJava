package Lista02;

import java.util.Scanner;

// 5) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double Celsius, Fahrenheit;

        System.out.print("Conversor de temperatura: Graus Celsios -> Fahrenheit\n\n");

        System.out.print("Digite a temperatura em Celsius: ");
        Celsius = sc.nextDouble();

        Fahrenheit = (9 * Celsius + 160) / 5;

        System.out.print("\n A medida convertida é " + Fahrenheit + "ºF\n");
        sc.close();
    }

}