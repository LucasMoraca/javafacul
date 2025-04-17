package Aula2;

import javax.swing.JOptionPane;

public class opcoesdeoperacoes {
    public static void main(String[] args) {
        double num1, num2, resultado = 0; // Inicializar resultado para evitar erro de compilação

        String[] opcoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        String operacaoSelecionada = (String) JOptionPane.showInputDialog(
                null,
                "Qual operação você deseja?",
                "Operações Matemáticas",
                JOptionPane.QUESTION_MESSAGE, // Usar um tipo de mensagem apropriado
                null,
                opcoes, // Passar o array de opções para a caixa de diálogo
                opcoes[0] // Definir a opção inicial selecionada (opcional)
        );

        if (operacaoSelecionada != null) {
            try {
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor: "));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor: "));

                if (operacaoSelecionada.equals("Soma")) {
                    resultado = num1 + num2;
                } else if (operacaoSelecionada.equals("Subtração")) {
                    resultado = num1 - num2;
                } else if (operacaoSelecionada.equals("Multiplicação")) {
                    resultado = num1 * num2;
                } else if (operacaoSelecionada.equals("Divisão")) {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro! Divisão por zero não permitida.", "Erro", JOptionPane.ERROR_MESSAGE);
                        return; // Encerra a execução do método main
                    }
                }

                JOptionPane.showMessageDialog(null, "O resultado da " + operacaoSelecionada.toLowerCase() + " entre " + num1 + " e " + num2 + " = " + resultado);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, insira números.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
