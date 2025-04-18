package Estudando;

import java.util.Scanner;

public class notasaluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        String classificacaoIfElse = "";
        String classificacaoTernario = "";

        // Leitura da nota do aluno
        System.out.print("Digite a nota do aluno (de 0 a 10): ");
        if (entrada.hasNextDouble()) {
            nota = entrada.nextDouble();

            // Validação da nota
            if (nota >= 0 && nota <= 10) {
                // Classificação usando if-else encadeado
                if (nota < 5) {
                    classificacaoIfElse = "Reprovado";
                } else if (nota >= 5 && nota <= 6.9) {
                    classificacaoIfElse = "Recuperação";
                } else {
                    classificacaoIfElse = "Aprovado";
                }
                System.out.println("Classificação (if-else): " + classificacaoIfElse);

                // Classificação usando operador ternário
                classificacaoTernario = (nota < 5) ? "Reprovado" : (nota <= 6.9) ? "Recuperação" : "Aprovado";
                System.out.println("Classificação (ternário): " + classificacaoTernario);

            } else {
                System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
            }
        } else {
            System.out.println("Entrada inválida. Digite um número para a nota.");
            entrada.next(); // Limpar o buffer do scanner
        }

        entrada.close();
    }
}
