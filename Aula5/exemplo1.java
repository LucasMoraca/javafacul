package Aula5;

import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int idade;
        String nome;
        
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.print("Seu nome é "+nome+" e você tem "+idade+" anos.");

    }
}
