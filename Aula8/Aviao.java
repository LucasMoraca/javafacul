package Aula8;

public class Aviao {
    private int totalHorasAtividade;
    private int horasDesdeUltimaRevisao;
    private static final int INTERVALO_REVISAO = 200;

    public Aviao() {
        this.totalHorasAtividade = 0;
        this.horasDesdeUltimaRevisao = 0;
    }

    public void fazVoo(int horas, Piloto piloto) {
        if (horasDesdeUltimaRevisao >= INTERVALO_REVISAO) {
            System.out.println("Aviso: O avião precisa de revisão antes de voar.");
            return;
        }

        System.out.println("Iniciando voo de " + horas + " horas com o piloto " + piloto.getNome() + ".");
        this.totalHorasAtividade += horas;
        this.horasDesdeUltimaRevisao += horas;
        piloto.adicionaHoras(horas);
        System.out.println("Voo de " + horas + " horas finalizado.");
    }

    public void fazRevisao() {
        System.out.println("Avião passando por revisão.");
        this.horasDesdeUltimaRevisao = 0;
    }

    public void imprime() {
        System.out.println("Total de Horas de Atividade do Avião: " + totalHorasAtividade);
        if (horasDesdeUltimaRevisao >= INTERVALO_REVISAO) {
            System.out.println("Status: Precisa de revisão.");
        } else {
            System.out.println("Status: Não precisa de revisão.");
        }
    }
}