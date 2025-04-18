package Estudando;

import java.util.Scanner;

public class omaior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2, num3, maiorIfElse, maiorTernario;

        System.out.println("Digite o primeiro número inteiro: ");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        num2 = entrada.nextInt();

        System.out.println("Digite o terceiro número inteiro: ");
        num3 = entrada.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            maiorIfElse = num1;
        }else if (num2 >= num1 && num2 >= num3){
            maiorIfElse = num2;
        }else{
            maiorIfElse = num3;
        }
        System.out.println("O maior número (if-else) é: "+maiorIfElse);

        maiorTernario = (num1 >= num2) ?
                        (num1 >= num3 ? num1 : num3) :
                        (num2 >= num3 ? num2 : num3);
        System.out.println("O maior número (ternário) é: "+ maiorTernario);

        entrada.close();
    }    
}
