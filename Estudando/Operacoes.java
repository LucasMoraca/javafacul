package Estudando;

import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);
        float num1, num2;
        System.out.println("Insira o primeiro valor: ");
        num1 = valores.nextFloat();
        System.out.println("Insira o segundo valor: ");
        num2 = valores.nextFloat();
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
        System.out.println(num1+" / "+num2+" = "+(num1/num2));
        valores.close();
    }
}
