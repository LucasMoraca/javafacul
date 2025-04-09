package Aula5;

import javax.swing.JOptionPane;

public class exerc3 {
    public static void main(String[] args) {
        String senhaCorreta = "@cris";
        String usuarioCorreto = "123";
        int tentativasRestantes = 3;
        while (tentativasRestantes > 0) {
            String usuarioDigitado =
                    JOptionPane.showInputDialog("Digite o usuário:");
            if (usuarioDigitado == null) {
                break;
            }

            String senhaDigitada =
                    JOptionPane.showInputDialog("Digite a senha:");
            if (senhaDigitada == null) {
                break;
            }

            if (senhaDigitada.equals(senhaCorreta) &&
                    usuarioDigitado.equals(usuarioCorreto)) {
                JOptionPane.showMessageDialog(null, "Pode logar");
                return;
            } else {
                tentativasRestantes--;
                JOptionPane.showMessageDialog(null, "Senha ou " +
                        "login incorretos. Tentativas restantes: " +
                        tentativasRestantes);
            }
        }

        if (tentativasRestantes == 0) {
            JOptionPane.showMessageDialog(null, "Número " +
                    "máximo de tentativas excedido. Acesso bloqueado.");
        }
    }
}
