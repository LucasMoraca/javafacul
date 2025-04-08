package Aula5;

import java.util.Scanner; 

public class exerc1 { 
    public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in); 
    System.out.print("Digite seu nome: "); String nome = entrada.nextLine(); 
    System.out.println("-----------------");
    System.out.println("Tabuada da "+nome); 
    System.out.println("-----------------"); 
    for(int i=1; i <= 10; i++){ 
        int resultado = 5* i; 
        System.out.println("|5 x " + i + "=" + resultado +"|"); 
        } 
    entrada.close(); 
    } 
}