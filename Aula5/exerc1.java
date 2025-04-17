package Aula5;

import java.util.Scanner; 

public class exerc1 { 
    public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in); 
    System.out.print("Digite seu nome: "); String nome = entrada.nextLine(); 
    System.out.println("-----------------");
    System.out.println("Tabuada da "+nome); 
    System.out.println("-----------------"); 
    /*for: loop
     * i=1: inicialização da variável de controle do loop
     * int i: serve para declarar uma variável inteira
     * =1: Atribui o valor inicial de 1 à variável i. Isso significa que o loop começará com o valor de i sendo 1.
     * i <= 10;: Esta é a condição de continuação do loop.
     * O loop continuará a ser executado enquanto essa condição for verdadeira.
     * i <= 10: Significa que o loop continuará rodando enquanto o valor da variável i for menor ou igual a 10.
     * i++: Esta é a atualização da variável de controle do loop.
     * i++: É um operador de pós-incremento. Ele aumenta o valor da variável i em 1 após cada iteração do loop ser concluída.
     */
    for(int i=1; i <= 10; i++){ 
        int resultado = 5 * i; 
        System.out.println("|5 x " + i + "=" + resultado +"|"); 
        } 
    entrada.close(); 
    } 
}