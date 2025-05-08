package Aula8;

public class Piloto {
    private String nome;
    private int horasDeVoo;

    public Piloto(String nome) {
        this.nome = nome;
        this.horasDeVoo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasDeVoo() {
        return horasDeVoo;
    }

    public void adicionaHoras(int horas) {
        this.horasDeVoo += horas;
    }

    public void imprime() {
        String tipoPiloto;
        if (horasDeVoo <= 200) {
            tipoPiloto = "Co-piloto";
        } else {
            tipoPiloto = "Comandante";
        }
        System.out.println("Nome do Piloto: " + nome);
        System.out.println("Total de Horas de Voo: " + horasDeVoo);
        System.out.println("Tipo de Piloto: " + tipoPiloto);
    }
}
