package Estudando;

import javax.swing.JOptionPane;

public class desafio1{
    public static void main(String[] args) {
        String[] opcoes = {"Suporte técnico", "Financeiro", "Falar com atendimento", "Cancelar serviço", "Encerrar atendimento"};
        int escolha;

        do {
            escolha = JOptionPane.showOptionDialog(
                    null, // Componente pai (null para centralizar na tela)
                    "Selecione a opção desejada:", // Mensagem a ser exibida
                    "MENU DE ATENDIMENTO", // Título da janela
                    JOptionPane.DEFAULT_OPTION, // Tipo de opção (padrão)
                    JOptionPane.PLAIN_MESSAGE, // Tipo de mensagem (plana)
                    null, // Ícone (null para usar o padrão)
                    opcoes, // Array de opções
                    opcoes[4]); // Opção padrão (Encerrar atendimento)

            switch (escolha) {
                case 0: // Suporte técnico (índice 0 do array)
                    JOptionPane.showMessageDialog(null, "Você selecionou: Suporte técnico. Por favor, aguarde enquanto um técnico está disponível.");
                    // Aqui você colocaria a lógica para direcionar para o suporte técnico
                    break;
                case 1: // Financeiro (índice 1 do array)
                    JOptionPane.showMessageDialog(null, "Você selecionou: Financeiro. Em que podemos ajudar com questões financeiras?");
                    // Aqui você colocaria a lógica para direcionar para o setor financeiro
                    break;
                case 2: // Falar com atendimento (índice 2 do array)
                    JOptionPane.showMessageDialog(null, "Você selecionou: Falar com atendimento. Um de nossos atendentes estará disponível em breve.");
                    // Aqui você colocaria a lógica para direcionar para o atendimento
                    break;
                case 3: // Cancelar serviço (índice 3 do array)
                    JOptionPane.showMessageDialog(null, "Você selecionou: Cancelar serviço. Para prosseguir com o cancelamento, por favor, forneça seu CPF ou CNPJ.");
                    // Aqui você colocaria a lógica para iniciar o processo de cancelamento
                    break;
                case 4: // Encerrar atendimento (índice 4 do array)
                    JOptionPane.showMessageDialog(null, "Atendimento encerrado. Obrigado pelo contato!");
                    break;
                default: // Opção inválida (quando o usuário fecha a janela sem escolher)
                    if (escolha != JOptionPane.CLOSED_OPTION) {
                        JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
            }

        } while (escolha != 4 && escolha != JOptionPane.CLOSED_OPTION); // Loop continua até Encerrar ou fechar

        System.exit(0); // Encerra a aplicação Java Swing
    }
}