package Aula4;

import javax.swing.JOptionPane;

public class caseareas {
    public static void main(String[] args) {
        double area = 0;
        float lado = 0, base = 0, raio = 0, altura = 0;
        double esc;

        String primeiraEntrada = JOptionPane.showInputDialog("Escolha a área que queira calcular: [1]círculo, [2]quadrado, [3]triângulo");
        if (primeiraEntrada == null) {
            System.exit(0);
            return;
        }
        esc = Double.parseDouble(primeiraEntrada);

        while (esc < 1 || esc > 3) {
            JOptionPane.showMessageDialog(null, "Opção inválida");
            String input = JOptionPane.showInputDialog("Escolha a área que queira calcular: [1]círculo, [2]quadrado, [3]triângulo");
            if (input == null) {
                System.exit(0);
                return;
            }
            esc = Double.parseDouble(input);
        }

        switch ((int) esc) { // Cast para int dentro dos parênteses
            case 1:
                String raioStr = JOptionPane.showInputDialog("Insira o valor do raio: ");
                if (raioStr == null) return;
                raio = Float.parseFloat(raioStr);
                area = (Math.PI * Math.pow(raio, 2));
                JOptionPane.showMessageDialog(null, "A área é " + area + " cm²");
                break;
            case 2:
                String ladoStr = JOptionPane.showInputDialog("Insira o valor do lado: ");
                if (ladoStr == null) return;
                lado = Float.parseFloat(ladoStr);
                area = Math.pow(lado, 2);
                JOptionPane.showMessageDialog(null, "A área é " + area + " cm²");
                break;
            case 3:
                String baseStr = JOptionPane.showInputDialog("Insira o valor da base: ");
                if (baseStr == null) return;
                String alturaStr = JOptionPane.showInputDialog("Insira o valor da altura: ");
                if (alturaStr == null) return;
                base = Float.parseFloat(baseStr);
                altura = Float.parseFloat(alturaStr);
                area = ((base * altura) / 2);
                JOptionPane.showMessageDialog(null, "A área é " + area + " cm²");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
}