package Aula3;

//importando a biblioteca
import javax.swing.JOptionPane;

public class areaqua {
    public static void main(String[]argns){
        //delcarando a varável
        double lado, area;
        //inserção de valores
        lado = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do lado: "));
        //cálculo da área
        area = Math.pow(lado, 2);
        //apresentando o resultado
        JOptionPane.showMessageDialog(null, "A área é "+area+" u2");
    }
}
