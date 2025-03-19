package Aula2;

//importando biblioteca
import java.util.Scanner;

public class soma2 {
    //código público, estático, sem retorno e nomeado main
    public static void main(String[] argns){
        //A linha de código cria um objeto Scanner para ler dados da entrada padrão
        Scanner entrada = new Scanner(System.in);
        //declarando a variável
        int num1, num2;
        //adicionando um valor a uma variável
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        //adicionando um valor a uma variável
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();
        //pulando linha
        System.out.println();
        //somando as variáveis
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }
}
