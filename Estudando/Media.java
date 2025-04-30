package Estudando;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);

        float n1, n2, n3, n4, media;

        System.out.println("Nota 1: ");
        n1 = valores.nextFloat();
        System.out.println("Nota 2: ");
        n2 = valores.nextFloat();
        System.out.println("Nota 3: ");
        n3 = valores.nextFloat();
        System.out.println("Nota 4: ");
        n4 = valores.nextFloat();
        media = ((n1 + n2 + n3 + n4)/4);
        System.out.println("Média: "+media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        valores.close();
    }
}
