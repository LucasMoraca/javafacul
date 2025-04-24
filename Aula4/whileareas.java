package Aula4;

import javax.swing.JOptionPane;

public class whileareas {
    public static void main(String[] args) {
        float area = 0; // Inicializar para evitar problemas futuros
        double lado, base, raio, altura, esc; // Use double para consistência com Double.parseDouble

        String primeiraEntrada = JOptionPane.showInputDialog("Escolha a área que queira calcular: [1]círculo, [2]quadrado, [3]triângulo");
        if (primeiraEntrada == null) { // Trata o caso de cancelar na primeira entrada
            System.exit(0);
            return;
        }
        esc = Float.parseFloat(primeiraEntrada);

        while (esc < 1 || esc > 3) {
            JOptionPane.showMessageDialog(null, "Opção inválida");
            String input = JOptionPane.showInputDialog("Escolha a área que queira calcular: [1]círculo, [2]quadrado, [3]triângulo");
            if (input == null) {
                System.exit(0);
                return;
            }
            esc = Float.parseFloat(input);
        }

        if (esc == 1) {
            String raioStr = JOptionPane.showInputDialog("Insira o valor do raio: ");
            if (raioStr == null) return; // Trata o caso de cancelar
            raio = Double.parseDouble(raioStr);
            area = (float) (Math.PI * Math.pow(raio, 2));
            JOptionPane.showMessageDialog(null, "A área é " + area + " u2");
        } else if (esc == 2) {
            String ladoStr = JOptionPane.showInputDialog("Insira o valor do lado: ");
            if (ladoStr == null) return; // Trata o caso de cancelar
            lado = Double.parseDouble(ladoStr);
            area = (float) Math.pow(lado, 2);
            JOptionPane.showMessageDialog(null, "A área é " + area + " u2");
        } else if (esc == 3) {
            String baseStr = JOptionPane.showInputDialog("Insira a base: ");
            if (baseStr == null) return; // Trata o caso de cancelar
            String alturaStr = JOptionPane.showInputDialog("Insira a altura: ");
            if (alturaStr == null) return; // Trata o caso de cancelar
            base = Double.parseDouble(baseStr);
            altura = Double.parseDouble(alturaStr);
            area = (float) ((base * altura) / 2);
            JOptionPane.showMessageDialog(null, "A área é " + area + " u2");
        }
        // A condição 'else' aqui é redundante, pois o loop 'while' já garante que 'esc' está entre 1 e 3
        // else {
        //     JOptionPane.showMessageDialog(null, "Valor inválido");
        // }
    }
}