package Estudando;

import javax.swing.JOptionPane;

public class imcestruturado {
    public static void main(String[] args) {
        float peso, altura, imc;

        peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso em Kg: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura em metros: "));
        imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "O resultado do IMC é "+imc, "Valor do IMC", JOptionPane.INFORMATION_MESSAGE, null);

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Abaixo do peso", "Estrutura corporal", JOptionPane.INFORMATION_MESSAGE, null);
        }else if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "Peso normal", "Estrutura corporal", JOptionPane.INFORMATION_MESSAGE, null);
        }else if (imc >= 25 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "Sobrepeso", "Estrutura corporal", JOptionPane.INFORMATION_MESSAGE, null);
        }else{
            JOptionPane.showMessageDialog(null, "Obesidade", "Estrutura corporal", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }
}
