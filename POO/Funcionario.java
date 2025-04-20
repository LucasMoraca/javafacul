package POO;

public class Funcionario {
    
    int idFunc;
    String nomeFunc;
    String departamento;
    String dataContratacao;
    double salario;
    String documento;
    boolean situacao;

    public Funcionario(int idFunc, String nomeFunc, String departamento, String dataContratacao, double salario, String documento, boolean situacao) {
        this.idFunc = idFunc;
        this.nomeFunc = nomeFunc;
        this.departamento = departamento;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
        this.documento = documento;
        this.situacao = situacao;
    }

    public void imprimir() {
        System.out.println("--- Dados do Funcionário ---");
        System.out.println("ID: " + idFunc);
        System.out.println("Nome: " + nomeFunc);
        System.out.println("Departamento: " + departamento);
        System.out.println("Data de Contratação: " + dataContratacao);
        System.out.println("Salário: " + String.format("%.2f", salario));
        System.out.println("Documento: " + documento);
        System.out.println("Situação: " + (situacao ? "Ativo" : "Inativo"));
        System.out.println("--------------------------");
    }

    public void atualizarSalario(double percentual) {
        this.salario *= (1 + percentual / 100);
        System.out.println("Salário de " + this.nomeFunc + " atualizado para: " + this.salario);
    }

    public void verificarSituacao() {
        if (situacao) {
            System.out.println(this.nomeFunc + " está ativo.");
        } else {
            System.out.println(this.nomeFunc + " está inativo.");
        }
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(1, "João da Silva", "Vendas", "2023-01-15", 2500.00, "123.456.789-00", true);
        Funcionario funcionario2 = new Funcionario(2, "Maria Souza", "RH", "2022-05-20", 3200.50, "987.654.321-11", false);

        funcionario1.imprimir();
        funcionario1.atualizarSalario(20);
        funcionario1.verificarSituacao();

        System.out.println("\n");

        funcionario2.imprimir();
        funcionario2.verificarSituacao();
    }
}
