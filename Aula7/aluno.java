package Aula7;

public class aluno extends pessoa{
    
    //variáveis
    String curso, disciplina, resultado;
    float nota1, nota2, media;
    int ra;

    //método
    void exibirDadosAlunos(){
        System.out.println("\n ##### Dados #####");

        System.out.println("Curso: "+curso);
        System.out.println("Disciplina: "+disciplina);
        System.out.println("RA: "+ra);
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        
        media = (nota1 + nota2)/2;
        System.out.println("Média: "+media);

        if (media < 7) {
            resultado = "Reprovado";
        }else{
            resultado = "Aprovado";
        }
        System.out.println("Resultado: "+resultado);
    }
}
