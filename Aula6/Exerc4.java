package Aula6;

import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        // Verifica se o ano é bissexto usando if-else
        boolean isBissextoIfElse;
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            isBissextoIfElse = true;
            System.out.println(ano + " é um ano bissexto.");
        } else {
            isBissextoIfElse = false;
            System.out.println(ano + " é um ano comum.");
        }

        // Verifica se o ano é bissexto usando operador ternário
        String resultadoTernario = ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) ?
                                    "Ano bissexto" : "Ano comum";
        System.out.println(ano + " é um " + resultadoTernario + " (usando operador ternário).");

        scanner.close();
    }    
}
