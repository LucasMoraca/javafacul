package Aula2;

//importando a biblioteca
import java.util.Scanner;

public class operadores {
    //código público, estático, sem retorno e nomeado main
    public static void main (String[]args){
        //A linha de código cria um objeto Scanner para ler dados da entrada padrão
        Scanner entrada = new Scanner (System.in);
        //declarando as variáveis
        int num1, num2;
        //solicitando e lendo o primeiro valor
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        //solicitando e lendo o segundo valor
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();
        //pulando linha
        System.out.println();
        //somando as variáveis e exibindo o resultado
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        //subtraindo as variáveis e exibindo o resultado
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
        //multiplicando as variáveis e exibindo o resultado
        System.out.println(num1+" X "+num2+" = "+(num1*num2));

        entrada.close(); // Boa prática: fechar o Scanner
    }
}
