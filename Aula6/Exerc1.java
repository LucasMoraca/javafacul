package Aula6;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo");
        } else {
            System.out.println("O número " + numero + " é nulo");
        }
        scanner.close();
    }
}
