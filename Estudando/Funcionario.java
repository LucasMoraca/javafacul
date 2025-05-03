package Estudando;

import java.util.Scanner;

public class Funcionario {
    int id;
    String nome;
    String departamento;
    double salario;
    String documento;
    boolean sit;

    public Funcionario(int id, String nome, String departamento, double salario, String documento, boolean sit){
        this.id = id;
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.documento = documento;
        this.sit = sit;
    }

    public void ExibirFuncionario(){
        System.out.println("ID: "+id);
        System.out.println("Nome: "+nome);
        System.out.println("Departamento: "+departamento);
        System.out.println("Salário: "+salario);
        System.out.println("Documento: "+documento);
        System.out.println("Situação: " + (sit ? "Ativo" : "Inativo"));
    }

    public void atualizarSalario(double percentual) {
        this.salario *= (1 + percentual / 100);
        System.out.println("Salário de " + this.nome + " atualizado para: " + this.salario);
    }

    public void verificarSituacao() {
        if (sit) {
            System.out.println(this.nome + " está ativo.");
        } else {
            System.out.println(this.nome + " está inativo.");
        }
    }

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("ID: ");
        int id = dados.nextInt();
        dados.nextLine(); // Consome a quebra de linha deixada por nextInt()
        System.out.println("Nome: ");
        String nome = dados.nextLine();
        System.out.println("Departamento: ");
        String departamento = dados.nextLine();
        System.out.println("Salário: ");
        double salario = dados.nextDouble();
        dados.nextLine(); // Consome a quebra de linha deixada por nextDouble()
        System.out.println("Documento: ");
        String documento = dados.nextLine();
        System.out.println("Situação (true/false): ");
        boolean sit = dados.nextBoolean();

        Funcionario funcionario = new Funcionario(id, nome, departamento, salario, documento, sit);
        funcionario.ExibirFuncionario(); // Correção: Chamando o método no objeto 'funcionario'
        System.out.println("Digite o percentual de aumento para o salário (ex: 10 para 10%): ");
        double percentual = dados.nextDouble();
        funcionario.atualizarSalario(percentual); // Correção: Chamando o método no objeto 'funcionario'
        funcionario.verificarSituacao(); // Correção: Chamando o método no objeto 'funcionario'
        dados.close();
    }
}