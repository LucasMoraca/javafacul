package Aula2;

//importando a biblioteca
import java.util.Scanner;

public class operadores {
    //código público, estático, sem retorno e nomeado main
    public static void main (String[]args){
        //A linha de código cria um objeto Scanner para ler dados da entrada padrão
        Scanner entrada = new Scanner (System.in);
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
        //subitraindo as variáveis
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
        //multiplicando as variáveis
        System.out.println(num1+" X "+num2+" = "+(num1*num2));
    }
}
