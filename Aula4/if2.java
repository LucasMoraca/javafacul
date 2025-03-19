package Aula4;

//importando a bibliote
import javax.swing.JOptionPane;

public class if2 {
    //código público, estático, sem retorno e nomeado main
    public static void main (String[]args){
        //declarando variável
        double avaliar;
        //apresentando a menssage pedindo o valor da variável
        avaliar = Double.parseDouble(JOptionPane.showInputDialog("Digite o número: "));
        //se a nota for >= 80 apresenta a menssagem
        if(avaliar >= 80){
            JOptionPane.showMessageDialog(null, "Legal");
        }else{ //caso o if não aconteça aparecerar a menssagem do else
            JOptionPane.showMessageDialog(null, "Ruim");
        }
    }
}
