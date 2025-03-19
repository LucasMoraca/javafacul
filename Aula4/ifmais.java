package Aula4;

//importando a bibliote
import javax.swing.JOptionPane;

public class ifmais {
    //código público, estático, sem retorno e nomeado main
    public static void main (String[]args){
        //declarando variável
        double nota;
        //apresentando a menssage pedindo o valor da variável
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da nota: "));
        if(nota >= 90){
            JOptionPane.showMessageDialog(null, "Parabéns");
            JOptionPane.showMessageDialog(null, "Conceito A");
        }
        else if (nota >= 80){
            JOptionPane.showMessageDialog(null, "Conceito B");
        }
        else if (nota >= 70){
            JOptionPane.showMessageDialog(null, "Conceito C");
        }
        else{
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}
