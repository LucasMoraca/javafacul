package Aula3;

//importando a biblioteca
import javax.swing.JOptionPane;

public class areacir {
    public static void main(String[]argns){
        //delcarando a varável
        double raio, area;
        //declarando a variável
        raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio: "));
        //cálculo da área
        area = Math.PI * Math.pow(raio, 2);
        //apresentando o resultado
        JOptionPane.showMessageDialog(null, "A área é "+area+" u2");
    }
}
