package POO;

public class Conta {
    private int numeroConta;
    private double saldo;
    private double limite;

    public Conta(int numeroConta, double saldo, double limite) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= (saldo + limite)) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void imprimirExtrato() {
        System.out.println("--- Extrato da Conta " + numeroConta + " ---");
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Limite: R$" + limite);
        System.out.println("Saldo Disponível: R$" + (saldo + limite));
        System.out.println("---------------------------");
    }

    public double consultarSaldoDisponivel() {
        return saldo + limite;
    }

    public static void main(String[] args) {
        Conta minhaConta = new Conta(12345, 1000.0, 500.0);

        minhaConta.depositar(500.0);
        minhaConta.sacar(200.0);
        minhaConta.imprimirExtrato();
        System.out.println("Saldo Disponível: R$" + minhaConta.consultarSaldoDisponivel());
    }
}