package Aula5;

import javax.swing.JOptionPane;

public class exemplo2 {
    public static void main(String[] args) {
        String a, b;
        float x, y, res;
        a = JOptionPane.showInputDialog("Digite o primeiro número: ");
        x = Float.parseFloat(a);
        b = JOptionPane.showInputDialog("Digite o segundo número: ");
        y = Float.parseFloat(b);
        res = x + y;
        JOptionPane.showMessageDialog(null, "O resultado da some é "+res);
    }
}

/*public static void main(String[] args) {
 *  float x, y, res;
 *  x = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
 *  y = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));
 *  res = x + y;
 *  JOptionPane.showMessageDialog(null, "O resultado da some é "+res);
 */