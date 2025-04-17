package Aula4;

import javax.swing.JOptionPane;

public class opcoesareas {
    public static void main(String[] args) {
        double area = 0; // Inicializar area para ter um valor padrão
        double lado, raio, base, altura;

        String[] areas = {"Círculo", "Quadrado", "Triângulo"};
        String operacaoSelecionada = (String) JOptionPane.showInputDialog(
                null,
                "Qual area você deseja?",
                "Áreas de figuras planas",
                JOptionPane.QUESTION_MESSAGE,
                null,
                areas,
                areas[0]
        );

        if (operacaoSelecionada != null) {
/*a função do bloco try é definir uma seção de código onde podem ocorrer exceções (erros). 
*Ele faz parte de um mecanismo de tratamento de erros chamado try-catch (e opcionalmente finally). */
            try {
                if (operacaoSelecionada.equals("Círculo")) {
                    String raioStr = JOptionPane.showInputDialog("Insira o valor do raio: ");
//usamos primeiro string para minimizar a tratativa de erros na adesão dos dados, pois o JOptionPane tem tendências a receber strings não doubles
                    if (raioStr != null) {
                        raio = Double.parseDouble(raioStr);
                        area = Math.PI * Math.pow(raio, 2);
                        JOptionPane.showMessageDialog(null, "A área do círculo é " + String.format("%.2f", area) + " cm²");
                    }
                } else if (operacaoSelecionada.equals("Quadrado")) {
                    String ladoStr = JOptionPane.showInputDialog("Insira o valor do lado: ");
                    if (ladoStr != null) {
                        lado = Double.parseDouble(ladoStr);
                        area = Math.pow(lado, 2);
                        JOptionPane.showMessageDialog(null, "A área do quadrado é " + String.format("%.2f", area) + " cm²");
                    }
                } else if (operacaoSelecionada.equals("Triângulo")) {
                    String baseStr = JOptionPane.showInputDialog("Insira a base: ");
                    String alturaStr = JOptionPane.showInputDialog("Insira a altura: ");
                    if (baseStr != null && alturaStr != null) {
                        base = Double.parseDouble(baseStr);
                        altura = Double.parseDouble(alturaStr);
                        area = (base * altura) / 2;
                        JOptionPane.showMessageDialog(null, "A área do triângulo é " + String.format("%.2f", area) + " cm²");
                    }
                }
/*O bloco catch em programação é a parte do mecanismo de tratamento de exceções
* (try-catch) responsável por capturar e lidar com as exceções que podem ocorrer dentro do bloco try associado. */
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, insira um número.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}