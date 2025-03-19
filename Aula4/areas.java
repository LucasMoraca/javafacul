package Aula4;

//importando a bibliote
import javax.swing.JOptionPane;

public class areas {
    //código público, estático, sem retorno e nomeado main
    public static void main (String[]args){
        //declarando variável
        double area, lado, raio, base, altura, esc;
        //apresentando uma mensaggem
        esc = Double.parseDouble(JOptionPane.showInputDialog("Esolha a área que queira calcular: [1]círculo, [2]quadrado, [3]triângulo"));
        //condições
        if (esc == 1){
            raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio: "));
            area = Math.PI * Math.pow(raio, 2);
            JOptionPane.showMessageDialog(null, "A área é "+area+" u2");
        }
        else if (esc == 2){
           lado = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do lado: "));
           area = Math.pow(lado, 2);
           JOptionPane.showMessageDialog(null, "A área é "+area+" u2");
        }
        else if (esc == 3){
            base = Double.parseDouble(JOptionPane.showInputDialog("Insira a base: "));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura: "));
            area = (base*altura)/2;
            JOptionPane.showMessageDialog(null, "A área é "+area+" u2");
        }
        else{
            JOptionPane.showMessageDialog(null, "Valor inválido");
        }
    }
}
