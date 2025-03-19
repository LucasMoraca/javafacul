package Aula4;

//importando a bibliote
import javax.swing.JOptionPane;

public class imc {
    //código público, estático, sem retorno e nomeado main
    public static void main (String[]args){
        //declarando variável
        double peso, alt, IMC;
        /*apresentando a menssage pedindo o valor da variável*/
        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe a massa em KG: "));
        //apresentando a menssage pedindo o valor da variável
        alt = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura em m: "));
        IMC = peso/(Math.pow(alt, 2));
        //se a informção coincidir com o detalhe apresente tal menssagem
        if (IMC >= 25){
            JOptionPane.showMessageDialog(null, "Porco");
        }
        //se a informção coincidir com o detalhe apresente tal menssagem
        else if (IMC >= 20){
            JOptionPane.showMessageDialog(null, "Normal");
        }
        //se a informção coincidir com o detalhe apresente tal menssagem
        else{
            JOptionPane.showMessageDialog(null, "Esqueleto");
        }
    }
}
