package Aula4;

//importando a bibliote
import javax.swing.JOptionPane;

public class condic {
    //código público, estático, sem retorno e nomeado main
    public static void main (String[]args){
        //declarando variável
        double nota;
        //apresentando a menssage pedindo o valor da variável
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: "));
        //se a nota for >= 70 apresenta a menssagem
        if(nota >= 70){
            JOptionPane.showMessageDialog(null, "Aprovado");
        }
    }
}
