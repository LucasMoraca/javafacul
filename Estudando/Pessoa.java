package Estudando;

import java.util.Scanner;

// Removi a importação de Aula7.pessoa, pois parece ser um erro ou não utilizado

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private String fe;

    public Pessoa (String nome, int idade, char sexo, String fe){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.fe = fe; // Correção: Atribuindo o valor passado para 'fe'
        classificar();
    }

    // Sobrecarga do construtor para o main (sem o parâmetro 'fe')
    public Pessoa (String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.fe = ""; // Inicializa 'fe' com uma string vazia
        classificar();
    }

    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
        System.out.println("Faixa etária: "+fe);
    }

    public void classificar(){
        if (idade < 0) {
            this.fe = "Erro";
        }else if (idade <= 2) {
            this.fe = "Bebê";
        }else if (idade <= 11) {
            this.fe = "Criança";
        }else if (idade <= 19) {
            this.fe = "Adolescente";
        }else if (idade <= 30) {
            this.fe = "Jovem";
        }else if (idade <= 60) {
            this.fe = "Adulto";
        }else{
            this.fe = "Idoso";
        }
    }

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Seu nome: ");
        String nome = dados.nextLine();

        System.out.println("Sua idade: ");
        int idade = dados.nextInt();
        dados.nextLine(); // Consome a quebra de linha deixada por nextInt()

        System.out.println("Sexo (M/F): ");
        char sexo = dados.nextLine().charAt(0);

        Pessoa pessoa = new Pessoa(nome, idade, sexo);
        System.out.println("\n Dados: ");
        pessoa.imprimir();
        dados.close();
    }
}