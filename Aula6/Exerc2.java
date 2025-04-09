package Aula6;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor: ");
        double valor = scanner.nextDouble();

        if (valor >= 200){
            double desconto = valor * 0.1;
            valor -= desconto;
        }
        System.out.println("O valor final do produto é "+valor+" R$");
        scanner.close();
    }    
}
