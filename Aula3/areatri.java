package Aula3;

//importando a biblioteca
import javax.swing.JOptionPane;

public class areatri {
    public static void main(String[]argns){
        //delcarando a varável
        double base, alt, area;
        //inserção de valores
        base = Double.parseDouble(JOptionPane.showInputDialog("Insira a base: "));
        alt = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura: "));
        //cálculo da área
        area = (base*alt)/2;
        //apresentando o resultado
        JOptionPane.showMessageDialog(null, "A área é "+area+" u2");
    }
}
