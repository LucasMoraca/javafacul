package POO;

public class AlunoTestar {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();

        //aluno1.nome = "Fernanda";
        aluno1.setNome("Fernanda");

        System.out.println(aluno1.getNome());

        //aluno1.idade = 10; ao usar o metodo getter e setter serve para trazer maior segurança e poder acrescentar restrições
        aluno1.setIdade(500);

    }
}
