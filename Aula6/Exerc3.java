package Aula6;

import javax.swing.JOptionPane;

public class Exerc3 {
    public static void main(String[] args) {

        String pesoStr = JOptionPane.showInputDialog("Digite o seu peso em kg:");
        String alturaStr = JOptionPane.showInputDialog("Digite a sua altura em metros:");

        try {
            double peso = Double.parseDouble(pesoStr);
            double altura = Double.parseDouble(alturaStr);

            if (altura <= 0 || peso <= 0) {
                JOptionPane.showMessageDialog(null, "Peso e altura devem ser valores positivos.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double imc = peso / (altura * altura);

            String classificacao;

            if (imc < 18.5) {
                classificacao = "Abaixo do peso";
            } else if (imc >= 18.5 && imc <= 24.9) {
                classificacao = "Peso normal";
            } else if (imc >= 25 && imc <= 29.9) {
                classificacao = "Sobrepeso";
            } else {
                classificacao = "Obesidade";
            }

            JOptionPane.showMessageDialog(null, String.format("Seu IMC é: %.2f\nClassificação: %s", imc, classificacao), "Resultado do IMC", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite números para peso e altura.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
