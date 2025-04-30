package Aula7;

public class testepessoa {
    public static void main(String[] args) {
        
        //adicionando as classes e criando objetos da classe
        pessoa p1 = new pessoa();
        aluno a1 = new aluno();

        //chamando as variáveis das classes
        p1.nome = "Lucas";
        p1.idade = 18;
        a1.ra = 77;
        a1.curso = "Ciencia da computacao";
        a1.disciplina = "Programacao";
        a1.nota1 = 7.0f;
        a1.nota2 = 8.5f;
        
        //mandando exibir os resultados das variáveis
        p1.exibirDados();
        a1.exibirDadosAlunos();
    }
}
