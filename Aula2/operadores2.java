package Aula2;

//importando a biblioteca
import java.util.Scanner;

public class operadores2 {
    //código público, estático, sem retorno e nomeado main
    public static void main (String[]args){
        //A linha de código cria um objeto Scanner para ler dados da entrada padrão
        Scanner entrada = new Scanner (System.in);
        //declarando as variáveis
        int num1, num2, num3, num4, num5, num6;

        //solicitando e lendo o primeiro par de números para soma
        System.out.print("Digite o primeiro número para soma: ");
        num1 = entrada.nextInt();
        System.out.print("Digite o segundo número para soma: ");
        num2 = entrada.nextInt();
        //somando as variáveis e exibindo o resultado
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        //pulando linha
        System.out.println();

        //solicitando e lendo o primeiro par de números para subtração
        System.out.print("Digite o primeiro número para subtração: ");
        num3 = entrada.nextInt();
        System.out.print("Digite o segundo número para subtração: ");
        num4 = entrada.nextInt();
        //subtraindo as variáveis e exibindo o resultado
        System.out.println(num3+" - "+num4+" = "+(num3-num4));
        //pulando linha
        System.out.println();

        //solicitando e lendo o primeiro par de números para multiplicação
        System.out.print("Digite o primeiro número para multiplicação: ");
        num5 = entrada.nextInt();
        System.out.print("Digite o segundo número para multiplicação: ");
        num6 = entrada.nextInt();
        //multiplicando as variáveis e exibindo o resultado
        System.out.println(num5+" X "+num6+" = "+(num5*num6));

        entrada.close(); // Boa prática: fechar o Scanner
    }
}
