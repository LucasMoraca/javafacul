package Aula5;
import javax.swing.JOptionPane;
public class exerc2 {
    public static void main(String[] args) {
        float produto;
        produto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do artigo: "));
        if (produto > 10000){
            float desconto = produto * 0.40f;
            produto -= desconto; // Aplica o desconto
            JOptionPane.showMessageDialog(null, "Valor final do artigo: " + produto);
        } else if (produto > 5000 && produto <= 10000){
            float desconto = produto * 0.20f;
            produto -= desconto; // Aplica o desconto
            JOptionPane.showMessageDialog(null, "Valor final do artigo: " + produto);
        } else if (produto > 2500 && produto < 5000){
            float desconto = produto * 0.10f;
            produto -= desconto;
            JOptionPane.showMessageDialog(null, "Valor final do artigo: " + produto);
        } else {
            float desconto = produto * 0.05f;
            produto -= desconto;
            JOptionPane.showMessageDialog(null, "Valor final do artigo: " + produto);
        }

    }
}
