package POO;

import java.util.Scanner;

public class Pessoa {

    // atributos
    String nome;
    int idade;
    char sexo;
    String faixaEtaria; // Correção no nome do atributo para clareza

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.faixaEtaria = "";
        classificar(); // Correção no nome do método
    }

    public void imprimir() { // Correção no nome do método para seguir o padrão camelCase
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Faixa etária: " + faixaEtaria); // Correção para o nome correto do atributo
    }

    public void classificar() { // Correção no nome do método
        if (idade < 0) {
            this.faixaEtaria = "Erro";
        } else if (idade <= 2) {
            this.faixaEtaria = "Bebê";
        } else if (idade <= 11) {
            this.faixaEtaria = "Criança";
        } else if (idade <= 19) {
            this.faixaEtaria = "Adolescente";
        } else if (idade <= 30) {
            this.faixaEtaria = "Jovem";
        } else if (idade <= 60) {
            this.faixaEtaria = "Adulto";
        } else {
            this.faixaEtaria = "Idoso";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastre seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Cadastre a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        System.out.println("Informe o sexo (M/F): ");
        char sexo = scanner.nextLine().charAt(0);

        Pessoa pessoa = new Pessoa(nome, idade, sexo);
        System.out.println("\nDados da pessoa: "); // Correção na saída
        pessoa.imprimir(); // Correção no nome do método

        scanner.close();
    }
}
