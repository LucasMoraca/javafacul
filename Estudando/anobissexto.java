package Estudando;

import java.util.Scanner;

public class anobissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano;

        if (scanner.hasNextInt()) {
            ano = scanner.nextInt();
            boolean isBissexto = false;

            if ((ano % 4 == 0 && ano % 100 !=0) || (ano % 400 == 0)) {
                isBissexto = true;
            }

            if (isBissexto) {
                System.out.println(ano + " é um ano bissexto");
            }else{
                System.out.println(ano + " é um ano comum");
            }
        }else{
            System.out.println("Entrada inválida. Por favor, digite um número inteiro para o ano.");
        }
        scanner.close();
    }
}
