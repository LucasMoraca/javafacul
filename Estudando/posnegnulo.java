package Estudando;

import java.util.Scanner;

public class posnegnulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero;

        System.out.print("Digite o valor a ser analisado: ");
        //para a variável ser validada no scanner deve acertar o next dela de acordo com a variável declarada
        numero = entrada.nextDouble();

        if (numero > 0) {
            System.out.println("Valor positivo");
        }else if (numero < 0) {
            System.out.println("Valor negativo");
        }else{
            System.out.println("Valor nulo");
        }
        entrada.close();
    }
}
