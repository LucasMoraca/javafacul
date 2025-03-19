package Aula2;

//importando a biblioteca
import java.util.Scanner;

public class operadores2 {
    //código público, estático, sem retorno e nomeado main
    public static void main (String[]args){
        //A linha de código cria um objeto Scanner para ler dados da entrada padrão
        Scanner entrada = new Scanner (System.in);
        //declarando a variável
        int num1, num2, num3, num4, num5, num6;
        
        //adicionando um valor a uma variável
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        //adicionando um valor a uma variável
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();      
        //somando as variáveis
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        //pulando linha
        System.out.println();
        
        //adicionando um valor a uma variável
        System.out.print("Digite o primeiro número: ");
        num3 = entrada.nextInt();
        //adicionando um valor a uma variável
        System.out.print("Digite o segundo número: ");
        num4 = entrada.nextInt(); 
        //subitraindo as variáveis
        System.out.println(num3+" - "+num4+" = "+(num3-num4));
        //pulando linha
        System.out.println();
        
        //adicionando um valor a uma variável
        System.out.print("Digite o primeiro número: ");
        num5 = entrada.nextInt();
        //adicionando um valor a uma variável
        System.out.print("Digite o segundo número: ");
        num6 = entrada.nextInt();
        //multiplicando as variáveis
        System.out.println(num5+" X "+num6+" = "+(num5*num6));
    }
}
