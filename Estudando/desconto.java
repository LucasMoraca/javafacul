package Estudando;

import javax.swing.JOptionPane;

public class desconto {
    public static void main(String[] args) {
        //Declarando como float para n dar muitas casas decimais e arredondar de forma automática
        float compra;

        compra = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da compra: "));

        if (compra >= 200) {
            float desconto = compra * 0.10f;
            compra -= desconto; //compra = compra - desconto;
            JOptionPane.showMessageDialog(null, "Valor final da compra: " + compra);
        }else{
            JOptionPane.showMessageDialog(null, "Valor final da compra: " + compra);
        }
    }
}
